class Pair {
    int x, y, dist;
    Pair(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;

        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

        boolean[][] visited = new boolean[n][n];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0, 1)); // start from (0,0) with distance 1
        visited[0][0] = true;

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int x = curr.x, y = curr.y, dist = curr.dist;

            if (x == n - 1 && y == n - 1) return dist;

            for (int d = 0; d < 8; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n &&
                    grid[nx][ny] == 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new Pair(nx, ny, dist + 1));
                }
            }
        }

        return -1;
    }
}
