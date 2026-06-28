// Beecrowd 1038 - Lanche
// https://www.beecrowd.com.br/judge/pt/problems/view/1038

// 💡 Lógica:
// Lê um código de produto e a quantidade comprada.
// Cada código tem um preço fixo definido no enunciado:
// 1 → R$4,00 | 2 → R$4,50 | 3 → R$5,00 | 4 → R$2,00 | 5 → R$1,50
// Usa switch para mapear o código ao preço correspondente.
// Calcula o total multiplicando o preço pela quantidade.

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo = input.nextInt();
        int quantidade = input.nextInt();

        double preco = switch (codigo) {
            case 1 -> 4.00;
            case 2 -> 4.50;
            case 3 -> 5.00;
            case 4 -> 2.00;
            case 5 -> 1.50;
            default -> 0.00;
        };

        System.out.printf("Total: R$ %.2f%n", preco * quantidade);

        input.close();
    }
}
