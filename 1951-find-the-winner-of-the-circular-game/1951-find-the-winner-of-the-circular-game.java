class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> circle = new LinkedList<Integer>();
        for(int i = 1;i<=n;i++){
            circle.add(i);
        }

        int ind = 0;
        while(circle.size()>1){
            int rmvind = (ind + k -1)% circle.size();
            circle.remove(rmvind);
            ind = rmvind;
        }
        return circle.getFirst();
    }
}