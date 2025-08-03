package Atividade14;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int opcao;
        float compra;
        float valorcomdesconto;
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva o valor comprado: ");
        compra = input.nextInt();

        do {
            System.out.println("Selecione o tipo de cliente:");
            System.out.println("1 - Comum");
            System.out.println("2 - VIP");
            System.out.println("3 - Funcionário");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O valor não tem desconto: R$ " +compra);
                    break;
                case 2:
                    valorcomdesconto = compra - (compra*5/100);
                    System.out.printf("Valor com desconto: R$ %.2f", valorcomdesconto);
                    break;
                case 3:
                    valorcomdesconto = compra - (compra*10/100);
                    System.out.printf("Valor com desconto: R$ %.2f", valorcomdesconto);
                    break;
                default:
                    System.out.println("Vamos tentar novamente!");
            }
        } while (!(opcao == 1 || opcao == 2 || opcao == 3));
    }
}
