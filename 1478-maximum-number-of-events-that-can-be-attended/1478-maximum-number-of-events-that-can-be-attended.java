class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i = 0, res = 0, day = 1;
        int n = events.length;

        while (i < n || !pq.isEmpty()) {
            // Add all events starting today
            while (i < n && events[i][0] == day) {
                pq.add(events[i][1]); // add end day
                i++;
            }

            // Remove expired events
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // Attend the event that ends soonest
            if (!pq.isEmpty()) {
                pq.poll();
                res++;
            }

            day++; // go to next day
        }

        return res;
    }
}