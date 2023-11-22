import java.util.Scanner;

public class ifElseExe04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        String idade = scanner.next().trim();
        Float IntIdade = Float.parseFloat(idade);
        if (IntIdade >= 18) {
        System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você é menor de idade");
        }

        scanner.close();
    }
}
