// Beecrowd 1002 - Área do Círculo
// https://www.beecrowd.com.br/judge/pt/problems/view/1002

// 💡 Lógica:
// Lê o valor do raio R e calcula a área do círculo com a fórmula: A = π * R²
// O problema exige o uso de π = 3.14159 (não Math.PI), pois os testes
// são baseados nesse valor fixo para garantir a precisão esperada.
// A saída deve ter exatamente 4 casas decimais no formato "A=X.XXXX".

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();

        // Fórmula da área do círculo: π * R²
        double area = 3.14159 * R * R;

        // Saída com 4 casas decimais conforme exigido
        System.out.printf("A=%.4f%n", area);

        input.close();
    }
}
