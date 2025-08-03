package Atividade12;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        int media = 0;
        int contador = 0;
        do{
            System.out.println("Digite um numero inteiro positivo: ");
            numero = input.nextInt();

            if(numero % 2 == 0){
                media += numero;
                contador++;
            }
        } while (numero != 0);
        System.out.printf("Foram inseridos " +contador+ " numeros pares e sua media é de %d", media/2);
    }
}
