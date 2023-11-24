import java.util.Scanner;

public class switchCaseExe2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lampada = {"Acessa", "Apagada"};
        int luz = 1000;
        
        for(int i=0; i<=luz; i++){
            System.out.println("Apague ou ligue a luz:\n 1-Acender\n 2-Apagar\n");
            int apagarAc = scanner.nextInt();
            switch(apagarAc){
                case 1: System.out.println("Luz está:" + lampada[0]);
                break;
                case 2: System.out.println("Luz está:" + lampada[1]);
                break;
                default: System.out.println("Numero invalido!");
            }
        }
       
    }
}