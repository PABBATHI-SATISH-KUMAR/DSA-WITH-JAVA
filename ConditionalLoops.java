// Basic Java Programs
    // 1)Area Of Circle Java Program
    // 2)Area Of Triangle
    // 3)Area Of Rectangle Program
    // 4)Area Of Isosceles Triangle
    // 5)Area Of Parallelogram
    // 6)Area Of Rhombus
    // 7)Area Of Equilateral Triangle
    // 8)Perimeter Of Circle
    // 9)Perimeter Of Equilateral Triangle
    // 10)Perimeter Of Parallelogram
    // 11)Perimeter Of Rectangle
    // 12)Perimeter Of Square
    // 13)Perimeter Of Rhombus
    // 14)Volume Of Cone Java Program
    // 15)Volume Of Prism
    // 16)Volume Of Cylinder
    // 17)Volume Of Sphere
    // 18)Volume Of Pyramid
    // 19)Curved Surface Area Of Cylinder
    // 20)Total Surface Area Of Cube
    // 21)Fibonacci Series In Java Programs
    // 22)Subtract the Product and Sum of Digits of an Integer
    // 23)Input a number and print all the factors of that number (use loops).
    // 24)Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    // 25)Take integer inputs till the user enters 0 and print the largest number from all.
    // 26)Addition Of Two Numbers






import java.util.Scanner;
public class ConditionalLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConditionalLoops cl = new ConditionalLoops();


         System.out.println("Enter the length of the rectangle : ");
         double l = sc.nextInt();
         System.out.println("Enter the width of the rectangle : ");
         double w = sc.nextInt();
        double ans = cl.areaOfRectangle(l,w);
        System.out.println("Area of the Rectangle : "+ans);
        // System.out.println("Enter the base of the triangle : ");
        // double b = sc.nextInt();
        // System.out.println("Enter the height of the triangle : ");
        // double h = sc.nextInt();
        // double ans = cl.areaOfTriangle(b,h);
        // System.out.println("Area of the triangle is : " + ans);

        // System.out.println("Enter the radius of a circle : ");
        // double radius = sc.nextDouble();
        // double ans = cl.areaOfCircle(radius);
        // System.out.println("Area of circle is : " + ans);
        sc.close();
    }
    // 1)Area Of Circle Java Program
    public double areaOfCircle(double r) {
            return (22/7)*Math.pow(r,2);
    }
    // 2)Area Of Triangle
    public double areaOfTriangle(double b,double h){
        return 0.5*b*h;
    }
     // 3)Area Of Rectangle Program
     public double areaOfRectangle(double l,double w){
          return l*w;
     }
    
}
