// Beecrowd 1064 - Positivos e Média
// https://www.beecrowd.com.br/judge/pt/problems/view/1064

// 💡 Lógica:
// Lê 6 números e calcula:
// - Quantos são positivos (> 0)
// - A média dos positivos
// Usa um loop para ler cada número, acumulando soma e contagem dos positivos.

import java.util.Scanner;

public class PositivosEMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            double N = input.nextDouble();
            if (N > 0) {
                soma += N;
                contador++;
            }
        }

        System.out.println(contador);
        if (contador > 0) {
            System.out.printf("%.1f%n", soma / contador);
        }

        input.close();
    }
}
