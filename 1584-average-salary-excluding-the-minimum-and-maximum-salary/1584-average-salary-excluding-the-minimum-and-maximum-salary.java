class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int sal : salary) {
            min = Math.min(min, sal);
            max = Math.max(max, sal);
            sum += sal;
        }
        sum = sum - min - max;
        return (double) sum / (salary.length - 2);
    }
}
