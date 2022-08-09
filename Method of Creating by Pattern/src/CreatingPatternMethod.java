import java.util.Scanner;

public class CreatingPatternMethod {

    static void creation (int n) {
        if (n>0) {
            System.out.print( n + " ");
            creation (n-5);
        }
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Number of N : ");
        int n = input.nextInt();
        System.out.println("Creation: ");
        creation(n);
        System.out.println();
        input.close();
    }
}
