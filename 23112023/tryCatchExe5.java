public class tryCatchExe5 {

    public static void main(String[] args) {
        int contador = 0;

        do {
            try {
                if (contador == 5) {
                    throw new RuntimeException("Exceção lançada no contador 5");
                }

                System.out.println("Contador: " + contador);
                contador++;
            } catch (RuntimeException e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            }
        } while (contador < 10);
    }
}