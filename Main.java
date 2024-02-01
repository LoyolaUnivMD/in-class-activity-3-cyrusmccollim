public class Main {
    public static void main(String[] args) {
        // Inputs hill details and creates a Hill object holding that information.
        double[] hillDetails = Hill.inputHillDetails();
        Hill hill = new Hill(hillDetails);

        // Inputs the jumper's speed, includes crash prevention.
        double jumpSpeed = SkiJump.inputJumperSpeed();

        // Creates SkiJump object that holds the Hill object and the jumper's speed.
        SkiJump skiJumper = new SkiJump(hill, jumpSpeed);

        // Calls the getResult method to calculate and return the jumper's score.
        System.out.println(skiJumper.getResult());
    }
}
