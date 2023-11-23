import java.util.Scanner;

public class tryCatchExe1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.print("Calculo de IMC:\n");
        System.out.print("Digite o seu peso:\n");
        double peso = scanner.nextDouble();
        System.out.print("Digite a sua altura:\n");
        double altura = scanner.nextDouble();
        double imc = peso/(altura*altura);
        System.out.print("o seu imc é: " + imc);
        }catch(java.util.InputMismatchException e){
            System.out.print("Entrada invalida!");
        }finally{
            scanner.close();
        }
}
}