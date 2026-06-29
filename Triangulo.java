// Beecrowd 1043 - Triângulo
// https://www.beecrowd.com.br/judge/pt/problems/view/1043

// 💡 Lógica:
// Lê 3 valores A, B e C representando lados de um triângulo.
// Primeiro verifica se forma um triângulo válido:
//   Cada lado deve ser menor que a soma dos outros dois.
// Se válido, classifica o triângulo:
//   Equilátero: todos os lados iguais (A == B == C)
//   Isósceles:  dois lados iguais
//   Escaleno:   todos os lados diferentes

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        // Verifica se forma um triângulo válido
        if (A + B > C && A + C > B && B + C > A) {
            if (A == B && B == C) {
                System.out.println("Equilatero");
            } else if (A == B || B == C || A == C) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Nao forma triangulo");
        }

        input.close();
    }
}
