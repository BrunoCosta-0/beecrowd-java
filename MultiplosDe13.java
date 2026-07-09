// Beecrowd 1132 - Múltiplos de 13
// https://www.beecrowd.com.br/judge/pt/problems/view/1132

// 💡 Lógica:
// Lê dois inteiros X e Y (X <= Y) e imprime todos os múltiplos de 13
// no intervalo [X, Y] inclusive.
// Usa um loop for verificando se cada número é múltiplo de 13
// usando o operador módulo (%).

import java.util.Scanner;

public class MultiplosDe13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();

        for (int i = X; i <= Y; i++) {
            if (i % 13 == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
