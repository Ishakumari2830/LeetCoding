/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   private int getMinSwap(int[] arr){
    int swap = 0;
    int[] target = arr.clone();
    Arrays.sort(target);
    Map<Integer, Integer> posi = new HashMap<>();
    for(int i = 0;i<arr.length;i++){
        posi.put(arr[i],i);//store original val
    }
    for(int i =0;i<arr.length;i++){
        if(arr[i] != target[i]){
            swap++;

            int curr = posi.get(target[i]);
            posi.put(arr[i],curr);
            arr[curr]= arr[i];
        }
    }
    return swap;

  
   }
    public int minimumOperations(TreeNode root) {
       
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int cnt = 0;

        while (!q.isEmpty()) {
            int lvlSize = q.size();
            int[] lvlval = new int[lvlSize];

          
            for (int i = 0; i < lvlSize; i++) {
                TreeNode current = q.poll();
                lvlval[i]=current.val;

              
                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }

          cnt += getMinSwap(lvlval);
           
        }

        return cnt; 
    }
    
}