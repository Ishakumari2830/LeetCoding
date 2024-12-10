class Solution {
    public int maximumLength(String s) {
        List<String> subarray = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            int ind = i;
            while(ind <s.length() && s.charAt(i)==s.charAt(ind)){
                subarray.add(s.substring(i,ind+1));
                ind++;
            }
        }
        Map<String,Integer> count = new HashMap<>();
        for(String sub : subarray){
            count.put(sub, count.getOrDefault(sub,0)+1);

        }
        int maxi = 0;
        for(Map.Entry<String,Integer> entry : count.entrySet()){
            String substr = entry.getKey();
            int cnt = entry.getValue();

            if(cnt >= 3){
                maxi = Math.max(maxi, substr.length());
            }
        }
        return maxi == 0 ? -1 : maxi;
    }
}