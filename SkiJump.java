//HelloWorld.java
import java.util.*;

class SkiJump {
    public static void main(String[] args) {
        Scanner input = new Scanner();
        System.out.println("What is the type of the hill? (Normal/Large)");
        hillType = input.nextLine();
        Hill hill = new Hill(hillType);
        System.out.println("What is the jumper's speed at the end of the ramp?");
        speed = input.nextDouble();
    }

}
