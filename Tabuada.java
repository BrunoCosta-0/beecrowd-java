// Beecrowd 1078 - Tabuada
// https://www.beecrowd.com.br/judge/pt/problems/view/1078

// 💡 Lógica:
// Lê um inteiro N e imprime a tabuada completa de 1 a 10.
// Usa um loop for de 1 a 10 e imprime cada multiplicação
// no formato "N x i = resultado".

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        input.close();
    }
}
