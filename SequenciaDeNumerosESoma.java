// Beecrowd 1101 - Sequência de Números e Soma
// https://www.beecrowd.com.br/judge/pt/problems/view/1101

// 💡 Lógica:
// Lê um inteiro N e imprime todos os números de 1 até N
// seguidos da soma total no formato "Sum=X".
// Usa um loop for para imprimir e acumular a soma ao mesmo tempo.

import java.util.Scanner;

public class SequenciaDeNumerosESoma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int soma = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
            soma += i;
        }

        System.out.println("Sum=" + soma);

        input.close();
    }
}
