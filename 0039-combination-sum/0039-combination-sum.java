class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        fun(candidates,candidates.length-1,target,arr,res);
        return arr;
    }

    public void fun(int[] candidates, int idx, int target, List<List<Integer>> arr, List<Integer> res){
        if(idx == -1 || target<0) return;

        if(target == 0){
            arr.add(new ArrayList<>(res));
            return;
        }

        res.add(candidates[idx]);
        fun(candidates,idx, target-candidates[idx], arr, res);

        res.remove(res.size() -1);
        fun(candidates, idx-1, target, arr, res);
    }
}