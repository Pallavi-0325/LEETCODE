int alternateDigitSum(int n) {
    int ans = 0;
    int m = 1;
    while (n) {
        ans += (n % 10) * m;
        m = -m;
        n /= 10;
    }
    return ans*-m;
}