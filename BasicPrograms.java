// 1) Fibonacci Series in Java
// 2) Prime Number Program in Java
// 3) Palindrome Program in Java
// 4) Factorial Program in Java
// 5) Armstrong Number in Java
// 6) How to Generate Random Number in Java
// 7) How to Print Pattern in Java
// 8) How to Compare Two Objects in Java
// 9) How to Create Object in Java
// 10) How to Print ASCII Value in Java

public class BasicPrograms {
    // 1) Fibonacci Series in Java
    public int fibonacciseries(int n){
        int a = 0, b = 1, c;
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
    public static void main(String[] args) {
        BasicPrograms bp = new BasicPrograms();
        int n = 10; // Example input for Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(bp.fibonacciseries(i) + " ");
        }
        System.out.println();
    }
}

    