import java.util.Scanner;

public class Pass_The_Class {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music, total = 0;
        double avarage;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        math = input.nextInt();

        if (math<0 || math>100){
            System.out.println("Matematik notunuzu yanlış girdiniz. Lütfen 0 ile 100 arasında bir değer giriniz:");
            math = input.nextInt();
            total += math;
        }else {
            total += math;
        }

        System.out.println("Fizik notunuz:");
        physics = input.nextInt();

        if (physics<0 || physics>100){
            System.out.println("Fizik notunuzu yanlış girdiniz. Lütfen 0 ile 100 arasında bir değer giriniz:");
            physics = input.nextInt();
            total += physics;
        }else {
            total += physics;
        }


        System.out.println("Türkçe notunuz:");
        turkish = input.nextInt();

        if (turkish<0 || turkish>100){
            System.out.println("Türkçe notunuzu yanlış girdiniz. Lütfen 0 ile 100 arasında bir değer giriniz:");
            turkish = input.nextInt();
            total += turkish;

        }else {
            total += turkish;
        }

        System.out.println("Kimya notunuz:");
        chemistry = input.nextInt();

        if (chemistry<0 || chemistry>100){
            System.out.println("Kimya notunuzu yanlış girdiniz. Lütfen 0 ile 100 arasında bir değer giriniz:");
            chemistry = input.nextInt();
            total += chemistry;
        }else {
            total += chemistry;
        }

        System.out.println("Müzik notunuz:");
        music = input.nextInt();

        if (music<0 || music>100){
            System.out.println("Müzik notunuzu yanlış girdiniz. Lütfen 0 ile 100 arasında bir değer giriniz:");
            music = input.nextInt();
            total += music;
        }else {
            total += music;
        }

        avarage = total/5;

        if (avarage<=55){
            System.out.println("Ortalamanız:" +avarage);
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        }else{
            System.out.println("Tebrikler, sınıfı geçtiniz.");
            System.out.println("Ortalamanız:" +avarage);
        }









    }
}
