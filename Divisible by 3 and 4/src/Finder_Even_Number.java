import java.util.Scanner;

public class Finder_Even_Number {
    public static void main(String[] args) {
      int k,total=0, counter=0,average=0;
      Scanner inp = new Scanner(System.in);
      System.out.println("Bir sayı giriniz:");
      k = inp.nextInt();
      for (int i=0; i<=k; i++){
          if (i%3==0 &&50 i%4==0) {
              total += i;
              counter++;
          }
      }
        average = total/counter;
        System.out.println ("Avarage:" +average );
    }
}
