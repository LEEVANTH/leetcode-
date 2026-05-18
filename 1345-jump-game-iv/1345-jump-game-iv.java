import java.util.*;

class Solution {

    public int minJumps(int[] arr) {

        int n = arr.length;

        // If only one element
        if (n == 1) {
            return 0;
        }

        // Step 1: Store same value indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            map.putIfAbsent(arr[i], new ArrayList<>());

            map.get(arr[i]).add(i);
        }

        // Step 2: BFS setup
        Queue<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[n];

        queue.offer(0);

        visited[0] = true;

        int steps = 0;

        // Step 3: BFS traversal
        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int curr = queue.poll();

                // Reached last index
                if (curr == n - 1) {
                    return steps;
                }

                // Store neighbors
                List<Integer> neighbors = new ArrayList<>();

                // i - 1
                if (curr - 1 >= 0) {
                    neighbors.add(curr - 1);
                }

                // i + 1
                if (curr + 1 < n) {
                    neighbors.add(curr + 1);
                }

                // Same value indices
                neighbors.addAll(map.get(arr[curr]));

                // Visit neighbors
                for (int next : neighbors) {

                    if (!visited[next]) {

                        visited[next] = true;

                        queue.offer(next);
                    }
                }

                // IMPORTANT OPTIMIZATION
                map.get(arr[curr]).clear();
            }

            steps++;
        }

        return -1;
    }
}