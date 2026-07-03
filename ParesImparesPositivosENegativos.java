// Beecrowd 1066 - Pares, Ímpares, Positivos e Negativos
// https://www.beecrowd.com.br/judge/pt/problems/view/1066

// 💡 Lógica:
// Lê 5 números inteiros e conta:
// - Quantos são pares
// - Quantos são ímpares
// - Quantos são positivos (> 0)
// - Quantos são negativos (< 0)
// Usa contadores separados e um loop para processar cada número.

import java.util.Scanner;

public class ParesImparesPositivosENegativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pares = 0, impares = 0, positivos = 0, negativos = 0;

        for (int i = 0; i < 5; i++) {
            int N = input.nextInt();
            if (N % 2 == 0) pares++;
            else impares++;
            if (N > 0) positivos++;
            else if (N < 0) negativos++;
        }

        System.out.println(pares + " par(es)");
        System.out.println(impares + " impar(es)");
        System.out.println(positivos + " positivo(s)");
        System.out.println(negativos + " negativo(s)");

        input.close();
    }
}
