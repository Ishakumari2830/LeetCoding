class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> ans = new ArrayList<>();
     Arrays.sort(nums1);
     Arrays.sort(nums2);
        int i =0,j=0;
        while(i<nums1.length && j <nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else
             if(nums1[i]>nums2[j]){
                j++;
            }
            else {
            ans.add(nums1[i]);
            i++;
            j++;
            }
        }
        int[] result = new int[ans.size()];
        int k =0;
        for(Integer num:ans){
            result[k++]=num;
        }
        return result;
        }

        

    }
