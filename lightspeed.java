import java.util.Scanner;

public class lightspeed {
    public static void main (String[] args){
    int speed = 340;
    Scanner input = new Scanner (System.in);
    
    System.out.print("please enter the number of seconds:");
    int time = input.nextInt();
    System.out.println("the distance is");
    System.out.println(speed*time);
    }
}