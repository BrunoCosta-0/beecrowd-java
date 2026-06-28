// Beecrowd 1037 - Intervalo
// https://www.beecrowd.com.br/judge/pt/problems/view/1037

// 💡 Lógica:
// Lê um número e verifica em qual dos intervalos ele se enquadra:
// - Negativo: N < 0
// - Entre 0 e 25: 0 <= N <= 25 (inclusive)
// - Entre 25 e 50: 25 < N <= 50 (exclusive esquerda)
// - Entre 50 e 75: 50 < N <= 75
// - Entre 75 e 100: 75 < N <= 100
// - Fora de intervalo: N > 100
// Usa if-else encadeado para garantir apenas uma saída.

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double N = input.nextDouble();

        if (N < 0) {
            System.out.println("Fora de intervalo");
        } else if (N <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (N <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (N <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (N <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        input.close();
    }
}
