public class doWhileExe3 {

    public static void main(String[] args) {
        String[][] texto = new String[2][3];

        texto[0][0] = "texto 1";
        texto[0][1] = "texto 2";
        texto[0][2] = "texto 3";
        texto[1][0] = "texto 4";
        texto[1][1] = "texto 5";
        texto[1][2] = "texto 6";

        for (int i = 0; i < texto.length; i++) {
            for (int j = 0; j < texto[i].length; j++) {
                System.out.print(texto[i][j] + " ");
            }
        }
    }
}