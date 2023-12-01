import java.util.Scanner;
import java.util.InputMismatchException;

public class finallyThrow1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o login: ");
        String login = scanner.nextLine();
        try {
            System.out.print("Digite a senha: ");
            int senha = scanner.nextInt();          
            System.out.println("Cadastro realizado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: A senha deve conter apenas números.");
        } finally {
            scanner.close();
        }
    }
}