class Solution {
    public int longestSquareStreak(int[] nums) {
        int max = -1;
        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
        }
        List<Integer> setArr = new ArrayList<>(s);
        Collections.sort(setArr);

        for(int i =0;i<setArr.size();i++){
            int curr = setArr.get(i);
            int cnt = 0;
            while(s.contains(curr)){
                s.remove(curr);
                curr = curr*curr;
                cnt ++;
            }
            max = Math.max(max,cnt);
        }
        return max > 1 ? max : -1;
    }
}