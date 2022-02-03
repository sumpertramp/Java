import java.util.Scanner;
public class Area_Of_The_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double p= 3.14;
        double radius, angle, area;

        System.out.println("Enter the radius of the circle:");
        radius = input.nextDouble();
        System.out.println("Enter the center angle value:");
        angle = input.nextDouble();

        area =(p*(radius*radius)*angle)/360;

        System.out.println("Area of the circle:" + area);








    }
}
