class Solution {
    public String lastNonEmptyString(String s) {
       int[] freq = new int[26];

        // Count frequency of every character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find the maximum frequency
        int max = 0;
        for (int f : freq) {
            if (f > max) max = f;
        }

        StringBuilder ans = new StringBuilder();

        // Traverse from right to left to collect last max-frequency characters
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int idx = c - 'a';

            if (freq[idx] == max) {
                ans.append(c);
                freq[idx]--;   // reduce count after taking
            }
        }
        return ans.reverse().toString();
    }
}