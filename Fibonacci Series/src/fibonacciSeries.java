import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {

        int ser, i, fin=0, fout=0, fn=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of series:");
        ser = input.nextInt();

        for (i = 0; i <= ser; i++) {

            System.out.print(fout + " ");

            fin=fout + fn ;
            fout=fn;
            fn=fin;
        }
    }
}
