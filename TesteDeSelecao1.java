// Beecrowd 1035 - Teste de Seleção 1
// https://www.beecrowd.com.br/judge/pt/problems/view/1035

// 💡 Lógica:
// Lê 4 valores: A, B, C e D.
// Verifica se é possível fazer uma viagem com os seguintes critérios:
// - A deve ser maior que B (A > B)
// - C deve ser positivo (C > 0)
// - D deve ser positivo (D > 0)
// - A deve ser maior que D (A > D)
// Se todas as condições forem verdadeiras, imprime "Pode viajar".
// Caso contrário, imprime "Nao pode viajar".

import java.util.Scanner;

public class TesteDeSelecao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        if (A > B && C > 0 && D > 0 && A > D) {
            System.out.println("Pode viajar");
        } else {
            System.out.println("Nao pode viajar");
        }

        input.close();
    }
}
