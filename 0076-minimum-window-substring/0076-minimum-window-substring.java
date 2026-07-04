class Solution {
    public boolean sahi(int have[], int need[]){
        for (int i = 0; i < 256; i++) {
                if (have[i] < need[i]) {
                    return false;
                }
            }
            return true;

    }

    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();

        if(m==0 || n == 0) return "";

        int have[] = new int[256];
        int need[] = new int[256];

        for(int i =0; i<n; i++){
            need[t.charAt(i)]++;
        }

        int low = 0;
        int res = Integer.MAX_VALUE;
        int start = -1;

        for(int high =0; high < m; high++){
            have[s.charAt(high)]++;

            while(sahi(have, need)){
                int len = high -low +1;
                if(res > len){
                    res = len;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        return res == Integer.MAX_VALUE ? "" : s.substring(start, start + res);
    }
}