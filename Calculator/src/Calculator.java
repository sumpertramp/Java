import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

                int num1,num2, select;

                Scanner input = new Scanner(System.in);
                System.out.print("İlk sayıyı giriniz:");
                num1 = input.nextInt();
                System.out.print("İkinci sayıyı giriniz:");
                num2 = input.nextInt();
                System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
                System.out.println("Seçiminiz nedir?");
                select = input.nextInt();
                System.out.println(select);

                switch(select) {
                    case 1:
                        System.out.println("Toplam:" +(num1 + num2));
                        break;
                    case 2:
                        System.out.println("Fark:" +(num1 - num2));
                        break;
                    case 3:
                        System.out.println("Çarpım:" +(num1 * num2));
                        break;
                    case 4:
                        if(num2 != 0){
                            System.out.println("Bölüm:" +(num1 - num2));
                        }else {
                            System.out.println("Herhangi bir sayı 0'a bölünmez.");
                        }
                        break;
                    default:
                        System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");


                }



    }

}





