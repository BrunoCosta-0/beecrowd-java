// Beecrowd 1036 - Fórmula de Bhaskara
// https://www.beecrowd.com.br/judge/pt/problems/view/1036

// 💡 Lógica:
// Lê os coeficientes A, B e C de uma equação de segundo grau.
// Calcula o delta: B² - 4AC
// Se A != 0 e delta >= 0, calcula e imprime as duas raízes com 5 casas decimais.
// Caso contrário, imprime "Impossivel calcular".
// Usa Math.sqrt() para calcular a raiz quadrada do delta.

import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double delta = B * B - 4 * A * C;

        if (A != 0 && delta >= 0) {
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        } else {
            System.out.println("Impossivel calcular");
        }

        input.close();
    }
}
