package exercicio06;

import java.util.Scanner;
import java.time.LocalDate;


public class DefinirPossibilidadeDeVoto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int dataNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - dataNascimento;

        String situacaoVoto;

        if (idade < 16) {
            situacaoVoto = "Você ainda não pode votar";
        } else if (idade >= 16 && idade <= 17 || idade >= 60) {
            situacaoVoto = "Seu voto e opcional";
        } else {
            situacaoVoto = "Seu voto e obrigatório";
        }

        System.out.println("Sua idade é: " + idade + " anos.");
        System.out.println(situacaoVoto + "!!!");

        scanner.close();
    }
}
