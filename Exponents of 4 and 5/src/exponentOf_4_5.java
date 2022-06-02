import java.util.Scanner;

public class exponentOf_4_5 {
    public static void main(String[] args) {

        int n,i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = input.nextInt();

        for (i=1; i<=n; i*=4) {
            System.out.println(i);
        }
        for (j=1; j<=n; j*=5){
            System.out.println(j);
        }
    }
}
