import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,Password;
        int remain=3,balance=1500,select,add,subtract;



        do {
            System.out.print("Username:");
            userName=input.nextLine();
            System.out.print("Password:");
            Password=input.nextLine();

            if (userName.equals("patika") && Password.equals("dev123")){
                System.out.println("Welcome the Bank");

                do {
                    System.out.println("1-Deposit Money\n"+"2-Withdraw Money\n"
                            +"3-Balance Inquiry\n"+"4-Exit\n");
                    System.out.print("Select the option:");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Enter the amount what you want to add:");
                            add=input.nextInt();
                            balance+=add;
                            break;
                        case 2:
                            System.out.print("Enter the amount what you want to subtract:");
                            subtract = input.nextInt();
                            if (balance>subtract) {

                                balance -= subtract;

                            }else {
                                System.out.println("Insufficient balance.");
                            }
                            break;
                        case 3:
                            System.out.println("-----------------");
                            System.out.println("Your Balance:"+balance);
                            break;
                        case 4:
                            System.out.println("See you later.");
                            remain=0;
                            break;

                    }
                }while(select !=4);

            }else{
                System.out.println("Wrong Value\n"+"Remaining Right:"+--remain);
                if(remain==0){
                    System.out.println("Your account has been blocked. Please call the bank");
                }
            }

        }while (remain>0);
    }
}


