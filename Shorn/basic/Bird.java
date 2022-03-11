package Shorn.basic;

public class Bird extends Animal {
    public Bird(){
        final int wings =2;
        System.out.println("i am a bird..");
    }

    public void fly(){
        System.out.println("...i am flying");
    }

    public void layEggs(){
        System.out.println("laying eggs...");
    }
}
