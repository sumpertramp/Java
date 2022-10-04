import java.awt.geom.Area;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class minesweeper {
    static String[][] areaOfTheMineSweeper(int a, int b) {
        Random randomNumber = new Random();
        String[][] Area = new String[a][b];

        int low = 0;
        int highA = a;
        int highB = b;
        int mine = a * b / 4;
        int i = 0;

        // Mayin Koyma
        while (i < mine) {
            int randomrow = randomNumber.nextInt(highA - low) + low;
            int randomcol = randomNumber.nextInt(highB - low) + low;
            if (Area[randomrow][randomcol] != " * ") {
                Area[randomrow][randomcol] = " * ";
                i++;
            }

        }
        //Bosluklara - koyma
        for (i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (Area[i][j] != " * ") {
                    Area[i][j] = " - ";
                }
            }
        }
        return Area;
    }

    static void print(String[][] Area) {
        for (int i = 0; i < Area.length; i++) {
            for (int j = 0; j < Area[i].length; j++) {
                System.out.print(Area[i][j]);
            }
            System.out.println();
        }
    }

    static String[][] freeArea(int a, int b) {
        String[][] freeArea = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                freeArea[i][j] = " - ";
            }
        }
        return freeArea;
    }

    static String[][] check(String[][] Area, String[][] freeArea, int x, int y) {
        int mine = x * y / 4;
        int rest = (x * y) - mine;

        boolean continuation = true;

        while (continuation) {
            Scanner input = new Scanner(System.in);
            System.out.print("Select row: ");
            int a = input.nextInt();
            System.out.print("Select column: ");
            int b = input.nextInt();

            if (a < 0 || a >= x || b < 0 || b >= y){
                System.out.println("You entered an incorrect value.");
                continue;
            }

            if (Area[a][b].equals(" * ")) {
                System.out.println("===Game Over===");
                System.out.println("==MINESWEEPER==");
                minesweeper.print(Area);
                continuation = false;
                break;

            } else if (Area[a][b].equals(freeArea[a][b])) {
                int count = 0;
                for (int i = -1; i <= 1; i++) {
                    if (((a + i) < 0) || (a + i >= Area.length)) {
                        continue;
                    }
                    for (int j = -1; j <= 1; j++) {
                        if (((b + j) < 0) || (b + j >= Area.length)) {
                            continue;
                        }
                        if (Area[a + i][b + j].equals(" * ")) {
                            count++;
                        }
                    }
                }
                freeArea[a][b] = " " + count + " ";
                minesweeper.print(freeArea);
                rest--;
            }
            System.out.println("Rest freearea: " + rest);
            if (rest == 0) {
                System.out.println("Winner");
                break;
            }
        }
        return Area;
    }
}
