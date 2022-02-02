import java.util.Scanner;
public class kdvTutari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double KDVliFiyat,KDVMiktari,tutar,KDVOrani;

        System.out.println("Tutarı giriniz:");
        tutar = input.nextDouble();

        if (tutar<=1000){
            KDVOrani=0.18;
            KDVMiktari = tutar*KDVOrani;
            KDVliFiyat = tutar+KDVMiktari;

            System.out.println("KDV Oranı:" + KDVOrani);
            System.out.println("KDV Miktarı:" + KDVMiktari);
            System.out.println("KDV'li Fiyat:" + KDVliFiyat);
        }
        else {
            KDVOrani=0.08;
            KDVMiktari = tutar*KDVOrani;
            KDVliFiyat = tutar+KDVMiktari;

            System.out.println("KDV Oranı:" + KDVOrani);
            System.out.println("KDV Miktarı:" + KDVMiktari);
            System.out.println("KDV'li Fiyat:" + KDVliFiyat);
        }






    }
}
