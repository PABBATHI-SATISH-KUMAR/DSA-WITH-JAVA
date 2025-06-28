class ConstructotPractice{
    int a;
    int b;
    // Constructor to initialize the variables
    ConstructotPractice(int x, int y) {
        a = x;
        b = y;       
    }
    // Method to add the two numbers
    int add() {
        return a + b;           
    }
    // Main method to test the constructor and add method
    public static void main(String[] args) {
        // Create an object of the class and initialize it using the constructor
        ConstructotPractice obj = new ConstructotPractice(5, 10);
        // Call the add method and print the result
        System.out.println("The sum is: " + obj.add());     
    }    
}