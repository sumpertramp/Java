import java.util.Arrays;

public class frequenciesArray {
    public static void main(String[] args) {

        int[] array={12,25,63,12,18,12,25,18};
        int repetition=1;
        int n=0;
        Arrays.sort(array);

        for(int i=0;i< array.length;i++){
            if(array[i]!=n){
                for(int j=0;j<array.length;j++){
                    if ((i!=j) && (array[i] == array[j])) {
                        repetition++;
                        n=array[i];
                    }
                }

                System.out.println("The number "+array[i] +" was repeated " + repetition + " times.");
                repetition=1;

            }
        }
    }
}
