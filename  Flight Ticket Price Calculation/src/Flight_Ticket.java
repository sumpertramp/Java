import java.util.Scanner;

public class Flight_Ticket {
    public static void main(String[] args) {
        int distance, age, tripType;
        double normalAmount, discointedAmount, ageDiscount, totalAmount = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance:");
        distance = input.nextInt();
        System.out.println("How old are you?");
        age = input.nextInt();
        System.out.println("Chose your trip type?:(1=>One way, 2=>Round trip)");
        tripType = input.nextInt();

        if (distance<0 | age<0){
            System.out.println("You entered incorrect data!");
        }
        if (age<=12 && tripType == 1){

            normalAmount = distance * 0.10;
            ageDiscount = normalAmount*0.5;
            discointedAmount = normalAmount - ageDiscount;
            totalAmount = discointedAmount;
           System.out.println("Total Amount:" + totalAmount);

        }else if(age<=12 && tripType == 2) {

            normalAmount = distance * 0.10;
            ageDiscount = normalAmount*0.5;
            discointedAmount = normalAmount - ageDiscount;
            discointedAmount = discointedAmount - discointedAmount*0.2;
            totalAmount = 2*discointedAmount;
            System.out.println("Total Amount:" + totalAmount);

        }else if (age>12 && age <=24 && tripType == 1){

            normalAmount = distance * 0.10;
            ageDiscount = normalAmount*0.10;
            discointedAmount = normalAmount - ageDiscount;
            totalAmount = discointedAmount;
            System.out.println("Total Amount:" + totalAmount)
            ;
        }else if (age>12 && age <24 && tripType == 2) {

            normalAmount = distance * 0.10;
            ageDiscount = normalAmount*0.10;
            discointedAmount = normalAmount - ageDiscount;
            discointedAmount = discointedAmount - discointedAmount*0.2;
            totalAmount = 2*discointedAmount;
            System.out.println("Total Amount:" + totalAmount);

        }else if (age>=24 && age<=65 && tripType == 1 ) {

            normalAmount = distance * 0.10;
            totalAmount = normalAmount;
            System.out.println("Total Amount:" + totalAmount);

        }else if (age>=24 && age<=65 && tripType == 2 ) {

            normalAmount = distance * 0.10;
            discointedAmount = normalAmount;
            discointedAmount = discointedAmount - discointedAmount*0.2;
            totalAmount = 2*discointedAmount;
            System.out.println("Total Amount:" + totalAmount);

        }else if (age>65 && tripType == 1){

            normalAmount = distance * 0.10;
            ageDiscount = normalAmount*0.30;
            discointedAmount = normalAmount - ageDiscount;
            totalAmount = discointedAmount;
            System.out.println("Total Amount:" + totalAmount);

        }else if (age>65 && tripType == 2){

            normalAmount = distance * 0.10;
            ageDiscount = normalAmount*0.30;
            discointedAmount = normalAmount - ageDiscount;
            discointedAmount = discointedAmount - discointedAmount*0.2;
            totalAmount = 2*discointedAmount;
            System.out.println("Total Amount:" + totalAmount);
        }
    }
}
