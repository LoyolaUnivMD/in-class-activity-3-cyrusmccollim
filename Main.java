import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the type of hill?");
        String hillType = input.nextLine();
        
        SkiJump skiJumper = new SkiJump(hillType);
        
        System.out.println("What is the jumper's speed at the end of the ramp?");
        double jumpSpeed = input.nextDouble();

        hill1.calculatePoints(jumpSpeed);

        System.out.println(skiJumper.strResult()); 
    }
}

