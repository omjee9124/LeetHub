class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = growTime.length;
        int arr[][] = new int[n][2];
        for(int i =0; i<n; i++){
            arr[i][0] = plantTime[i];
            arr[i][1] = growTime[i];

        }
        Arrays.sort(arr,(a,b) -> b[1] - a[1]);
        int pD=0;
        int gD =0;
        for(int i =0; i<n; i++){
            int bloom = arr[i][0] + arr[i][1] +pD;
            pD+=arr[i][0];
            gD = Math.max(gD,bloom);
            
        }
        return gD;
    }
}