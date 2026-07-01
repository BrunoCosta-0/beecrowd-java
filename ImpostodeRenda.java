// Beecrowd 1051 - Imposto de Renda
// https://www.beecrowd.com.br/judge/pt/problems/view/1051

// 💡 Lógica:
// Lê o salário e calcula o imposto de renda com base nas faixas:
// Até 2000.00       → Isento
// De 2000.01 a 3000 → 8% sobre o valor que excede 2000
// De 3000.01 a 4500 → 8% sobre 1000 + 18% sobre o excedente de 3000
// Acima de 4500     → 8% sobre 1000 + 18% sobre 1500 + 28% sobre o excedente de 4500

import java.util.Scanner;

public class ImpostodeRenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario = input.nextDouble();

        double imposto;

        if (salario <= 2000.00) {
            System.out.println("Isento");
            return;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
        } else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;
        }

        System.out.printf("R$ %.2f%n", imposto);

        input.close();
    }
}
