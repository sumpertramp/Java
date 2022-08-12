public class B {
    public static void main(String[] args) {

        String[][] character = new String[7][4];

        for (int i =0; i < character.length; i++ ){
            for (int j = 0; j < character[i].length; j++){
                if (i == 0 || i == 3 || i == 6){
                    character[i][j] = "* ";
                }else if (j == 0 || j == 3 ){
                    character [i][j] = "* ";
                }else {
                    character[i][j] = "  ";
                }
            }
        }

        for (String[] row : character) {
            for (String coloumn : row){
                System.out.print(coloumn);
            }
            System.out.println();
        }
    }
}
