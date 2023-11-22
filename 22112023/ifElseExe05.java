import java.util.Scanner;

public class ifElseExe05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura do pacote: ");
        String altura = scanner.next();
        Float Faltura = Float.parseFloat(altura);
        System.out.print("Digite a largura do pacote:");
        String largura = scanner.next();
        Float Flargura = Float.parseFloat(largura);
        System.out.print("Digite o comprimento do pacote: ");
        String comprimento = scanner.next();
        Float Fcomprimento = Float.parseFloat(comprimento);
        Float Result = (Fcomprimento * Flargura * Faltura);
        System.out.print("tamanho: " + Result);
        if (Result >= 3.00){
            System.out.print("O pacote é muito grande para enviar!");
        }else {
            System.out.print("O pacote será enviado");
        }
        scanner.close();
    }
}
