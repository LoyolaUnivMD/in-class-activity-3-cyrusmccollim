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

    public String[] inputHillDetails(){
        String[] hillDetailsInput = input.nextLine().split(" ");
        
        while (hillDetailsInput.length() != 3){
            System.out.println("An error occured, please try again.");
            hillDetailsInput = input.nextLine().split(" ");
        }
        
        return hillDetailsInput;
    }

    public double[] convertHillDetailsDouble(String[] hillDetailsString){
        double[] hillDetails;
        
        try {
            hillDetails = new double[]{(double) hillDetailsString[0], (double) hillDetailsString[1], (double) hillDetailsString[2]};
        } catch (Exception e) {
            System.out.println("An error occured, hill details not initialized.");
        }
        
        return hillDetails; 
    }
}

