import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter Value:");
        int n=input.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int m=1;m<=n;m++){
            for (int x=1;x<=m;x++){
                System.out.print(" ");
            }
            for (int y=1;y<=2*(n-m)-1;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
