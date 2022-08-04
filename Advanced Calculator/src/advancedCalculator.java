import java.util.Scanner;

public class advancedCalculator {


    static void Addition(){
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while(true){
            System.out.print(i++ + ".number:");
            number = input.nextInt();
            if(number == 0){
                break;
            }
            result += number;
        }
        System.out.println("Result:" + result);
    }

    static void Subtraction() {

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter?");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".number:");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.print("Result:" + result);
    }

    static void Multiplication(){
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;

        while(true){
            System.out.print(i++ + ".number:");
            number = input.nextInt();

            if(number == 1){
                break;
            }
            if (number == 0){
                result = 0;
                break;
            }
            result*=number;
        }
        System.out.print("Result:" + result);
    }
    static void Division() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter?");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number:");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni '0' giremezsiniz!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result: " + result);
    }

    static void Exponent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value:");
        int base = input.nextInt();
        System.out.print("Enter the exponent:");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result:" + result);
    }

    static void Factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result: " + result);
    }

    static void modProcess(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = input.nextInt();
        if (n%2 == 0){
            System.out.println("Input is an even number");
        }else{
            System.out.println("Input is an odd number");
        }
    }

    static void Rectangle(){
        int area = 0, perimeter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the long side of the rectangle:");
        int a = input.nextInt();
        System.out.println("Enter the short side of the rectangle:");
        int b = input.nextInt();
        area = 2*(a+b);
        perimeter = a*b;
        System.out.println( "Area of ractangle is:" + area);
        System.out.println("Perimeter of rectangle is:" + perimeter);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1 - Addition\n"
                + "2 - Subtraction\n"
                + "3 - Multiplication\n"
                + "4 - Division\n"
                + "5 - Exponent Calculation\n"
                + "6 - Factorial Calculation\n"
                + "7 - The Mod Process\n"
                + "8 - Rectangle Area and Perimeter Calculation\n"
                + "0 - Exit";

        do {
            System.out.println(menu);
            System.out.println("Please elect an action:");
            select = input.nextInt();
            switch(select){
                case 1:
                    Addition();
                    break;
                case 2:
                    Subtraction();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    Exponent();
                    break;
                case 6:
                    Factorial();
                    break;
                case 7:
                    modProcess();
                    break;
                case 8:
                    Rectangle();
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again.");
            }
        } while(select != 0);
    }
}
