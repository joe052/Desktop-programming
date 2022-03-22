import java.util.Scanner;
//cloned
public class Student {
    int x;
    static String name;
    static Scanner in = new Scanner(System.in);

    Student(String name){
        Student.name = name;
    }

    public void grade(){
        //Scanner in = new Scanner(System.in);
        System.out.println("Please input student marks: ");
        x = in.nextInt();

        if(x >= 80 && x <= 100){
        System.out.println(Student.name +"'s Grade is: A");
        }else if(x >= 70 && x <= 79){
        System.out.println(Student.name +"'s Grade is: B");
        }else if(x >= 50 && x <= 69){
        System.out.println(Student.name +"'s Grade is: C");
        }else if(x >= 40 && x <= 49){
        System.out.println(Student.name +"'s Grade is: D");
        }else if(x < 40){
        System.out.println(Student.name +"'s Grade is: FAIL");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please input student name: ");
        name = in.nextLine();
        Student student = new Student(name);
        student.grade();
    }
}
