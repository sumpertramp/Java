import java.util.Scanner;

public class palindromicWords {

    static boolean isPalindromic(String str){
        int i = 0;
        int j = 0;
        j = str.length()-1;

        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindromic2 (String str){
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = "";

        while(!word.equals("0")) {
            System.out.print("Bir kelime giriniz: ");
            word = input.next();

            if (isPalindromic(word) && !word.equals("0")) {
                System.out.println("* " + word + " palindrom bir kelimedir.");
            } else if (!isPalindromic(word) && !word.equals("0")) {
                System.out.println("* " + word + " palindrom bir kelime değildir.");
            }
        }
    }
}
