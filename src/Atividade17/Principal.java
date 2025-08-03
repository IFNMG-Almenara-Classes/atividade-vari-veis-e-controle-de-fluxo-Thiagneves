package Atividade17;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int numero;
        int fatorial;
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva um numero: ");
        numero = input.nextInt();
        fatorial = numero;

        for(int i = 1; i < numero; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de " +numero+ " é " +fatorial);

    }
}
