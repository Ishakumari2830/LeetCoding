class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        //  int[] ans = new int[queries.length];
        
      
        // Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

      
        // for (int i = 0; i < queries.length; i++) {
        //     int maxBeauty = 0;
            
        //     for (int[] item : items) {
        //         int price = item[0];
        //         int beauty = item[1];

        //         if (price <= queries[i]) {
        //             maxBeauty = Math.max(maxBeauty, beauty);
        //         } else {
        //             break;
        //         }
        //     }

        //     ans[i] = maxBeauty;
        // }
        
        // return ans;
         Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Prepare a cumulative array for maximum beauty up to each price point
        int n = items.length;
        int[] maxBeauty = new int[n];
        maxBeauty[0] = items[0][1];
        
        for (int i = 1; i < n; i++) {
          
            maxBeauty[i] = Math.max(maxBeauty[i - 1], items[i][1]);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
         
            int index = binarySearch(items, query);
            
           
            if (index == -1) {
                ans[i] = 0;
            } else {
                ans[i] = maxBeauty[index];
            }
        }
        
        return ans;

    }
     private int binarySearch(int[][] items, int query) {
        int low = 0, high = items.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (items[mid][0] <= query) {
                result = mid; 
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }
}