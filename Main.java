import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the hill details. \n(Format: height pointsPerMeter par)");
        
        String[] hillDetailsString = inputHillDetails();
        double[] hillDetails = convertHillDetailsDouble(hillDetailsString);
        Hill hill = new Hill(hillDetails);

        System.out.print("Enter the jumper's speed: ");
        double jumpSpeed = input.nextDouble();
        
        SkiJump skiJumper = new SkiJump(hill, jumpSpeed);
        
        System.out.println(skiJumper.getResult());
    }

    public double[] inputHillDetails(){
        double[] hillDetails = new double[3];
        
        String[] hillDetailsInput = input.nextLine().split(" ");
        while (hillDetailsInput.length() != 3){
            System.out.println("An error occured, please try again.");
            hillDetailsInput = input.nextLine().split(" ");
        }
        
        try {
            hillDetails = new double[]{(double) hillDetailsInput[0], (double) hillDetailsInput[1], (double) hillDetailsInput[2]};
        } catch (Exception e) {
            System.out.println("An error occured, hill details not updated.");
        }

        return hillDetails; 
    }
}
