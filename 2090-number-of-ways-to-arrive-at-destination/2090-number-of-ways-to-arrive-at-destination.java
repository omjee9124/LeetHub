class Solution {
    static int MOD = (int)1e9+7;
    static class Pair{
        long dist;
        int Node;
        Pair(long dist, int Node){
            this.dist = dist;
            this.Node = Node;
        }
    }
    public int countPaths(int V, int[][] roads) {
        int []ways = new int[V];
        Arrays.fill(ways,0);
        ways[0] = 1;


        List<List<int[]>> adj= new ArrayList<>();
        for(int i =0; i< V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : roads){
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];
            adj.get(u).add(new int[]{v,cost});
            adj.get(v).add(new int[]{u,cost});
            
        }

        PriorityQueue<Pair> PQ = new PriorityQueue<>((a,b)->Long.compare(a.dist,b.dist));
        long distance[] = new long[V];
        Arrays.fill(distance,Long.MAX_VALUE);
        PQ.add(new Pair(0L,0));
        distance[0] = 0;

        while(!PQ.isEmpty()){
            Pair p = PQ.poll();
            int u = p.Node;
            long d_u = p.dist;
            if(distance[u]< d_u) continue;
            for(int i = 0; i< adj.get(u).size(); i++){
                int temp[] = adj.get(u).get(i);
                int v = temp[0];
                long c_u_v = temp[1];
                if(distance[v]>d_u + c_u_v){
                    distance[v] = d_u + c_u_v;
                    PQ.offer(new Pair(distance[v],v));
                    ways[v] = ways[u];
                }else if(distance[v] == d_u + c_u_v){
                    ways[v] = (ways[v] + ways[u]) % MOD;
                }
            }
        }
        return ways[V-1];
    }
}