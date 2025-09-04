class Solution {
    public int countPrimeSetBits(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            list.add(i);
        }
        List<Integer>res=new ArrayList<>();
       for(int i=0;i<list.size();i++){
        String s=Integer.toBinaryString(list.get(i));
        int count=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch=='1'){
                count++;
            }
          }
          res.add(count);
       }
       int set=0;
       for(int k=0;k<res.size();k++){
          if(isPrime(res.get(k))){
              set++;
          }
       }
       return set;
    }
        private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
   
}