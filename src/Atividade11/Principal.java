package Atividade11;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int numero;
        int contador = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        numero = input.nextInt();

        for(int i = 0; i <= numero; i++){
            if (contador % 2 == 0){
                System.out.printf("%d ", contador);
            }
            contador++;
        }
    }
}
