import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row number : ");
        int a = input.nextInt();

        System.out.print("Enter the column number : ");
        int b = input.nextInt();

        String[][] Area = minesweeper.areaOfTheMineSweeper(a, b);
        String[][] freeArea = minesweeper.freeArea(a, b);
        minesweeper.print(freeArea);
        minesweeper.check(Area, freeArea, a, b);
    }
}