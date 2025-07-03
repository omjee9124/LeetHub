class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(intervals,Comparator.comparingInt(a -> a[0]));
        res.add(new ArrayList<>());
        res.get(0).add(intervals[0][0]);
        res.get(0).add(intervals[0][1]);
        int j =0;
        for(int i = 1; i< intervals.length; i++){            
            if(intervals[i][0] > res.get(j).get(1)){
                res.add(new ArrayList<>());
                j++;
                res.get(j).add(intervals[i][0]);
                res.get(j).add(intervals[i][1]);
                
            }else{
                int max = Math.max(res.get(j).get(1),intervals[i][1]);
                res.get(j).add(1,max);
            }
        }
        int arr[][] = new int[res.size()][2];
        for(int i =0; i< res.size(); i++){
            arr[i][0] = res.get(i).get(0);
            arr[i][1] = res.get(i).get(1);
        }
        return arr;
    }
}