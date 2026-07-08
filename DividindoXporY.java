// Beecrowd 1116 - Dividindo X por Y
// https://www.beecrowd.com.br/judge/pt/problems/view/1116

// 💡 Lógica:
// Lê dois inteiros X e Y e verifica se X é divisível por Y.
// Usa o operador módulo (%) para verificar o resto da divisão.
// Se o resto for 0, X é divisível por Y.
// Atenção: se Y for 0, a divisão é impossível (divisão por zero).

import java.util.Scanner;

public class DividindoXporY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();

        if (Y == 0) {
            System.out.println("divisao impossivel");
        } else if (X % Y == 0) {
            System.out.println(X + " / " + Y + " = " + (X / Y));
        } else {
            System.out.println("nao divide");
        }

        input.close();
    }
}
