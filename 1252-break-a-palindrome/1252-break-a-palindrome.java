class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();

        if( n == 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder(palindrome);
        for( int i = 0; i < n / 2; i++ ) {
            if( sb.charAt(i) != 'a' ) {
                sb.deleteCharAt(i);
                sb.insert(i, "a");
                return sb.toString();
            }
        }

        sb.deleteCharAt(n - 1);
        sb.insert(n - 1, "b");
        return sb.toString();


    }
}