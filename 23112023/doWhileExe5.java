import java.util.Scanner;

public class doWhileExe5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vel = 0;
        String yesNo;
        do {
            vel = vel + 10;
            System.out.print("Você está a " + vel + "km/h");
            System.out.print("\nA viagem acabou?");
            yesNo = scanner.nextLine().toLowerCase();
        } while ("nao".equalsIgnoreCase(yesNo));
            System.out.print("Você está a:" + vel + "km/h" + "\n A viagem acabou.");
        scanner.close();
    }
}