import java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik,toplam;
        float ort;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat=input.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik=input.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya=input.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarih=input.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muzik=input.nextInt();
        toplam = mat+fizik+kimya+turkce+tarih+muzik;
        ort=toplam/6;
        System.out.println("Not ortalamanız:"+ort);
        System.out.println(ort > 60 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.");
    }
}
