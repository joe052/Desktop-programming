import java.util.*;

public class EnumTest {
   
    public static void main(String[] args) {
       String[] colors = new String[100];
       Color c1 = Color.RED;
       System.out.println("My value is "+ c1.getValue());
       System.out.println("My value is "+ c1);

       for(Color color: Color.values()){
           String nam = "blue";
           System.out.println("\nMy value is "+ color.getValue());
           
           colors[0] = color.getValue();
       }

       System.out.println(colors[2]);
    }
}
