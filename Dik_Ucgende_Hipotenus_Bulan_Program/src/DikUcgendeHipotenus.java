import java.util.Scanner;
public class DikUcgendeHipotenus {
    public static void main(String[] args) {

        double cevre,alaninkaresi,alan,u;

        Scanner input = new Scanner(System.in);

        System.out.println("Dik kenarlardan birincisini giriniz:");
        int a = input.nextInt();

        System.out.println("Dik kenarlardan ikincisini giriniz:");
        int b = input.nextInt();

        System.out.println("Hipotenüs uzunluğunu giriniz:");
        int c = input.nextInt();

        u = (a+b+c)/2;
        cevre = 2*u;
        alaninkaresi = u*(u-a)*(u-b)*(u-c);
        alan = Math.sqrt(alaninkaresi);

        System.out.println("Üçgenin çevresi:" + cevre);
        System.out.println("Üçgenin alanı:"+alan);

    }
}
