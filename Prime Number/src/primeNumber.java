public class primeNumber {
    public static void main(String[] args) {
        int counter,i,j;
        String primeNumber = "";

        for (i=1; i<100; i++) {
            counter = 0;

            for (j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter ++;
                }
            }
            if (counter == 2) {
                primeNumber = primeNumber + i + " ";
            }
        }
        System.out.println(primeNumber);
    }
}
