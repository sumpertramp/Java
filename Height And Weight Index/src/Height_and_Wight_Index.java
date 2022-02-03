import java.util.Scanner;
public class Height_and_Wight_Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height,weight,index;

        System.out.println("What is your height(m)?");
        height = input.nextDouble();
        System.out.println("What is your weight(kg)?");
        weight = input.nextDouble();

        index = weight/(height*height);
        System.out.println("Your body index is "+index);
    }
}
