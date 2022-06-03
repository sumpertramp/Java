import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {

        int number, result=0, remain;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = input.nextInt();

        while (number !=0){
            remain=number%10;
            number /=10;
            result +=remain;

        }
        System.out.println("The sum of the digits of a number:"+result);
    }
}
