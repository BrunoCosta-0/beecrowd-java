// Beecrowd 1118 - Várias Notas Com Validação
// https://www.beecrowd.com.br/judge/pt/problems/view/1118

// 💡 Lógica:
// Lê várias notas até receber -1 (encerra a leitura).
// Para cada nota, verifica se está no intervalo [0.0, 10.0].
// Se válida → imprime a nota com 1 casa decimal.
// Se inválida → imprime "nota invalida".

import java.util.Scanner;

public class VariasNotasComValidacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota = input.nextDouble();

        while (nota != -1) {
            if (nota >= 0.0 && nota <= 10.0) {
                System.out.printf("nota valida: %.1f%n", nota);
            } else {
                System.out.println("nota invalida");
            }
            nota = input.nextDouble();
        }

        input.close();
    }
}
