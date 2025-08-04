class Solution {
    public int search(int[] nums, int target) {
        return bSearch(nums, target, 0, nums.length - 1);
    }

    int bSearch(int arr[], int x, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == x)
            return m;
        if (arr[s] <= arr[m]) {
            if (x <= arr[m] && x >= arr[s]) {
                return bSearch(arr, x, s, m - 1);
            } else {
                return bSearch(arr, x, m + 1, e);
            }
        }

        if (x >= arr[m] && x <= arr[e]) {
            return bSearch(arr, x, m + 1, e);
        }
        return bSearch(arr, x, s, m - 1);
    }
}