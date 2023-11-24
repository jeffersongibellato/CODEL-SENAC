import java.util.Scanner;

public class switchCaseExe1 {

    public static void main(String[] args) {
        
        String[] colors = {"Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"};
        System.out.println("Selecione um dos números das cores do arco-íris para alterar o fundo da tela:");
        System.out.println("\n1-VERMELHO\n2-LARANJA\n3-AMARELO\n4-VERDE\n5-AZUL\n6-ANIL\n7-VIOLETA");
        Scanner scanner = new Scanner(System.in);
        int setColor = scanner.nextInt();
        switch(setColor){
            case 1: System.out.println("A cor de fundo foi alterado para: " + colors[0]);
            break;
            case 2: System.out.println("A cor de fundo foi alterado para: " + colors[1]);
            break;
            case 3: System.out.println("A cor de fundo foi alterado para: " + colors[2]);
            break;
            case 4: System.out.println("A cor de fundo foi alterado para: " + colors[3]);
            break;
            case 5: System.out.println("A cor de fundo foi alterado para: " + colors[4]);
            break;
            case 6: System.out.println("A cor de fundo foi alterado para: " + colors[5]);
            break;
            case 7: System.out.println("A cor de fundo foi alterado para: " + colors[6]);
            break;
            default: System.out.println("Numero invalido!");
        }
    }
}