class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int ans = 0,cnt = 0;
        for(int i = 0;i<answers.length;i++){
           if(i ==0 || answers[i] != answers[i-1] || cnt ==0){
            ans += answers[i] +1;
            cnt = answers[i];

           }else{
            cnt--;
           }
        }
        return ans;
    }
}