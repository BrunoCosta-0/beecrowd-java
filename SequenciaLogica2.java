// Beecrowd 1145 - Sequência Lógica 2
// https://www.beecrowd.com.br/judge/pt/problems/view/1145

// 💡 Lógica:
// Lê um inteiro N e imprime os números de 1 até N*N
// em ordem crescente, um por linha.
// Usa um loop simples de 1 até N*N.

import java.util.Scanner;

public class SequenciaLogica2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 1; i <= N * N; i++) {
            System.out.println(i);
        }

        input.close();
    }
}
