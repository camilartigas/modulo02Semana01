package exercicio07;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite outro número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Qual tipo de cálculo você deseja fazer? Soma(+), subtração(-), multiplicação(*) ou dividizão(/): ");
        String operacao = scanner.next();

        double resultado = 0.0;

        switch (operacao.toLowerCase()) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                scanner.close();
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);

        scanner.close();
    }
}
