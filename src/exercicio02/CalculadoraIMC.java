package exercicio02;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua altura em metros?");
        String alturaStr = scanner.nextLine();

        System.out.println("Qual o seu peso em Kg?");
        String pesoStr = scanner.nextLine();

        double altura = Double.parseDouble(alturaStr);
        double peso = Double.parseDouble(pesoStr);

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        scanner.close();
    }


}
