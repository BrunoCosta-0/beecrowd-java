// Beecrowd 1073 - Quadrado de Pares
// https://www.beecrowd.com.br/judge/pt/problems/view/1073

// 💡 Lógica:
// Lê um inteiro N e imprime o quadrado de todos os números pares de 1 até N.
// Usa um loop for percorrendo apenas os pares (incremento de 2 a partir de 2).
// Para cada par, imprime o número e seu quadrado no formato "X^2 = Y".

import java.util.Scanner;

public class QuadradoDePares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 2; i <= N; i += 2) {
            System.out.println(i + "^2 = " + (i * i));
        }

        input.close();
    }
}
