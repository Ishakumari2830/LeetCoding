class Solution {
     private static final long MAX = 10000000000000L;
     private long mincost(List<Integer> robot, int robo_pos, List<Integer> factories, int fact_pos, long[][] mem) {
        if (robo_pos < 0) {
            return 0; // All robots are repaired
        }
        if (fact_pos < 0) {
            return MAX; // Some robots are left but factories are over
        }
        
        if (mem[robo_pos][fact_pos] != -1) {
            return mem[robo_pos][fact_pos];
        }

        // Case 1: Include the current factory for the current robot
        long include = Math.abs(robot.get(robo_pos) - factories.get(fact_pos))
                + mincost(robot, robo_pos - 1, factories, fact_pos - 1, mem);

        // Case 2: Exclude the current factory
        long exclude = mincost(robot, robo_pos, factories, fact_pos - 1, mem);

        return mem[robo_pos][fact_pos] = Math.min(include, exclude);
    }
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        
        // Sort the factory array based on the first column (location)
        Arrays.sort(factory, Comparator.comparingInt(o -> o[0]));

        // Convert multi-instance factory to single instance
        List<Integer> factories = new ArrayList<>();
        for (int[] f : factory) {
            for (int j = 0; j < f[1]; j++) {  // f[1] is the capacity
                factories.add(f[0]);          // f[0] is the location
            }
        }

        // Initialize memoization array
        long[][] mem = new long[robot.size()][factories.size()];
        for (int i = 0; i < robot.size(); i++) {
            Arrays.fill(mem[i], -1);
        }

        return mincost(robot, robot.size() - 1, factories, factories.size() - 1, mem);
    }
}