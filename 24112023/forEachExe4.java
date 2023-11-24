public class forEachExe4 {
    public static void main(String[] args) {
        int f = 120;

        for (int i = 0; i < f; i++) {
            try {
                Thread.sleep(5000);
                System.out.println("5 segundos se passaram...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
