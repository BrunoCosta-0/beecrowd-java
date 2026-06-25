// Beecrowd 1009 - Salário com Bônus
// https://www.beecrowd.com.br/judge/pt/problems/view/1009

// 💡 Lógica:
// Lê o nome do vendedor, seu salário fixo e o total de vendas realizadas.
// O bônus é calculado como 15% do valor total de vendas.
// O salário final é a soma do salário fixo com o bônus.
// A saída deve exibir o nome e o salário final com 2 casas decimais.

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.next();
        double salarioFixo = input.nextDouble();
        double vendas = input.nextDouble();

        // Bônus = 15% das vendas realizadas
        double bonus = vendas * 0.15;
        double salarioFinal = salarioFixo + bonus;

        System.out.println("NOME = " + nome);
        System.out.printf("SALARIO = %.2f%n", salarioFinal);

        input.close();
    }
}
