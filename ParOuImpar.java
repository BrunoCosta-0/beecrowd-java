// Beecrowd 1074 - Par ou Ímpar
// https://www.beecrowd.com.br/judge/pt/problems/view/1074

// 💡 Lógica:
// Lê vários inteiros até receber o valor 0 (que encerra a leitura).
// Para cada número lido (exceto o 0), verifica se é par ou ímpar
// usando o operador módulo (%). Par se N % 2 == 0, ímpar caso contrário.

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        while (N != 0) {
            if (N % 2 == 0) {
                System.out.println(N + " eh par");
            } else {
                System.out.println(N + " eh impar");
            }
            N = input.nextInt();
        }

        input.close();
    }
}
