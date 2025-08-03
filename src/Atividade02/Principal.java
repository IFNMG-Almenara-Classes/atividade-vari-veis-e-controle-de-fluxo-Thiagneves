package Atividade02;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float peso;
        float altura;
        float imc;
        System.out.print("Digite seu peso em KG: ");
        peso = entrada.nextFloat();
        System.out.print("Digite a sua altura em M: ");
        altura = entrada.nextFloat();

        imc = peso / (altura * altura);

        System.out.printf("> Seu IMC é %.2f ", imc);
        System.out.print("e sua classificação é ");
        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc < 29.9) {
            System.out.println("Saudável");
        } else if (imc < 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 39.9) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }
        entrada.close();
    }
}
