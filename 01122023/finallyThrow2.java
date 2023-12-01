public class finallyThrow2 {

    public static void main(String[] args) {
        int f = 12;
        for (int i = 0; i < f; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Continuar assistindo");
                if (i == 6) {
                    throw new AssistMtTempoException("Você assistiu por muito tempo. Faça uma pausa!");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (AssistMtTempoException e) {
                System.out.println("Erro: " + e.getMessage());
                break;
            }
            finally{
                System.out.println("....");
            }
        }
    }
}

class AssistMtTempoException extends Exception {

    public AssistMtTempoException(String message) {
        super(message);
    }
}