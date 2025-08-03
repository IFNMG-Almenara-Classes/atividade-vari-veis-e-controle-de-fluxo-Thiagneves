package Atividade19;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int diasemana;

        Scanner input = new Scanner(System.in);
        System.out.print("Escolha um numero de 1 a 7: ");
        diasemana = input.nextInt();

        switch (diasemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Você escolheu uma opção invalida!");

        }
    }
}
