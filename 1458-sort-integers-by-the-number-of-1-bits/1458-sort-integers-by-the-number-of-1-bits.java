class Solution {
    public int[] sortByBits(int[] arr) {
            return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    int cA = Integer.bitCount(a);
                    int cB = Integer.bitCount(b);
                    if (cA == cB) {
                        return Integer.compare(a, b); 
                    }
                    return Integer.compare(cA, cB); 
                })
                .mapToInt(i -> i) 
                .toArray();
     
    }
}