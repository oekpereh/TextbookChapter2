import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double PI = 3.1416; //PI value
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();

        double baseArea = PI * radius * radius; //to get baseArea of a cylinder
        double volume = baseArea * length; //to get volume of a cylinder
        System.out.println("The base area is: " +baseArea);
        System.out.println("The volume is: " +volume);
    }
}
