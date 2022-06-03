import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year:");
        year = input.nextInt();
        if (year>0) {
            if (year%4==0) {
                if (year%100== 0){
                    if (year%400 == 0){
                        System.out.println(year+"It is a leap year!");
                    }
                    else {
                        System.out.println(year+"It isn't a leap year!");
                    }
                } else  {
                    System.out.println(year+"It is a leap year!");
                }
            } else{
                System.out.println(year+"It isn't a leap year!");
            }
        } else {
            System.out.println("You entered an incorrect value.");
        }
    }
}
