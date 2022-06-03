import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {

        int counter, number, i, min=0, max=0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        counter = input.nextInt();

        for (i=1; i<counter; i++){
            System.out.println(i+"-Enter the number?");
            number = input.nextInt();

            if (i==1){
                max=number;
                min=number;
            }else{
                if (number>max){
                    max=number;
                }else if (number<min){
                    min = number;
                }
            }
        }
        System.out.println("Max number=" +max);
        System.out.println("Min number=" +min);
    }
}
