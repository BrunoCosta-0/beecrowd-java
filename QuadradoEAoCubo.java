// Beecrowd 1143 - Quadrado e ao Cubo
// https://www.beecrowd.com.br/judge/pt/problems/view/1143

// 💡 Lógica:
// Lê um inteiro N e imprime o quadrado e o cubo de cada número de 1 até N.
// Usa Math.pow() para calcular potências ou simplesmente multiplica.
// Formato de saída: "i^2 = X i^3 = Y"

import java.util.Scanner;

public class QuadradoEAoCubo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + "^2 = " + (i * i) + "   " + i + "^3 = " + (i * i * i));
        }

        input.close();
    }
}
