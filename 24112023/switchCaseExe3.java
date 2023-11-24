import java.util.Scanner;

public class switchCaseExe3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ventilador = {"Ligado", "Desligado"};
        int ligDeslig = 1000;
        
        for(int i=0; i<=ligDeslig; i++){
            System.out.println("Desligue ou ligue o ventilador:\n 1-Ligar\n 2-Desligar\n");
            int apagarLig = scanner.nextInt();
            switch(apagarLig){
                case 1: System.out.println("Ventilador está:" +  ventilador[0]);
                break;
                case 2: System.out.println("Ventilador está:" + ventilador[1]);
                break;
                default: System.out.println("Numero invalido!");
            }
        }
       
    }
}