// Beecrowd 1142 - PUM
// https://www.beecrowd.com.br/judge/pt/problems/view/1142

// 💡 Lógica:
// Lê um inteiro N e imprime os números de 1 até N.
// Mas substitui os múltiplos de 3 por "PUM".
// Usa o operador módulo (%) para verificar se é múltiplo de 3.

import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                System.out.println("PUM");
            } else {
                System.out.println(i);
            }
        }

        input.close();
    }
}
