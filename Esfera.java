// Beecrowd 1011 - Esfera
// https://www.beecrowd.com.br/judge/pt/problems/view/1011

// 💡 Lógica:
// Lê o raio de uma esfera e calcula seu volume.
// Fórmula: V = (4/3) × π × R³
// O problema exige π = 3.14159265358979 para precisão máxima.
// A saída deve ter 3 casas decimais no formato "VOLUME = X.XXX".

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();

        // Fórmula do volume da esfera: (4/3) × π × R³
        double volume = (4.0 / 3.0) * 3.14159265358979 * raio * raio * raio;

        System.out.printf("VOLUME = %.3f%n", volume);

        input.close();
    }
}
