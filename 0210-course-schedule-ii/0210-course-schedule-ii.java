class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> arr = new ArrayList<>();

        arr = topo(prerequisites,numCourses);
        Collections.reverse(arr);
        int res[] = new int[arr.size()];
        
        for(int i =0; i<arr.size(); i++){
            res[i] = arr.get(i);
        }
        if(res.length < numCourses){
            return new int[0];
        }
        return res;
    }
    public List<Integer>  topo(int edges[][], int V){
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
        return result;
    }
}