//1) Write the code for bubble sort
//2) Write the code for Selection sort


import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Sorting ob = new Sorting();
        
        int arr[] = {4,5,6,1,2,3,8,9};
        selectionSort(arr);
        System.out.println("Array after sorted  "+Arrays.toString(arr));
        // bubbleSort(arr);
        sc.close();
    }





//1) Write the code for bubble sort
public static void bubbleSort(int[] arr){
    boolean swapped;
    for(int i = 0;i<arr.length;i++){
        swapped = false;
        for(int j = 1;j<arr.length-1;j++){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                swapped = true;
            }
        }
        if(!swapped) break;
    }
    System.out.println("Array after sorted  "+Arrays.toString(arr));
}


//2) Write the code for Selection sort
public static void selectionSort(int[] arr){
    for(int i = 0;i<arr.length;i++){
        int last = arr.length-i-1;
        int maxIndex = getMaxIndex(arr,0,last);
        swap(arr,maxIndex,last);
    }
}
static void swap(int[] arr,int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}
static int getMaxIndex(int[] arr,int start,int end){
    int max = start;
    for(int i = start;i<=end;i++){
        if(arr[max]<arr[i]){
            max=i;
        }
    }
    return max;
}
    
}
