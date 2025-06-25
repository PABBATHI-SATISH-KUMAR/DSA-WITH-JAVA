import java.util.Scanner;
class PatternsPracticeMain{

    public static void nForest(int n) {
        // * * *
        // * * *
        // * * *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void rightAngleTriangle(int n){
        // * 
        // * *
        // * * *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangleNumbers(int n){
        // 1
        // 1 2 
        // 1 2 3
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        //nForest(n);
        //rightAngleTriangle(n);
        rightAngleTriangleNumbers(n);
        sc.close();

    }
}