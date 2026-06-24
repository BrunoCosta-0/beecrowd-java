import java.util.Scanner;

/*
 * Beecrowd 1004 - Produto Simples
 * https://www.beecrowd.com.br/judge/pt/problems/view/1004
 */

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        int PROD = A * B;

        System.out.println("PROD = " + PROD);

        input.close();
    }
}
