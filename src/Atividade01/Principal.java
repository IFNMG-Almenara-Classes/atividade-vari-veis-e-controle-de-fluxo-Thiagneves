package Atividade01;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Escreva um numero: ");
        num1 = entrada.nextInt();
        System.out.print("Escreva outro numero: ");
        num2 = entrada.nextInt();

        if (num1 > num2){
            System.out.printf("%d é maior que %d", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("%d é maior que %d", num2, num1);
        } else {
            System.out.println("Você digitou números iguais!");
        }

        entrada.close();
    }
}
