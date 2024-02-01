import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] hillDetails = Hill.inputHillDetails();

        Hill hill = new Hill(hillDetails);

        System.out.print("Enter the jumper's speed: ");
        double jumpSpeed = input.nextDouble();
        
        SkiJump skiJumper = new SkiJump(hill, jumpSpeed);
        
        System.out.println(skiJumper.getResult());
    }
}
