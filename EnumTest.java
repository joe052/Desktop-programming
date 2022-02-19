import java.util.*;

public class EnumTest {

    public static String[] push(String arr[],String x){
        int n = arr.length;
        int i;

        //create a new array of size n+1
        String newArr[] = new String[n +1];

        //insert all ements from previous array into new array
        for(i = 0; i < n; i++){
            newArr[i] = arr[i];
        }

        //add new element
        newArr[n] = x;
        return newArr;
    }
   
    public static void main(String[] args) {
       String[] colors = new String[0];
       Color c1 = Color.RED;
       System.out.println("My value is "+ c1.getValue());
       System.out.println("My value is "+ c1 +"\n");

       for(Color color: Color.values()){
        System.out.println("My value is "+ color.getValue());
        colors = push(colors, color.getValue());
        //System.out.println("Updated array is\n"+Arrays.toString(colors));
       }
       System.out.println("\nUpdated array is\n"+Arrays.toString(colors));
    }
}
