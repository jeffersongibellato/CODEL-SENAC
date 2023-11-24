public class forEachExe1 {

    public static void main(String[] args) {
    String[][] colors = new String[2][3];
    colors[0][0] = "Azul";
    colors[0][1] = "Vermelho";
    colors[0][2] = "Amarelo";
    colors[1][0] = "Verde";
    colors[1][1] = "Roxo";
    colors[1][2] = "Rosa";
        for (String[] row : colors){
        for (String color : row) {
            System.out.println(color);
        }}
    }
}