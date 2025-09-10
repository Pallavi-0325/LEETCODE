class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n!=0){
       int res=n/5;
       count+=res;
        n/=5;
        }
        return count;
    }
}