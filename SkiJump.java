//HelloWorld.java
import java.util.*;

class SkiJump {
    public static void main(String[] args) {
        hillHeight = requestHillHeight();
    }

    private static String requestHillHeight(){
        Scanner input = new Scanner();
        int hillHeight;
        
        System.out.println("What is the type of the hill? (Normal/Large)");
        
        hillType = input.nextLine().toLowerCase();
        if hillType.equals("normal") hillHeight = 46;
        
        else hillHeight = 70;
        return hillHeight;
    }
}
