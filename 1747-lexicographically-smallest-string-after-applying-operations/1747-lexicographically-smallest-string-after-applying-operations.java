class Solution {
    public String findLexSmallestString(String s, int a, int b) {
       


   
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        String smallest = s;
        queue.offer(s);
        visited.add(s);

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            if (curr.compareTo(smallest) < 0) {
                smallest = curr;
            }

            // Operation 1: Add 'a' to all digits at odd indices
            char[] arr = curr.toCharArray();
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] = (char) ((arr[i] - '0' + a) % 10 + '0');
            }
            String added = new String(arr);
            if (visited.add(added)) {
                queue.offer(added);
            }

            // Operation 2: Rotate to the right by 'b' positions
            String rotated = curr.substring(curr.length() - b) + curr.substring(0, curr.length() - b);
            if (visited.add(rotated)) {
                queue.offer(rotated);
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findLexSmallestString("5525", 9, 2)); // Output: 2050
        System.out.println(sol.findLexSmallestString("74", 5, 1));   // Output: 24
        System.out.println(sol.findLexSmallestString("0011", 4, 2)); // Output: 0011
    }
}

    