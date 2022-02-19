import java.io.*;
import java.lang.*;
import java.util.*;

public class AdvArrays {
    
    //function to add an element in an array
    public static int[] push(int arr[],int x){
        //snatch the array length of passed array
        int n = arr.length;

        int i;

        //create a new array of size n+1
        int newArr[] = new int[n +1];

        //insert all ements from previous array into new array
        for(i = 0; i < n; i++){
            newArr[i] = arr[i];
        }

        //insert the new value to the array at the last index
        //remember that the last index of an array of...
        //...size n+1 is n
        newArr[n] = x;
        return newArr;
    }

    public static void main(String[] args) {

        //create your array
        int num[] = {1,2,3,4,5,6,7,8,9,10,11};

        //print original array
        System.out.println("Initial Array:\n"+Arrays.toString(num));

        //element to be added
        int x = 50;

        //re-assign with added components
        num = push(num, x);
        System.out.println("Updated array is\n"+Arrays.toString(num));
    }
}
