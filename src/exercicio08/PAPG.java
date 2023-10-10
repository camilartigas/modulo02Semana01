package exercicio08;

import java.util.Scanner;

public class PAPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o valor da raiz: ");
        int raiz = scanner.nextInt();

        System.out.print("Escolha o tipo de progressão PA ou PG: ");
        String tipoProgressao = scanner.next();

        System.out.println("Os 10 primeiros valores da " + tipoProgressao + " são:");

        for (int i = 0; i < 10; i++) {
            if (tipoProgressao.equalsIgnoreCase("PA")) {
                int termo = valorInicial + i * raiz;
                System.out.print(termo + " ");
            } else if (tipoProgressao.equalsIgnoreCase("PG")) {
                int termo = valorInicial * (int) Math.pow(raiz, i);
                System.out.print(termo + " ");
            } else {
                System.out.println("Tipo de progressão inválido. Use 'PA' ou 'PG'.");
                scanner.close();
                return;
            }
        }

        scanner.close();
    }
}