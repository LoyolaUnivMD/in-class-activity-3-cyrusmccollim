import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the type of hill? ");
        String hillType = input.nextLine();

        System.out.print("What is the jumper's speed at the end of the ramp? ");
        double jumpSpeed = input.nextDouble();
        
        SkiJump skiJumper = new SkiJump(hillType, jumpSpeed);

        System.out.println(skiJumper.getResult());
    }
}

