// Beecrowd 1042 - Sort Simples
// https://www.beecrowd.com.br/judge/pt/problems/view/1042

// 💡 Lógica:
// Lê 3 valores inteiros e os imprime em ordem crescente.
// Usa Arrays.sort() para ordenar o array de forma simples e elegante.
// Evita a necessidade de comparações manuais com if/else.

import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            numeros[i] = input.nextInt();
        }

        // Arrays.sort() ordena em ordem crescente
        Arrays.sort(numeros);

        System.out.println(numeros[0] + "\n" + numeros[1] + "\n" + numeros[2]);

        input.close();
    }
}
