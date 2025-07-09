class Solution {
    static class Pair{
        int dist;
        int Node;
        Pair(int dist, int Node){
            this.dist = dist;
            this.Node = Node;
        }
    }
    public int networkDelayTime(int[][] edges, int V, int src) {
         List<List<int[]>> adj= new ArrayList<>();
        for(int i =0; i< V+1; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];
            adj.get(u).add(new int[]{v,cost});

            
        }
        
        PriorityQueue<Pair> PQ = new PriorityQueue<>((a,b)->Integer.compare(a.dist,b.dist));
        int distance[] = new int[V+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        PQ.add(new Pair(0,src));
        distance[src] = 0;
        
        while(!PQ.isEmpty()){
            Pair p = PQ.poll();
            int u = p.Node;
            int d_u = p.dist;
            if(distance[u]< d_u) continue;
            for(int i = 0; i< adj.get(u).size(); i++){
                int temp[] = adj.get(u).get(i);
                int v = temp[0];
                int c_u_v = temp[1];
                if(distance[v]>d_u + c_u_v){
                    distance[v] = d_u + c_u_v;
                    PQ.offer(new Pair(distance[v],v));
                }
            }
        }
        int maxTime = 0;
        for(int i = 1; i <= V; i++) {
            if(distance[i] == Integer.MAX_VALUE) return -1;
            maxTime = Math.max(maxTime, distance[i]);
        }
        return maxTime;


    }
}