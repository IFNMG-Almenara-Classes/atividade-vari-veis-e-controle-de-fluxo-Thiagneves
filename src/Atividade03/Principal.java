package Atividade03;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0){
            System.out.println("> O número " +numero+ " é par");
        } else {
            System.out.println("> O número " +numero+ " é impar");
        }
        entrada.close();
    }
}
