import java.util.Scanner;
public class Grocery_Store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pear,apple,tomato,banana,aubergine,total;

        System.out.println("How many pear weight?");
        pear = input.nextDouble();
        System.out.println("How many apple weight?");
        apple = input.nextDouble();
        System.out.println("How many tomato weight?");
        tomato = input.nextDouble();
        System.out.println("How many banana weight?");
        banana = input.nextDouble();
        System.out.println("How many aubergine weight?");
        aubergine = input.nextDouble();

        total = pear*2.14+apple*3.67+tomato*1.11+banana*0.95+aubergine*5.00;

        System.out.println("Amount to be paid:" + total);
    }
}
