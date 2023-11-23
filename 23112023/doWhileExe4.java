import java.util.Scanner;

public class doWhileExe4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float precoCarrinho = 0;
        String yesNo;

        do {
            System.out.print("Escreva o nome do produto: ");
            String produto = scanner.nextLine();
            System.out.print("Escreva o preço do produto: ");
            float precoProduto = scanner.nextFloat();
            scanner.nextLine(); 
            precoCarrinho += precoProduto;

            System.out.print("Você deseja comprar mais alguma coisa? (Sim/Não): ");
            yesNo = scanner.nextLine();
        } while ("Sim".equalsIgnoreCase(yesNo));
        System.out.println("O carrinho deu R$" + precoCarrinho);
        scanner.close();
    }
}