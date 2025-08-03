package Atividade07;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o 1° lado do triângulo: ");
        int lado1 = input.nextInt();
        System.out.println("Escreva o 2° lado do triângulo: ");
        int lado2 = input.nextInt();
        System.out.println("Escreva o 3° lado do triângulo: ");
        int lado3 = input.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("O triângulo é equilátero, três lados iguais");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é isósceles, dois lados iguais");
        } else {
            System.out.println("O triângulo é escaleno, três lados diferentes");
        }
    }
}
