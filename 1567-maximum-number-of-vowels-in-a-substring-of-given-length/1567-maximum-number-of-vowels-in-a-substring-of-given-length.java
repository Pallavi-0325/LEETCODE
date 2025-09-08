class Solution {
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int maxVowels(String s, int k) {
        int n = s.length();
        int ans = 0, cnt = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                cnt++;
            }
        }
        ans = Math.max(ans, cnt);
        if (ans == k) return ans; // early exit

        // Sliding window
        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) cnt++;
            if (isVowel(s.charAt(i - k))) cnt--;
            ans = Math.max(ans, cnt);
        }

        return ans;
    }
}