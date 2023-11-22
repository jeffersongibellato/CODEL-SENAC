import java.util.Scanner;

public class ifElseExe01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        String idade = scanner.nextLine();
        System.out.print("Você é o(a) usuário(a): " + nome + "?");
        String validacao = scanner.nextLine();
        if ("Sim".equalsIgnoreCase(validacao)){
            System.out.println("DADOS\n" + "NOME: " + nome + "\nIDADE: " + idade);
        }else {
            System.out.println("DESLIGANDO.....");
        }
        scanner.close();
    }
}
