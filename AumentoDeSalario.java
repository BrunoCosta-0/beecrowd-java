// Beecrowd 1048 - Aumento de Salário
// https://www.beecrowd.com.br/judge/pt/problems/view/1048

// 💡 Lógica:
// Lê a categoria (1, 2 ou 3) e o salário atual do funcionário.
// Aplica o percentual de reajuste conforme a categoria:
// Categoria 1 → 50% de aumento
// Categoria 2 → 30% de aumento
// Categoria 3 → 20% de aumento
// Imprime o novo salário com 2 casas decimais.

import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int categoria = input.nextInt();
        double salario = input.nextDouble();

        double percentual = switch (categoria) {
            case 1 -> 0.50;
            case 2 -> 0.30;
            case 3 -> 0.20;
            default -> 0.00;
        };

        double novoSalario = salario + (salario * percentual);
        System.out.printf("Novo salario: %.2f%n", novoSalario);

        input.close();
    }
}
