import java.util.Scanner;

public class switchCaseExe4 {

    public static void main(String[] args) {
        
        String[] salas = {"Sala 1", "Sala 2", "Sala 3", "Sala 4"};
        System.out.println("Selecione a classificação da idade do filme que você quer assistir: ");
        System.out.println("\n1-Livre para todos os Públicos\n2-Acima dos 10 anos\n3-Acima de 14 anos\n4-Acima dos 18 anos");
        Scanner scanner = new Scanner(System.in);
        int setSala = scanner.nextInt();
        switch(setSala){
            case 1: System.out.println("A sala para o seu filme é a: " + salas[0]);
            break;
            case 2: System.out.println("A sala para o seu filme é a: " + salas[1]);
            break;
            case 3: System.out.println("A sala para o seu filme é a: " + salas[2]);
            break;
            case 4: System.out.println("A sala para o seu filme é a: " + salas[3]);
            break;
            default: System.out.println("Numero invalido!");
        }
    }
}