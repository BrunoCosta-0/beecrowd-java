// Beecrowd 1010 - Cálculo Simples
// https://www.beecrowd.com.br/judge/pt/problems/view/1010

// 💡 Lógica:
// Lê o código e o preço unitário de um produto, e a quantidade comprada.
// Calcula o valor total da compra multiplicando o preço pela quantidade.
// A saída deve exibir o código, a quantidade e o valor total formatados.

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo = input.nextInt();
        double precoUnitario = input.nextDouble();
        int quantidade = input.nextInt();

        // Valor total = preço unitário × quantidade comprada
        double valorTotal = precoUnitario * quantidade;

        System.out.println("CODIGO = " + codigo);
        System.out.println("QUANTIDADE = " + quantidade);
        System.out.printf("VALOR = %.2f%n", valorTotal);

        input.close();
    }
}
