// Beecrowd 1075 - Resto 2
// https://www.beecrowd.com.br/judge/pt/problems/view/1075

// 💡 Lógica:
// Lê vários inteiros até receber o valor 0 (que encerra a leitura).
// Para cada número, verifica se o resto da divisão por 2 é 0 ou 1
// e imprime o resultado no formato "N % 2 = X".

import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        while (N != 0) {
            System.out.println(N + " % 2 = " + (N % 2));
            N = input.nextInt();
        }

        input.close();
    }
}
