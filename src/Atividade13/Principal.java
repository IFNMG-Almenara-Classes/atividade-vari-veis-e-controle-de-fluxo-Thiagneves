package Atividade13;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        int opcao;
        int num1 = 0;
        int num2 = 0;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("1 - Somar");
            System.out.println("2 – Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 – Dividir");
            System.out.println("5 - Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            if (opcao == 5){
                return;
            }
            else if (opcao == 1 || opcao  == 2 || opcao == 3 || opcao == 4){
                System.out.print("\nEscreva o primeiro numero: ");
                num1 = input.nextInt();

                System.out.print("Escreva o segundo numero: ");
                num2 = input.nextInt();
            }

            switch (opcao){
                case 1:
                    System.out.printf(num1+ " + " +num2+ " = %d\n", num1+num2);
                    break;
                case 2:
                    System.out.printf(num1+ " - " +num2+ " = %d\n", num1-num2);
                    break;
                case 3:
                    System.out.printf(num1+ " * " +num2+ " = %d\n", num1*num2);
                    break;
                case 4:
                    System.out.printf(num1+ " / " +num2+ " = %d\n", num1/num2);
                    break;
                default:
                    System.out.println("Vamos tentar novamente");
            }

        } while (opcao != 5);

    }
}
