// Beecrowd 1012 - Área
// https://www.beecrowd.com.br/judge/pt/problems/view/1012

// 💡 Lógica:
// Lê três valores A, B e C e calcula 5 áreas diferentes:
// - Triângulo retângulo: (A * C) / 2
// - Círculo: π * C² (usando π = 3.14159)
// - Trapézio: ((A + B) * C) / 2
// - Quadrado: B²
// - Retângulo: A * B
// Todos os resultados devem ter 3 casas decimais.

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", A * C / 2);
        System.out.printf("CIRCULO: %.3f%n", 3.14159 * C * C);
        System.out.printf("TRAPEZIO: %.3f%n", (A + B) * C / 2);
        System.out.printf("QUADRADO: %.3f%n", B * B);
        System.out.printf("RETANGULO: %.3f%n", A * B);

        input.close();
    }
}
