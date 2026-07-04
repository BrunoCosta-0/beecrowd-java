// Beecrowd 1071 - Soma de Ímpares Consecutivos I
// https://www.beecrowd.com.br/judge/pt/problems/view/1071

// 💡 Lógica:
// Lê dois inteiros X e Y (X < Y) e soma todos os ímpares entre eles (inclusive).
// Usa um loop for percorrendo de X até Y,
// somando apenas os que são ímpares (N % 2 != 0).

import java.util.Scanner;

public class SomaDeImparesConsecutivosI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();

        int soma = 0;
        for (int i = X; i <= Y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        input.close();
    }
}
