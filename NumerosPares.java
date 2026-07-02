// Beecrowd 1059 - Números Pares
// https://www.beecrowd.com.br/judge/pt/problems/view/1059

// 💡 Lógica:
// Lê um inteiro N e imprime todos os números pares de 1 até N.
// Usa um loop for com incremento de 2 para percorrer apenas os pares.
// Começa sempre no 2 (primeiro par positivo).

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        // Percorre apenas os números pares de 2 até N
        for (int i = 2; i <= N; i += 2) {
            System.out.println(i);
        }

        input.close();
    }
}
