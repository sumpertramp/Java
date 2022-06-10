import java.util.Scanner;

public class palindromeNumber {

    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            System.out.println("This number is a palindrome.");
            return true;
        } else {
            System.out.println("This number isn't palindrome.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = inp.nextInt();
        System.out.println(isPalindrome(n));
    }
}
