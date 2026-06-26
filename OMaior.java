// Beecrowd 1013 - O Maior
// https://www.beecrowd.com.br/judge/pt/problems/view/1013

// 💡 Lógica:
// Lê três inteiros e determina qual é o maior.
// Usa Math.max() para comparar os três valores de forma simples.
// A saída deve ser no formato "X eh o maior" onde X é o maior valor.

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        // Math.max compara dois valores por vez
        int maior = Math.max(A, Math.max(B, C));

        System.out.println(maior + " eh o maior");

        input.close();
    }
}
