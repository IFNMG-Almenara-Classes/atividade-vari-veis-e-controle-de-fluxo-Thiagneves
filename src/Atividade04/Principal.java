package Atividade04;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int vida = 1;
        do{
            Scanner input = new Scanner(System.in);

            System.out.println("Digite sua senha: ");
            int senha = input.nextInt();

            if (senha == 1234){
                System.out.println("> ACESSO PERMITIDO");
                return;
            } else if (vida != 3){
                System.out.println("> ACESSO NEGADO");
                System.out.println("Vamos tentar novamente! (" +vida+ "/3)");
                vida++;
            } else {
                System.out.println("> USUÁRIO BLOQUEADO!");
                vida++;
            }
        }while(vida != 4);
    }
}
