public class Lab1 {
    public static void main(String[] args) {
        /* 0414
           C2 = 0 -> +
           C3 = 0 -> C = 0
           C5 = 4 -> -
           C7 = 1 -> short
        */

        int a = 3;
        int b = 1;
        int n = 5;
        int m = 2;
        final int C = 0;
        double result = 0;

        if (n < a || m < b) {
            System.out.println("Result = " + result);
        } else if ((a > -C || n < -C) && (b > 0 || m < 0)) {
            for (short i = (short) a; i <= n; i++) {
                for (short j = (short) b; j <= m; j++) {
                    result += (double)(i-j)/i;
                }
            }
            System.out.print("Result = " + result);
        } else {
            System.out.println("Error division by zero!");
        }
    }
}