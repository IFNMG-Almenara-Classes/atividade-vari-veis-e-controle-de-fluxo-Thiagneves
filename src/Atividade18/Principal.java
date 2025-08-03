package Atividade18;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Escreva um numero: ");
        num1 = input.nextInt();
        System.out.print("Escreva outro numero: ");
        num2 = input.nextInt();

        int aux = 0;
        if(num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        System.out.println("Os numeros primos entre " +num1+ " e " +num2+ " são:");
        for(int i = num1; i <= num2; i++){
            boolean numprimo = true;

            if (i <= 1){
                numprimo = false;
            }
            else {
                for (int j = 2; j < i; j++){

                    if (i % j == 0){
                        numprimo = false;
                        break;
                    }
                }
            }
            if (numprimo){
                System.out.print(i+ " ");
            }
        }
    }
}
