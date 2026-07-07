// Beecrowd 1099 - Soma de Ímpares Consecutivos II
// https://www.beecrowd.com.br/judge/pt/problems/view/1099

// 💡 Lógica:
// Lê vários pares de inteiros X e Y até o fim da entrada.
// Para cada par, soma todos os ímpares no intervalo [X, Y] inclusive.
// Usa um loop for percorrendo de X até Y,
// somando apenas os que são ímpares (N % 2 != 0).

import java.util.Scanner;

public class SomaDeImparesConsecutivosII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int X = input.nextInt();
            int Y = input.nextInt();

            int soma = 0;
            for (int i = X; i <= Y; i++) {
                if (i % 2 != 0) soma += i;
            }

            System.out.println(soma);
        }

        input.close();
    }
}
