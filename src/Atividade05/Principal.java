package Atividade05;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int laranja;
        float calculo;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas laranjas foram compradas? ");
        laranja = input.nextInt();

        if(laranja < 7){
            calculo = (float) (laranja * 0.5);
            System.out.println("Valor a pagar: " +calculo);
        } else {
            calculo = (float) (laranja * 0.3);
            System.out.println("Valor a pagar: " +calculo);
        }
    }
}
