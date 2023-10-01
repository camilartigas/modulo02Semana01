package exercicio04;

import java.util.Scanner;
import java.util.Random;

public class AdivinheONumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Adivinhe o número que estou pensando de 1 a 5!");

        int numero = scanner.nextInt();

        int sorteiaNumero = random.nextInt(5) +1 ;

        if (numero >=1 && numero <=5){
            if (numero == sorteiaNumero){
                System.out.println("Você acertou!!! =D ");
            } else {
                System.out.println("Você errou :(  o número era:  " + sorteiaNumero);
            }
            } else {
            System.out.println("Este número não faz parte dos números que estou pensando!");

            scanner.close();
        }
    }
}
