// Beecrowd 1060 - Números Positivos
// https://www.beecrowd.com.br/judge/pt/problems/view/1060

// 💡 Lógica:
// Lê 6 números e imprime apenas os positivos (> 0).
// Usa um loop for para ler cada número e um if para verificar se é positivo.

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            double N = input.nextDouble();
            if (N > 0) {
                System.out.printf("%.1f%n", N);
            }
        }

        input.close();
    }
}
