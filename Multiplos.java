// Beecrowd 1044 - Múltiplos
// https://www.beecrowd.com.br/judge/pt/problems/view/1044

// 💡 Lógica:
// Lê dois números inteiros N e M.
// Verifica se N é múltiplo de M usando o operador módulo (%).
// Se o resto da divisão de N por M for 0, então N é múltiplo de M.

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        if (N % M == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        input.close();
    }
}
