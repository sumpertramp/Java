import java.util.Scanner;

public class primeNumber {

    static void prime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int counter = 0;
        for (int i = 1; i<=number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if(counter == 2){
            System.out.println("The number prime number.");
        }else{
            System.out.println("The number is not prime number.");
        }



    }
    public static void main(String[] args) {
        prime();
    }
}
