package Atividade16;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        float numero;
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um numero: ");
        numero = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf(i+ " * " +numero+ " = %.0f", numero*i);
            System.out.printf("\t\t" +i+ " / " +numero+ " = %.2f\n", numero/i);
        }
    }
}