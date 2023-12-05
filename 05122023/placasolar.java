import java.util.*;
public class placasolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int QuantPlaca;
        System.out.println("O local aonde as placas ficarão recebe quantas horas de sol por dia?");
        float QuantHrSol = scanner.nextFloat();
        System.out.println("Quantos hectares serão energizados?");
        int QuantHec = scanner.nextInt();
        float QuantEnergia = (QuantHrSol*0.36f);
        if (QuantEnergia>=4.68f){
            QuantPlaca = 3*QuantHec;
        }else if(QuantEnergia>= 3.7f){
            QuantPlaca = 2*QuantHec;
        }else{
            QuantPlaca = 1*QuantHec;
        }
        System.out.println("A quantidade de placas necessárias para energizar toda a platação é: " + QuantPlaca);

    }
}
