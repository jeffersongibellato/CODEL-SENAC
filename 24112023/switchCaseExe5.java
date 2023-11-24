public class switchCaseExe5 {

    public static void main(String[] args) {
        boolean portaFechada = true;

        for (int segundo = 0; segundo < 24 * 60 * 60; segundo++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (segundo == 20) {
                switch (segundo) {
                    case 20:
                        System.out.println("Abre a porta às " + segundo);
                        portaFechada = false;
                        break;
                    default:
                        System.out.println("Aguardando...");
                }
            } else {
                System.out.println("Aguardando...");
            }
        }
    }
}