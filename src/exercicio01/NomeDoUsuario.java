package exercicio01;

import java.util.Scanner;

public class NomeDoUsuario {
    public static void main(String[] args) {
        // Cria um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o sobrenome do usuário
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        // Solicita o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Concatena o nome completo
        String nomeCompleto = nome + " " + sobrenome;

        // Calcula o número de letras (replaceAll  some com todos os espacos em branco "\\s" e "" string vazia
        int numeroDeLetras = nomeCompleto.replaceAll("\\s", "").length();

        // Exibe o nome completo e o número de letras
        System.out.println("Seu nome completo é: " + nomeCompleto);
        System.out.println("Seu nome completo tem " + numeroDeLetras + " letras.");

        // Fecha o Scanner
        scanner.close();
    }


}
