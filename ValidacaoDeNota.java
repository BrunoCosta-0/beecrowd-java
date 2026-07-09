// Beecrowd 1117 - Validação de Nota
// https://www.beecrowd.com.br/judge/pt/problems/view/1117

// 💡 Lógica:
// Lê uma nota e verifica se está no intervalo válido [0.0, 10.0].
// Se estiver dentro → imprime a nota com 1 casa decimal.
// Se estiver fora → imprime "nota invalida".

import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota = input.nextDouble();

        if (nota >= 0.0 && nota <= 10.0) {
            System.out.printf("nota valida: %.1f%n", nota);
        } else {
            System.out.println("nota invalida");
        }

        input.close();
    }
}
