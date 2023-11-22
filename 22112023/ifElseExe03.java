import java.util.Scanner;

public class ifElseExe03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        String entrada = scanner.next();

        if (entrada.length() == 1) {
            char caractere = entrada.charAt(0);

            if (Character.isDigit(caractere)) {
                System.out.println("Você digitou um número.");
            } else if (Character.isLetter(caractere)) {
                System.out.println("Você digitou uma letra.");
            } else {
                System.out.println("Você digitou um caractere que não é uma letra nem um número.");
            }
        } else {
            System.out.println("Por favor, digite apenas um caractere.");
        }
        scanner.close();
    }
}