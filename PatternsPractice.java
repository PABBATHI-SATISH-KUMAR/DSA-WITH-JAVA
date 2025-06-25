import java.util.Scanner;
class PatternsPracticeMain{
    //1
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
    //2
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
    //3
    public static void rightAngleTriangleNumbers(int n){
        // column wise printing of numbers
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

    //4
    public static void rightAngleTriangleNumbers2(int n){
        // row wise printing of numbers
        // 1
        // 2 2 
        // 3 3 3
        for(int rows=0;rows<n;rows++){
            for(int cols = 0;cols<=rows;cols++){
                System.out.print(rows+1+" ");
            }
            System.out.println();
        }
    }
    //5
    public static void seeding(int n) {
        
        // * * *
        // * *
        // *
        for(int rows = 0 ;rows<n;rows++){
            for(int cols = 0 ;cols<n-rows;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //6
    public static void nNumberTriangle(int n) {
        // 1 2 3
        // 1 2
        // 1
        for(int rows = 0 ;rows<n;rows++){
            for(int cols = 0 ;cols<n-rows;cols++){
                System.out.print(cols+1+" ");
            }
            System.out.println();
        }
    }

    //7
    public static void nStarTriangle(int n) {
            //  *
            // ***
            // *****
       for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
		
        }
    }


    //8
    public static void nInvertedStarTriangle(int n) {
        // *****
        // ***
        //  *
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
		
        }
    }


    //9
    public static void nStarDiamond(int n) {
            //  *
            // ***
            // *****
            // *****
            // ***
            //  *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //10
    public static void nSymmetricRightAngleTriangle(int n) {
        // *
        // **
        // ***
        // **
        // *
        for(int i = 0 ; i<n;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1 ; i<n;i++) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }


    //11
    public static void nBinaryTriangle(int n) {
        // 1
        // 0 1
        // 1 0 1
        int start = 1;
        for(int rows = 0;rows<n;rows++ ){
            if(rows%2==0) start = 1;
            else start = 0;
            for(int cols = 0 ; cols<=rows;cols++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }
    }

    //12
    public static void numberCrown(int N) {
        // 1                         1
        // 1 2                     2 1
        // 1 2 3                 3 2 1
        // 1 2 3 4             4 3 2 1
        // 1 2 3 4 5         5 4 3 2 1
        // 1 2 3 4 5 6     6 5 4 3 2 1
        // 1 2 3 4 5 6 7 7 6 5 4 3 2 1  
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) { 
                    System.out.print(" ");
                }
            }
            int middleSpaces = (N - i) * 4 + 1;
            for (int k = 1; k <= middleSpaces; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
                if (j > 1) { 
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }


    //13
    public static void nNumberSequenceTriangle(int n) {
        // 1
        // 2 3
        // 4 5 6
        // Write your code here
        int count = 1;
        for(int rows = 0;rows<n;rows++){
            for(int cols=0;cols<=rows;cols++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }


    //14
    public static void nLetterTriangle(int n) {
        // A
        // A B
        // A B C
        for (int rows = 0; rows < n; rows++) {
            char currentChar = 'A'; 
            for (int cols = 0; cols <= rows; cols++) {
                System.out.print(currentChar + " "); 
                currentChar++; 
            }
            System.out.println(); 
        }
    }

    //15
    public static void nLetterReverseTriangle(int n) {
        // A B C
        // A B
        // A
        for (int rows = n; rows >= 0; rows--) {
            char currentChar = 'A'; 
            for (int cols = 0; cols < rows; cols++) {
                System.out.print(currentChar + " "); 
                currentChar++; 
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
        //rightAngleTriangleNumbers(n);
        //rightAngleTriangleNumbers2(n);
        //seeding(n);
        //nNumberTriangle(n);
        //nStarTriangle(n);
        //nInvertedStarTriangle(n);
        //nStarDiamond(n);
        //nSymmetricRightAngleTriangle(n);
        //nBinaryTriangle(n);
        //numberCrown(n);
        //nNumberSequenceTriangle(n);
        //nLetterTriangle(n);
        // nLetterReverseTriangle(n);
        sc.close();

    }
}