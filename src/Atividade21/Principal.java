package Atividade21;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int idade;
        int tempotrabalho;

        Scanner input = new Scanner(System.in);
        System.out.print("Escreva sua idade: ");
        idade = input.nextInt();
        System.out.print("Escreva quanto tempo você tem de trabalho: ");
        tempotrabalho = input.nextInt();

        boolean aposentar = (true);

        // Posibilidade 1 de aposentar
        if(idade >= 65){
            aposentar = true;
        }
        else if (tempotrabalho >= 30){
            aposentar = true;
        }
        else if (idade >= 60){
            if (tempotrabalho >= 25){
                aposentar = true;
            }
            else {
                aposentar = false;
            }
        }
        else {
            aposentar = false;
        }

        if (aposentar){
            System.out.println("Você pode aposentar!");
        }
        else {
            System.out.println("Você não pode aposentar!");
        }
    }
}
