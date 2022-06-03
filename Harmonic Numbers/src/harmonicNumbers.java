import java.util.Scanner;

public class harmonicNumbers {
    public static void main(String[] args) {

        int number,i;
        double harm=0, unit=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = input.nextInt();

        for (i=1; i<number; i++){
            unit = (1.0/i);
            harm+=unit;
        }
        System.out.println(harm);
    }
}
