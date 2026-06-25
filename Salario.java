// Beecrowd 1008 - Salário
// https://www.beecrowd.com.br/judge/pt/problems/view/1008

// 💡 Lógica:
// Lê o número de horas trabalhadas e o valor por hora.
// Calcula o salário multiplicando as horas pelo valor da hora.
// A saída deve ser no formato "SALARIO = X.XX" com 2 casas decimais.

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas = input.nextInt();
        double valorHora = input.nextDouble();

        // Salário = horas trabalhadas × valor por hora
        double salario = horas * valorHora;

        System.out.printf("SALARIO = %.2f%n", salario);

        input.close();
    }
}
