import java.util.Scanner;
public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        double birimFiyat, toplamFiyat, baslangicFiyat;


        System.out.println("Mesafeyi km olarak giriniz:");
        km = input.nextInt();
        birimFiyat = 2.20;
        baslangicFiyat = 10;

        toplamFiyat = baslangicFiyat + birimFiyat*km;

        if (toplamFiyat<20){
            toplamFiyat = 20;
            System.out.println("Taksimetre:" + toplamFiyat);
        }else{
            System.out.println("Taksimetre:" + toplamFiyat);
        }





    }
}
