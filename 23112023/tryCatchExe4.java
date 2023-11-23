import java.util.Scanner;

public class tryCatchExe4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.print("Digite um valor:\n");
        long valor = scanner.nextLong();
        System.out.print("O valor digitado é: " + valor);
        }catch(java.util.InputMismatchException e){
            System.out.print("Entrada invalida!");
        }finally{
            scanner.close();
        }
}
}