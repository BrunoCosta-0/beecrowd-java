// Beecrowd 1070 - Seis Números Ímpares
// https://www.beecrowd.com.br/judge/pt/problems/view/1070

// 💡 Lógica:
// Lê um inteiro N e imprime os 6 primeiros números ímpares maiores que N.
// Usa um loop while para encontrar o próximo ímpar após N
// e um loop for para imprimir os 6 seguintes ímpares consecutivos.

import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        // Encontra o próximo ímpar após N
        int proximo = N % 2 == 0 ? N + 1 : N + 2;

        for (int i = 0; i < 6; i++) {
            System.out.println(proximo);
            proximo += 2;
        }

        input.close();
    }
}
