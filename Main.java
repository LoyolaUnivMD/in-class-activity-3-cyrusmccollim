import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the type of the hill? (Normal/Large)");
        String hillType = input.nextLine();
        
        Hill hill1 = new Hill(hillType);
        
        System.out.println("What is the jumper's speed at the end of the ramp?");
        double jumperSpeed = input.nextDouble();

        hill1.calculatePoints(jumperSpeed);

        System.out.println(hill1.findResult()); 
    }
}

