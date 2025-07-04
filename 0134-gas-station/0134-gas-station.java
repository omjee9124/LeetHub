class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tGas=0;
        int tCost =0;
        int tank =0;
        int start =0;
        for(int i =0; i<n;i++){
            tGas+=gas[i];
            tCost+=cost[i];
            tank += gas[i] - cost[i];
            if(tank<0){
                start = i+1;
                tank =0;
            }
        }
        if(tGas<tCost) return -1;
        return start;

    }
}