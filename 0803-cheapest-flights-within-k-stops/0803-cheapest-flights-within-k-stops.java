import java.util.*;

class Solution {
    static class Flight {
        int city;
        int cost;
        Flight(int city, int cost) {
            this.city = city;
            this.cost = cost;
        }
    }

    static class State {
        int cost;
        int city;
        int stops;
        State(int cost, int city, int stops) {
            this.cost = cost;
            this.city = city;
            this.stops = stops;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Build adjacency list
        List<List<Flight>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] flight : flights) {
            graph.get(flight[0]).add(new Flight(flight[1], flight[2]));
        }

        // Min heap based on total cost
        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        pq.offer(new State(0, src, 0));

        // Track the minimum cost to reach [city][stops]
        int[][] minCost = new int[n][k + 2];
        for (int[] row : minCost) Arrays.fill(row, Integer.MAX_VALUE);
        minCost[src][0] = 0;

        while (!pq.isEmpty()) {
            State curr = pq.poll();
            int cost = curr.cost;
            int city = curr.city;
            int stops = curr.stops;

            if (city == dst) return cost;
            if (stops > k) continue;

            for (Flight f : graph.get(city)) {
                int nextCity = f.city;
                int nextCost = cost + f.cost;

                if (nextCost < minCost[nextCity][stops + 1]) {
                    minCost[nextCity][stops + 1] = nextCost;
                    pq.offer(new State(nextCost, nextCity, stops + 1));
                }
            }
        }

        return -1;
    }
}
