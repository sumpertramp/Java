import javax.swing.*;
import java.util.Scanner;

public class starTriangle {
    public static void main(String[] args) {

        int number,i,j,k;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of digits:");
        number = input.nextInt();

        for (i=1; i<=number; i++){
            for (j=1; j<=(number-i); j++){
                System.out.print(" ");
            }
            for (k=1; k<=((2*i)-1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
