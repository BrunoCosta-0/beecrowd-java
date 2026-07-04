// Beecrowd 1072 - Intervalo 2
// https://www.beecrowd.com.br/judge/pt/problems/view/1072

// 💡 Lógica:
// Lê um inteiro N e verifica se está no intervalo [10, 20] (inclusive).
// Se estiver dentro → "Intervalo [10,20]"
// Se estiver fora  → "Fora do Intervalo [10,20]"

import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        if (N >= 10 && N <= 20) {
            System.out.println("Intervalo [10,20]");
        } else {
            System.out.println("Fora do Intervalo [10,20]");
        }

        input.close();
    }
}
