class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        int n0 = s.length();
        int[] arr = new int[n0];
        for(int i = 0; i < n0; ++i) arr[i] = s.charAt(i) - 'a';
        int[] cnt = new int[26];
        for(int c: arr) cnt[c]++;

        List<Integer> cand = new ArrayList<>();
        for(int c = 0; c < 26; ++c) if(cnt[c] >= k) cand.add(c);
        if(cand.isEmpty()) return "";

        cand.sort(Comparator.reverseOrder());
        List<Integer> filtered = new ArrayList<>();
        for(int c: arr) if(cnt[c] >= k) filtered.add(c);

        int n = filtered.size();
        int[][] nxt = new int[n+1][26];
        for(int i = 0; i <= n; ++i) Arrays.fill(nxt[i], n);
        for(int i = n-1; i >= 0; --i){
            System.arraycopy(nxt[i+1], 0, nxt[i], 0, 26);
            nxt[i][filtered.get(i)] = i;
        }

        int maxL = n / k;
        List<Integer> res = new ArrayList<>(maxL), best = new ArrayList<>();
        for(int L = maxL; L > 0; --L){
            res.clear();
            if(dfs(0, L, k, cand, nxt, n, res, best)) break;
        }
        StringBuilder sb = new StringBuilder();
        for(int c: best) sb.append((char)('a' + c));
        return sb.toString();
    }

    private boolean dfs(int d, int L, int k, List<Integer> cand, int[][] nxt, int n, List<Integer> res, List<Integer> best) {
        if(d == L){
            best.clear();
            best.addAll(res);
            return true;
        }
        for(int c: cand){
            res.add(c);
            int pos = 0;
            boolean ok = true;
            for(int t = 0; t < k && ok; ++t){
                for(int x: res){
                    pos = nxt[pos][x] + 1;
                    if(pos > n){ ok = false; break; }
                }
            }
            if(ok && dfs(d+1, L, k, cand, nxt, n, res, best)) return true;
            res.remove(res.size()-1);
        }
        return false;
    }
}