// Beecrowd 1067 - Números Ímpares
// https://www.beecrowd.com.br/judge/pt/problems/view/1067

// 💡 Lógica:
// Lê um inteiro N e imprime todos os ímpares de 1 até N.
// Usa um loop for começando em 1 com incremento de 2,
// garantindo que apenas ímpares sejam percorridos.

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        // Percorre apenas os números ímpares de 1 até N
        for (int i = 1; i <= N; i += 2) {
            System.out.println(i);
        }

        input.close();
    }
}
