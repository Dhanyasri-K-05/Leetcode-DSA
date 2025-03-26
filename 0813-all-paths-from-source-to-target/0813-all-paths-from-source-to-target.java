class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

           List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0, graph, path, result);
        return result;
    }

    private void dfs(int node, int[][] graph, List<Integer> path, List<List<Integer>> result) {
        path.add(node);

        // If we reach the last node, add the current path to the result
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path)); // Store a copy of the path
        } else {
            // Recur for all adjacent nodes
            for (int nextNode : graph[node]) {
                dfs(nextNode, graph, path, result);
            }
        }

        // Backtrack to explore other paths
        path.remove(path.size() - 1);
    }

    
}