import java.util.Scanner;

public class exponentRecursive {

    static void exponent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value:");
        int base = input.nextInt();
        System.out.println("Enter the exponent value:");
        int exponent = input.nextInt();
        long result = 1;

        while(exponent !=0){
            for(int i=1; i<=exponent; i++){
                result *= base;
                --exponent;
            }
        }
        System.out.println("Result = "+result);
    }
    public static void main(String[] args) {
        exponent();
    }
}
