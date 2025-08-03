package Atividade22;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int mes;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Digite um numero de 1 a 12: ");
            mes = input.nextInt();

            switch (mes){
                case 1:
                    System.out.println("Janeiro");
                    return;
                case 2:
                    System.out.println("Fevereiro");
                    return;
                case 3:
                    System.out.println("Março");
                    return;
                case 4:
                    System.out.println("Abril");
                    return;
                case 5:
                    System.out.println("Maio");
                    return;
                case 6:
                    System.out.println("Junho");
                    return;
                case 7:
                    System.out.println("Julho");
                    return;
                case 8:
                    System.out.println("Agosto");
                    return;
                case 9:
                    System.out.println("Setembro");
                    return;
                case 10:
                    System.out.println("Outubro");
                    return;
                case 11:
                    System.out.println("Novembro");
                    return;
                case 12:
                    System.out.println("Dezembro");
                    return;
                default:
                    System.out.println("Vamos tentar novamente!");
            }
        } while (true);
    }
}
