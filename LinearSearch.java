//1) write the code for linearSearch
//2) write the code for linearSearch using for-each loop
//3) write the code for linearSearch in 2D array


import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearSearch ob = new LinearSearch();










        System.out.println("Enter the row size of the matrix : ");
        int row = sc.nextInt();
        System.out.println("Enter the column size of the matrix : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
       
        System.out.println("Enter the element to be searched : ");
        int ele = sc.nextInt();
        
         ob.linearSearchIn2DArray(arr, ele);
        
        // System.out.println("Enter the size of the matrix ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements in the array : ");
        // for(int i = 0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("Enter the element to be searched : ");
        // int target = sc.nextInt();
        // ob.linearSearchUsingForEachLoop(arr,target);

        // int index = ob.linarSearch(arr, target);
        // System.out.println("Elemnt found at the index "+index);

    }
    //1) write the code for linearSearch
    public int linarSearch(int arr[],int target){
        if(arr.length==0) return -1;
        for(int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
    //2) write the code for linearSearch using for-each loop
    public void linearSearchUsingForEachLoop(int arr[],int target){
        if(arr.length==0) System.out.println(target+"Element is not present in the array "); 
        for(int element: arr){
            if(element==target){
                System.out.println(element+"is present in the array");
            }
        }
        

    }
    //3) write the code for linearSearch in 2D array
    public void linearSearchIn2DArray(int arr[][], int target) {
        if (arr.length == 0) {
            System.out.println(target + " is not present in the array");
            return;
        }
    
        boolean found = false;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    System.out.println(target + " is present in the array at index "+row+" "+col);
                    found = true;
                    break; 
                }
            }
            if (found) {
                break; 
            }
        }
        if (!found) {
            System.out.println(target + " is not present in the array");
        }
    }
    
}
