class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        for(int i = 0; i<=n;i++){
            arr[i] = (i%2) + arr[i/2];
        }
        return arr;
    }
}