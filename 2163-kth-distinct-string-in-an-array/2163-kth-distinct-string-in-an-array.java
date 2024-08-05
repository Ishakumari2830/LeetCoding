class Solution {
    public String kthDistinct(String[] arr, int k) {
          
        HashMap<String, Integer> mpp = new HashMap<>();

        // Count the frequency of each string in the array
        for (int i = 0; i < arr.length; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        // Traverse the array to find the k-th distinct string
        for (String str : arr) {
            if (mpp.get(str) == 1) {
                k--;
                if (k == 0) {
                    return str;
                }
            }
        }

        return "";
    }
}