// Beecrowd 1045 - Tipos de Triângulos
// https://www.beecrowd.com.br/judge/pt/problems/view/1045

// 💡 Lógica:
// Lê 3 valores e usa Math.max() e Math.min() para identificar
// o maior (A), o menor (C) e o do meio (B) sem precisar de array.
// Depois faz duas verificações independentes:
// 1) Validação + classificação por ângulo (usando A² vs B² + C²)
// 2) Classificação por lados (equilátero, isósceles ou nada)
// As duas mensagens podem ser impressas juntas, por isso são blocos separados.

import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        // Identifica o maior (A), o menor (C) e o do meio (B)
        double A = Math.max(x, Math.max(y, z));
        double C = Math.min(x, Math.min(y, z));
        double B = x + y + z - A - C;

        // Verifica se forma um triângulo válido
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Classificação por ângulo
            double A2 = Math.pow(A, 2);
            double B2 = Math.pow(B, 2);
            double C2 = Math.pow(C, 2);

            if (A2 == B2 + C2) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A2 > B2 + C2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Classificação por lados (independente da anterior)
            if (x == y && y == z) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (x == y || y == z || x == z) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        input.close();
    }
}
