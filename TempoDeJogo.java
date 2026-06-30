// Beecrowd 1046 - Tempo de Jogo
// https://www.beecrowd.com.br/judge/pt/problems/view/1046

// 💡 Lógica:
// Lê a hora de início e a hora de término de um jogo (apenas horas inteiras).
// Se início <= término, a diferença é direta: término - início.
// Se início > término, significa que passou da meia-noite,
// então soma 24 antes de subtrair: (término + 24) - início.

import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inicio = input.nextInt();
        int termino = input.nextInt();

        int duracao;
        if (inicio <= termino) {
            duracao = termino - inicio;
        } else {
            duracao = (termino + 24) - inicio;
        }

        // Caso especial: se início == término, o jogo durou 24 horas
        if (duracao == 0) {
            duracao = 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORAS");

        input.close();
    }
}
