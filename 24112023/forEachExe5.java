import java.util.Scanner;

public class forEachExe5 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[][] produtos = new String[2][3];
    produtos[0][0] = "Fone de Ouvido";
    produtos[0][1] = "Fonte";
    produtos[0][2] = "Monitor";
    produtos[1][0] = "Placa Mãe";
    produtos[1][1] = "Teclado";
    produtos[1][2] = "Mouse";
    System.out.println("LOJA DE INFORMÁTICA\n");
    System.out.println("Você quer comprar alguma coisa? ");
    String yesNo = scanner.nextLine();
        do{
        for (String[] sProduto : produtos){
        for (String showProduto : sProduto) {
        System.out.println(showProduto);
        }}
        System.out.print("Qual produto você deseja comprar?\n");
        String setProduto = scanner.nextLine();
        System.out.println(setProduto + " Adicionado na lista de compras");
        System.out.print("\nVocê deseja comprar mais alguma coisa? (Sim/Não):\n ");
        yesNo = scanner.nextLine();
        } while ("Sim".equalsIgnoreCase(yesNo));
        
    }
}