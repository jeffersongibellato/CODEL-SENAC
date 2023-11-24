import java.util.Scanner;

public class forEachExe3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[][] frutas = new String[2][3];
    frutas[0][0] = "Banana";
    frutas[0][1] = "Maça";
    frutas[0][2] = "Manga";
    frutas[1][0] = "Mamão";
    frutas[1][1] = "Cereja";
    frutas[1][2] = "Pitanga";
    System.out.println("Você quer comprar frutas? ");
    String yesNo = scanner.nextLine();
        do{
        for (String[] sFruta : frutas){
        for (String showFruta : sFruta) {
        System.out.println(showFruta);
        }}
        System.out.print("Qual fruta você deseja comprar?\n");
        String setFruta = scanner.nextLine();
        System.out.println(setFruta + "Adicionado na lista de compras");
        System.out.print("\nVocê deseja comprar mais alguma coisa? (Sim/Não):\n ");
        yesNo = scanner.nextLine();
        } while ("Sim".equalsIgnoreCase(yesNo));
        
    }
}