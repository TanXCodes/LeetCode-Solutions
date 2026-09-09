class Solution {
    public long countCommas(long n) {
        if (n <= 999) return 0;

        long total = 0;
        long start = 1000;
        long end = start * 1000 - 1;
        int commas = 1;

        while (start <= n) {
            long numbers = Math.min(n, end) - start + 1;
            total += (long) commas * numbers;

            if (end > n) break;

            start = start * 1000;
            end = start * 1000 - 1;
            commas++;
        }
        return total;
    }
}