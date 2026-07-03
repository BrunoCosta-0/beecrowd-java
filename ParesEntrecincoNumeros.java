// Beecrowd 1065 - Pares entre Cinco Números
// https://www.beecrowd.com.br/judge/pt/problems/view/1065

// 💡 Lógica:
// Lê 5 números inteiros e imprime apenas os que são pares.
// Usa um loop for e o operador módulo (%) para verificar se é par.
// Um número é par se o resto da divisão por 2 for igual a 0.

import java.util.Scanner;

public class ParesEntrecincoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int N = input.nextInt();
            if (N % 2 == 0) {
                System.out.println(N);
            }
        }

        input.close();
    }
}
