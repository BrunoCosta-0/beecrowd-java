// Beecrowd 1113 - Crescente e Decrescente
// https://www.beecrowd.com.br/judge/pt/problems/view/1113

// 💡 Lógica:
// Lê dois inteiros A e B e verifica a relação entre eles.
// Se A < B, estão em ordem crescente.
// Se A > B, estão em ordem decrescente.
// Se A == B, são iguais.

import java.util.Scanner;

public class CrescenteEDecrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        if (A < B) {
            System.out.println("Crescente");
        } else if (A > B) {
            System.out.println("Decrescente");
        } else {
            System.out.println("Iguais");
        }

        input.close();
    }
}
