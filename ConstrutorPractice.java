class ConstructotPractice{
    int a;
    int b;
    // Constructor to initialize the variables
    ConstructotPractice(int x, int y) {
        a = x;
        b = y;  
        System.err.println("Constructor called with values: " + a + " and " + b);     
    }
    ConstructotPractice(int x, long y) {
        a = x;
        b = (int) y;  
        System.err.println("Constructor called with values: " + a + " and " + b);     
    }

    // Method to add the two numbers
    int add() {
        return a + b;           
    }
    // Main method to test the constructor and add method
    public static void main(String[] args) {
        // Create an object of the class and initialize it using the constructor
        ConstructotPractice obj = new ConstructotPractice(5, 10);
        ConstructotPractice obj1 = new ConstructotPractice(55, 10);
        // Call the add method and print the result
        System.out.println("The sum is: " + obj.add());     
    }    
}