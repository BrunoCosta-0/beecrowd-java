// Beecrowd 1131 - Grenais
// https://www.beecrowd.com.br/judge/pt/problems/view/1131

// 💡 Lógica:
// Lê os resultados de vários grenais (Grêmio x Inter).
// Para cada jogo, lê os gols dos dois times e determina o vencedor.
// Ao final, imprime o placar acumulado de vitórias de cada time e empates.

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int greDeRenais = 0, inter = 0, empates = 0;

        for (int i = 0; i < N; i++) {
            int golsGremio = input.nextInt();
            int golsInter = input.nextInt();

            if (golsGremio > golsInter) {
                greDeRenais++;
            } else if (golsInter > golsGremio) {
                inter++;
            } else {
                empates++;
            }
        }

        System.out.println("Gremio:" + greDeRenais);
        System.out.println("Internacional:" + inter);
        System.out.println("Empates:" + empates);

        input.close();
    }
}
