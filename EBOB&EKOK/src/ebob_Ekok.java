import java.util.Scanner;

public class ebob_Ekok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1,num2,i=1, j=1, ebob=1, ekok=1;
        System.out.println("Enter the first number:");
        num1 = input.nextInt();
        System.out.println("Enter the second number:");
        num2 = input.nextInt();

        while (i<num1 && i<num2){
            if (num1%i==0 && num2%i==0){
                ebob=i;
            }
            i++;
        }
        System.out.println("Ebob:"+ebob);

        while (j<num1*num2){
            if (j%num1==0 && j%num2==0){
                ekok=j;
            }
            j++;
        }
        System.out.println("Ekok:"+ekok);
    }
}
