package Atividade20;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = input.nextInt();

        if(num % 3 == 0){
            if (num % 5 == 0){
                System.out.println("O numero é divisível por 3 e por 5");
                return;
            }
            System.out.println("O numero é divisível por 3");
        }
        else if (num % 5 == 0){
            System.out.println("O numero é divisível por 5");
        }
        else {
            System.out.println("O numero não é divisível por 3 nem por 5");
        }
    }
}
