class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int a =0;
        int b = skill.length-1;
         int sum = skill[a] + skill[b];
        long prd =0;
        while(a<b){
            if(skill[a]+skill[b]==sum){
                prd += (long)skill[a]*(long)skill[b];
                a++;b--;

              
            }
            else
            return -1;
        }
        return prd;
    }
}