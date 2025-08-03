package Atividade06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        int menornum;

        Scanner input = new Scanner(System.in);

        System.out.print("Escreva um numero: ");
        num1 = input.nextInt();
        System.out.print("Escreva outro numero: ");
        num2 = input.nextInt();
        System.out.print("Escreva outro numero: ");
        num3 = input.nextInt();

        if(num1 < num2){
            menornum = num1;
        } else if (num3 < num1){
            menornum = num3;
        } else {
            menornum = num2;
        }

        System.out.println("O menor números dos três é o numero: " +menornum);
    }
}
