public class doWhileExe1 {
    public static void main(String[] args) {
        int f = 120;

        for (int i = 0; i < f; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Continuar assistindo");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
