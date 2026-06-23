// Beecrowd 1001 - Extremamente Básico
// https://www.beecrowd.com.br/judge/pt/problems/view/1001

// 💡 Lógica:
// Lê dois inteiros A e B e imprime a soma no formato "X = Z".
// Usa Scanner para capturar a entrada do usuário via terminal.
// Não é necessário nenhuma validação — a entrada é garantida pelo Beecrowd.

import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        // Imprime a soma de A + B no formato exigido pelo problema
        System.out.println("X = " + (A + B));

        input.close();
    }
}
