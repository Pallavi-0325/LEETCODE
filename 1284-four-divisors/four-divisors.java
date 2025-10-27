class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            List<Integer> res = new ArrayList<>();
            for (int j = 1; j * j <= num; j++) {
                if (num % j == 0) {
                    res.add(j);
                    if (j != num / j) { 
                        res.add(num / j);
                    }
                }
                if (res.size() > 4) break;
            }
            if (res.size() == 4) {
                for (int k : res) {
                    sum += k;
                }
            }
        }
        return sum;
    }
}