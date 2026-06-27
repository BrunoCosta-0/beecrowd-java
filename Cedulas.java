// Beecrowd 1018 - Cédulas
// https://www.beecrowd.com.br/judge/pt/problems/view/1018

// 💡 Lógica:
// Lê um valor inteiro e decompõe em cédulas (100, 50, 20, 10, 5, 2, 1).
// Usa arrays para armazenar os valores e descrições de cada cédula.
// Percorre os arrays com um loop, calculando a quantidade de cada cédula
// usando divisão inteira (/) e atualizando o resto com módulo (%).

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();

        int[] valores = {100, 50, 20, 10, 5, 2, 1};
        String[] descricoes = {
            "nota(s) de R$ 100,00",
            "nota(s) de R$ 50,00",
            "nota(s) de R$ 20,00",
            "nota(s) de R$ 10,00",
            "nota(s) de R$ 5,00",
            "nota(s) de R$ 2,00",
            "nota(s) de R$ 1,00"
        };

        System.out.println(valor);
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valor / valores[i] + " " + descricoes[i]);
            valor %= valores[i];
        }

        input.close();
    }
}
