import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class numberGuessingGame {
    public static void main(String[] args) {

        //int number = (int)Math.random()*100; //İlk yöntem math sınıfı ile
        Random rand = new Random();
        int number = rand.nextInt(100); //2. yöntem

        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        //System.out.println(number);

        while(right < 5){
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if(isWrong) {
                    right ++;
                    System.out.println("Çok fazla hatalı giriş giriş yaptınız. Kalan hak: " + (5 - right));
                }else{
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number){
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğin sayı: " + number);
                isWin = true;
                break;
            }else{
                System.out.println("Hataı bir sayı girdiniz.");
                if (selected > number){
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                }else{
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong [right ++] = selected;
                System.out.println("Kalan hakkı: " + (5 - right));
            }
        }

        if (!isWin){
            System.out.println("kaybettiniz!");
            if (!isWrong){
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
    }
}
