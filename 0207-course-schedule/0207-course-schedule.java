class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int l =topo(prerequisites,numCourses);
        if(l==numCourses) return true;

        return false;
    }
    public int  topo(int edges[][], int V){
        int []indegree = new int[V];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0; i< V; i++){
            adj.add(new ArrayList<>());
        }

        for(int [] arr : edges){
            adj.get(arr[0]).add(arr[1]);
            indegree[arr[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<indegree.length;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!q.isEmpty()){
            int node = q.poll();
            result.add(node);

            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.offer(it);
                }
            }
        }
        return result.size();
    }

}