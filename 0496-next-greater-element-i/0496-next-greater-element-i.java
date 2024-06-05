class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer, Integer> ngeMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 to find the next greater element for each element
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                ngeMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Prepare the result array for nums1
        int[] nge = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            nge[i] = ngeMap.getOrDefault(nums1[i], -1);
        }

        return nge;  
    }
}