// Beecrowd 1144 - Sequência Lógica
// https://www.beecrowd.com.br/judge/pt/problems/view/1144

// 💡 Lógica:
// Lê um inteiro N e imprime N*2 linhas seguindo o padrão:
// Para cada i de 1 até N, imprime duas linhas:
// i  i²    i³
// i  i²+1  i³+1

import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
            System.out.println(i + " " + (i * i + 1) + " " + (i * i * i + 1));
        }

        input.close();
    }
}
