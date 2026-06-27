// Beecrowd 1021 - Notas e Moedas
// https://www.beecrowd.com.br/judge/pt/problems/view/1021

// 💡 Lógica:
// Multiplica o valor por 100 para trabalhar apenas com inteiros.
// Usa arrays para armazenar os valores e descrições de cada cédula/moeda.
// Percorre os arrays com um loop, calculando a quantidade de cada um
// usando divisão inteira (/) e atualizando o resto com módulo (%).

import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorDouble = input.nextDouble();
        int valor = (int) Math.round(valorDouble * 100);

        int[] valores = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        String[] descricoes = {
            "nota(s) de R$ 100.00", "nota(s) de R$ 50.00",
            "nota(s) de R$ 20.00",  "nota(s) de R$ 10.00",
            "nota(s) de R$ 5.00",   "nota(s) de R$ 2.00",
            "nota(s) de R$ 1.00",   "moeda(s) de R$ 0.50",
            "moeda(s) de R$ 0.25",  "moeda(s) de R$ 0.10",
            "moeda(s) de R$ 0.05",  "moeda(s) de R$ 0.01"
        };

        System.out.println("NOTAS:");
        for (int i = 0; i < valores.length; i++) {
            if (i == 7) System.out.println("MOEDAS:");
            System.out.println(valor / valores[i] + " " + descricoes[i]);
            valor %= valores[i];
        }

        input.close();
    }
}
