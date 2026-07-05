// Beecrowd 1079 - Médias Ponderadas
// https://www.beecrowd.com.br/judge/pt/problems/view/1079

// 💡 Lógica:
// Lê N alunos, cada um com 3 notas (A, B, C) com pesos 2, 3 e 5.
// Calcula a média ponderada: (A*2 + B*3 + C*5) / 10
// Se média >= 7.0 → "aprovado", senão → "reprovado".
// A leitura termina quando N = 0.

import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        while (N != 0) {
            double A = input.nextDouble();
            double B = input.nextDouble();
            double C = input.nextDouble();

            // Média ponderada com pesos 2, 3 e 5
            double media = (A * 2 + B * 3 + C * 5) / 10.0;

            System.out.printf("%.1f%n", media);
            if (media >= 7.0) {
                System.out.println("aprovado");
            } else {
                System.out.println("reprovado");
            }

            N = input.nextInt();
        }

        input.close();
    }
}
