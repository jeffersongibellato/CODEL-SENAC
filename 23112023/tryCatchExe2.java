import java.util.Scanner;

public class tryCatchExe2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.print("Calculo de Metro Quadrado:\n");
        System.out.print("Digite a largura:\n");
        int largura = scanner.nextInt();
        System.out.print("Digite o comprimento:\n");
        int comprimento = scanner.nextInt();
        int metroQ = largura*comprimento;
        System.out.print("o calculo é igual a: " + metroQ + " metros quadrados.");
        }catch(java.util.InputMismatchException e){
            System.out.print("Entrada invalida!");
        }finally{
            scanner.close();
        }
}
}