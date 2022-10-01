import java.util.Arrays;
import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int[][] list={{8,5,7},{2,5,4},{1,3,9}};
        System.out.println("The array to transpose: ");

        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list.length ; j++) {
                System.out.print(list[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose of the array: ");
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j][i]);
            }
            System.out.println();
        }
    }
}
