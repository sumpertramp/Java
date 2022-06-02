import java.util.Scanner;

public class combination {
    public static void main(String[] args) {

        int n,r,i, nr;
        int nFaktorial=1, rFaktorial=1, nrFaktorial=1;
        double combination;

        Scanner input = new Scanner(System.in);
        System.out.println("n=?");
        n = input.nextInt();
        System.out.println("r=?");
        r = input.nextInt();

        nr = n-r;

        for (i=1; i<=n; i++){
            nFaktorial*=i;
        }
        for (i=1; i<=r; i++){
            rFaktorial*=i;
        }
        for (i=1; i<=nr; i++){
            nrFaktorial*=i;
        }

        combination = nFaktorial/rFaktorial*nrFaktorial;
        System.out.println("r combination of n:" +combination);
    }
}
