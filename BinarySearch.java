//1)write the code for BinarSearch
//2)write the code for the order agnostic binary search
//3)Write the code for binarysearch in 2D arrays  which is sorted in row wise and col wise
//4)write the code for binarSearhc in sorted matrix


import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch ob = new BinarySearch();





        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        int target = 16;

        int[] result = search(matrix, target);
        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Element not found in the matrix.");
        } else {
            System.out.println("Element found at row: " + result[0] + ", column: " + result[1]);
        }

        // int matrix[][] = {
        //     {10,20,30,40},
        //     {15,25,35,45},
        //     {28,29,37,49},
        //     {33,34,38,50},
        // };

        // int a[] = ob.binarySearchIn2DArrays(matrix, 37);
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i] + " ");
        // }

        // System.out.println("Enter the size of the matrix ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements in the array : ");
        // for(int i = 0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.print(" array : ");
        // for(int i = 0;i<size;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println("Enter the element to be searched : ");
        // int target = sc.nextInt();
        // int index = ob.orderAgnosticBinarySearch(arr,target);
        // System.out.println(target+"is found at the index "+index);



        // System.out.println("Enter the size of the matrix ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements in the array : ");
        // for(int i = 0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.print(" array : ");
        // for(int i = 0;i<size;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println("Enter the element to be searched : ");
        // int target = sc.nextInt();
        // int index = ob.binarySearch(arr,target);
        // System.out.println(target+"is found at the index "+index);
        sc.close();

    }
    //1)write the code for BinarSearch
    public int binarySearch(int a[],int target){
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid]<target){
                start = mid+1;
            }
            else if(a[mid]>target){
                end = mid-1;
            }
            else{
                return mid;
            }
    }
    return -1;

}
//2)write the code for the order agnostic binary search
public int orderAgnosticBinarySearch(int arr[], int target) {
    int start = 0;
    int end = arr.length - 1;
    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (isAsc) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    return -1;
}
//3)Write the code for binarysearch in 2D arrays
public int[] binarySearchIn2DArrays(int matrix[][], int target) {
    int row = 0;
    int col = matrix.length-1;
    while(row<matrix.length && col > 0 ){
        if(matrix[row][col]==target){
            return new int[]{row,col};
        }
        if(matrix[row][col]<target){
            row++;
        }
        else{
            col--;
        }
    }
    return new int[]{-1,-1};

}
//4)Write the code for binary search in sorted matrix
//Search in row provided between the column provided
static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
    while(cStart<=cEnd){
        int mid = cStart+(cEnd-cStart)/2;
        if(matrix[row][mid]==target){
            return new int[]{row,mid};
        }
        if(matrix[row][mid]<target){
            cStart = mid+1;
        }
        else{
            cEnd = mid-1;
        }
    }
    return new int[]{-1,-1};
}
static int[] search(int[][] matrix,int target){
    int rows = matrix.length;
    int cols = matrix[0].length; // sometimes matrix can be empty
    if(rows==1){
        return binarySearch(matrix,0,0,cols-1,target);
    }
    int rStart = 0;
    int rEnd = rows-1;
    int cMid = cols/2;

    // run the loop till 2 rows are remanining 
    while(rStart<=rEnd-1){ // if true more than 2 rows
        int mid = rStart+(rEnd-rStart)/2;
        if(matrix[mid][cMid]==target){
            return new int[]{mid,cMid};
        }
        if(matrix[mid][cMid]<target){
            rStart = mid;
        }
        else{
            rEnd = mid;
        }

    }
    // if 2 rows are remaining
    // check whether target is in the col of 2 rows
    if(matrix[rStart][cMid]==target){
        return new int[]{rStart,cMid};
    }
    if(matrix[rStart+1][cMid]==target){
        return new int[]{rStart+1,cMid};
    }

    // search in first half
    if(target<=matrix[rStart][cMid-1]){
        
    return binarySearch(matrix,rStart,0,cMid-1,target);

    }
    // search in second half
    if(target>=matrix[rStart][cMid-1]){
        return binarySearch(matrix,rStart,cMid+1,cols-1,target);
    }
    // search in 3rd half
    if(target<=matrix[rStart+1][cMid-1]){
        return binarySearch(matrix,rStart+1,0,cMid-1,target);
    }
    //search in 4th half
    else{
        return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
    }



}
}


