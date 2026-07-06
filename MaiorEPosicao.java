// Beecrowd 1080 - Maior e Posição
// https://www.beecrowd.com.br/judge/pt/problems/view/1080

// 💡 Lógica:
// Lê 100 números inteiros e determina qual é o maior e em qual posição foi lido.
// Usa um array para guardar os valores e percorre comparando com o maior atual.
// A posição começa em 1 (não em 0 como no array).

import java.util.Scanner;

public class MaiorEPosicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int posicao = 0;

        for (int i = 1; i <= 100; i++) {
            int N = input.nextInt();
            if (N > maior) {
                maior = N;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        input.close();
    }
}
