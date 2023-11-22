import java.util.Scanner;

public class ifElseExe02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Você deseja fazer o calculo de dois números? ");
        String respYesNo = scanner.nextLine();
         if ("Não".equalsIgnoreCase(respYesNo) || "N".equalsIgnoreCase(respYesNo)){
        System.out.println("DESLIGANDO.....");
        }else {
        System.out.print("Digite o primeiro número: ");
        String num1 = scanner.nextLine();
        Float Num1 = Float.parseFloat(num1);
        System.out.print("Digite o segundo número: ");
        String num2 = scanner.nextLine();
        Float Num2 = Float.parseFloat(num2);
        System.out.print("a soma dos números é: " + (Num1+Num2));
        }

       
        scanner.close();
    }
}