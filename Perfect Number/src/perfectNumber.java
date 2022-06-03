import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {

        int number, i, total=0;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        number = input.nextInt();

        for (i=1; i<number; i++){
            if (number%i==0){
                total+=i;
            }
        }

        if (total == number){
            System.out.println("This is a perfect number.");
        }else{
            System.out.println("This isn't a perfect number.");
        }
    }
}
