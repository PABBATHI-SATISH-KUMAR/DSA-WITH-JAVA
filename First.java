// 1)Write a program to print whether a number is even or odd, also take input from the user.
// 2)Take name as input and print a greeting message for that particular name.
// 3)Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// 4)Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
// 5)Take 2 numbers as input and print the largest number.
// 6)Input currency in rupees and output in USD.
// 7)To calculate Fibonacci Series up to n numbers.
// 8)To find out whether the given String is Palindrome or not.
// 9)To find Armstrong Number between two given number.

import java.util.Scanner;
public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        //String s = sc.nextLine();
        // int p = sc.nextInt();
        // int t = sc.nextInt();
        // int r = sc.nextInt();
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        //int n = sc.nextInt();
        sc.close();
        First a = new First();
        
  
        int ans = a.fibonacci(n);
        System.out.println(ans);
        // double ans = a.convertToUSD(n);
        // System.out.println(ans);
        // int ans = a.largeNum(num1,num2);
        // System.out.println(ans);
        // double ans = a.simpleIntrest(p,t,r);
        // System.out.println(ans);
        // String ans = a.greeting(s);
        // System.out.println(ans);
        //String ans = a.isOddEven(n);
        //System.out.println(ans);
    }

    // 1)Write a program to print whether a number is even or odd, also take input from the user.
    public String isOddEven(int n){
        
        if((n&1)==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }

    // 2)Take name as input and print a greeting message for that particular name.
    public String greeting(String s){
        return "Hello "+s+"! How are you?";
    }
    // 3)Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public double simpleIntrest(int p,int t,int r){
        return (p*t*r)/100;
    }
    // 4)Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    // public int calculate(int a,int b){
        

    // }
    
    // 5)Take 2 numbers as input and print the largest number.
    public int largeNum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
   
    // 6)Input currency in rupees and output in USD.
    public double convertToUSD(int n){
        return 0.012*n;
    }
    // 7)To calculate Fibonacci Series up to n numbers.
    public int fibonacci(int n){
        int a = 0;
        int b = 1;
        int count = 2;
        while (count<=n){
            int temp = b;
            b=a+b;
            a = temp;
            count++;
        }
        return b;
    }
}
