import java.util.Scanner;

public class Even_and_Multible4 {
    public static void main(String[] args) {
        int i, total=0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Enter a number:");
            i = inp.nextInt();
            if (i%2==0 && i%4==0){
                total+=i;
            }
        }while (!(i%2 ==1));
            System.out.println("Sum of numbers:" +total);
        }
    }

