// Beecrowd 1094 - Experiências
// https://www.beecrowd.com.br/judge/pt/problems/view/1094

// 💡 Lógica:
// Lê N experimentos, cada um com 5 valores inteiros.
// Para cada experimento, calcula a média descartando o maior e o menor valor.
// Usa Arrays.sort() para ordenar e soma apenas os 3 valores do meio.

import java.util.Arrays;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            int[] valores = new int[5];
            for (int j = 0; j < 5; j++) {
                valores[j] = input.nextInt();
            }

            // Ordena e descarta o maior e o menor
            Arrays.sort(valores);
            double media = (valores[1] + valores[2] + valores[3]) / 3.0;

            System.out.printf("Exp %d: %.1f%n", i + 1, media);
        }

        input.close();
    }
}
