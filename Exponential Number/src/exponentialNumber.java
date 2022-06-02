import java.util.Scanner;

public class exponentialNumber {
    public static void main(String[] args) {

        int n, r, i;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to base:");
        n = input.nextInt();
        System.out.println("Enter number to exponent:");
        r = input.nextInt();

        for (i=1; i<=r; i++){
            total*=n;
        }
        System.out.println("Total=" + total);
    }
}
