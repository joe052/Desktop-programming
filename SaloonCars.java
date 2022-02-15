//https://cstechbook.com/2020/06/26/java-10-public-private-protected-static-this-super-and-final-keywords/
import java.util.*;

public class SaloonCars{

    static int wheels = 4;
    protected int doors = 4;
    private String fuel = "Petrol";
    String model;

    int cc;
    String col;
    int seats;

    SaloonCars(String model){
        this.model = model;

        switch(model){
            case "Toyota":
             cc = 1500;
             col = "grey";
             seats = 5;
            break;

            case "Mercedes":
             cc = 2500;
             col = "blue";
             seats = 5;
            break;

            case "Prado":
             cc = 3000;
             col = "yellow";
             seats = 7;
            break;

            default:
             cc = 2000;
             col = "white";
             seats = 4;
        }
    }

    public static void moveForward(){
        String movement ="Moving Forward";
        System.out.println("This car is: "+movement);
    }

    public static void main(String[] args) {
        SaloonCars obj = new SaloonCars("Prado");
        System.out.println("\nYour car model is: "+obj.model);
        System.out.println("The number of wheels is: "+SaloonCars.wheels);
        System.out.println("The value of cc is: "+obj.cc);
        System.out.println("The number of seats is: "+obj.seats);
        System.out.println("The color of the car is: "+obj.col);
        SaloonCars.moveForward();

        SaloonCars obj1 = new SaloonCars("Toyota");
        System.out.println("\nYour car model is: "+obj1.model);
        System.out.println("The number of wheels is: "+SaloonCars.wheels);
        System.out.println("The value of cc is: "+obj1.cc);
        System.out.println("The number of seats is: "+obj1.seats);
        System.out.println("The color of the car is: "+obj1.col);
        SaloonCars.moveForward();

        SaloonCars obj2 = new SaloonCars("Mercedes");
        System.out.println("\nYour car model is: "+obj2.model);
        System.out.println("The number of wheels is: "+SaloonCars.wheels);
        System.out.println("The value of cc is: "+obj2.cc);
        System.out.println("The number of seats is: "+obj2.seats);
        System.out.println("The color of the car is: "+obj2.col);
        SaloonCars.moveForward();
    }
}
//instead of creating other classes with different main methods you can easily instantiate different cars in one main method
//The above code is the most optimal code that serves the purpose
