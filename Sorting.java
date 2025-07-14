import java.sql.Array;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        // int[] arr = {7,8,3,1,2};
        InsertionSort();
    }
    public static void bubbleSort() {
        int[] arr = {7,8,3,1,2};
        /*
         Bubble sort: When a bubble is created in water, it rises to the top.
         In bubble sort, the largest element bubbles up to the end of the array.
         */
        //Time Complexity: O(n^2)
        //Space Complexity: O(1)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    //Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort() {
        // Selection sort: The smallest element is selected and placed at the beginning.
        // In each iteration, the smallest element from the unsorted part is selected and swapped with the first unsorted element.
        // The process is repeated until the entire array is sorted. 
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        int[] arr = {7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++){
            int small =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[small]){
                    small =j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void InsertionSort(){
        int[] arr = {7,8,3,1,2};
        // Insertion sort: The array is divided into two parts, sorted and unsorted.
        // The smallest element from the unsorted part is inserted into the sorted part.
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        for(int i=0;i<arr.length;i++){
            int curr= arr[i];
            int j =i-1;
            while(j>=0 && curr <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;

        }
        System.out.println(Arrays.toString(arr));
    }
}
