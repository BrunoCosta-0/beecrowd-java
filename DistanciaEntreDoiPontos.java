// Beecrowd 1015 - Distância Entre Dois Pontos
// https://www.beecrowd.com.br/judge/pt/problems/view/1015

// 💡 Lógica:
// Lê as coordenadas (X1, Y1) e (X2, Y2) de dois pontos no plano cartesiano.
// Aplica a fórmula da distância euclidiana:
// D = √((X2-X1)² + (Y2-Y1)²)
// Usa Math.sqrt() para calcular a raiz quadrada.
// A saída deve ter 4 casas decimais.

import java.util.Scanner;

public class DistanciaEntreDoiPontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X1 = input.nextDouble();
        double Y1 = input.nextDouble();
        double X2 = input.nextDouble();
        double Y2 = input.nextDouble();

        // Fórmula da distância euclidiana entre dois pontos
        double distancia = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

        System.out.printf("%.4f%n", distancia);

        input.close();
    }
}
