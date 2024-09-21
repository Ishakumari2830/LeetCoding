class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =1;i<=n;i++){
            res.add(i);
        
        }
        Collections.sort(res, (a,b)-> String.valueOf(a).compareTo(String.valueOf(b)));
       return res;
    }
}