// Beecrowd 1133 - Resto da Divisão
// https://www.beecrowd.com.br/judge/pt/problems/view/1133

// 💡 Lógica:
// Lê dois inteiros A e B e imprime o resto da divisão de A por B.
// Usa o operador módulo (%) diretamente.
// Atenção: se B for 0, a divisão é impossível.

import java.util.Scanner;

public class RestoDaDivisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        if (B == 0) {
            System.out.println("divisao impossivel");
        } else {
            System.out.println(A + " % " + B + " = " + (A % B));
        }

        input.close();
    }
}
