class Solution {
    public String removeDuplicates(String s) {
        if (s == null || s.length() <= 1) return s;
        char[] arr = s.toCharArray();
        int top = 0;
        for (char c : arr) {
            if (top > 0 && arr[top - 1] == c) {
                top--; // pop
            } else {
                arr[top++] = c; // push
            }
        }
        return new String(arr, 0, top);
    }
}