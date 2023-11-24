import java.util.Random;

public class forEachExe2 {

    public static void main(String[] args) {
        String[] nomes = {"Rodrigo", "Caio", "Henrique", "Carol", "Igor"};
        Random random = new Random();
        for (int i = nomes.length - 1; i > 0; i--) {
            int indiceAleatorio = random.nextInt(i + 1);
            String temp = nomes[i];
            nomes[i] = nomes[indiceAleatorio];
            nomes[indiceAleatorio] = temp;
        }
        for (int i = 0; i < nomes.length; i++) {
            int j;
            if (i==0){
                j = i+1;
            }else if (i==4){
                j = i-1;
            }else {
                j = i+1;
            }
            System.out.println(nomes[i] + " tirou " + nomes[j]);
        }
    }
}