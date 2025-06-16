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
        // 2) Prime Number Program in Java
        
        
    }
    public void prime_number(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        // 3) Palindrome Program in Java
        
    }
    public void Palindrome(int n){
        int temp = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = (sum*10) + rem;
            n/=10;
        }
        if(temp==sum){
            System.out.println(temp+"is a palindrome");
        }
        else{
            System.out.println(temp+"is not a palindrome number");
        }
    }
    public static void main(String[] args) {
        BasicPrograms bp = new BasicPrograms();
        // int n = 10; // Example input for Fibonacci series
        // System.out.println("Fibonacci series up to " + n + " terms: ");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(bp.fibonacciseries(i) + " ");
        // }
        // System.out.println();
        // int primeCheck = 29; 
        // bp.prime_number(primeCheck);
        int n = 121;
        bp.Palindrome(n);
        
        // int n2 = 123;
        // bp.Palindrome(n2);
        
        // int n3 = 0;
        // bp.Palindrome(n3); // Edge case for 0
        
        // int n4 = 5;
        // bp.Palindrome(n4); // Single digit
        

    }


}

    