// Beecrowd 1003 - Soma Simples
// https://www.beecrowd.com.br/judge/pt/problems/view/1003

// 💡 Lógica:
// Lê dois inteiros A e B e imprime a soma no formato "SOMA = Z".
// Semelhante ao 1001, mas o formato de saída é diferente.
// Atenção ao espaçamento exato: "SOMA = Z" (com espaços ao redor do =).

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        // Imprime a soma no formato exigido pelo problema
        System.out.println("SOMA = " + (A + B));

        input.close();
    }
}
