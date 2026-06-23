import java.util.Scanner;

// Beecrowd 1003 - Soma Simples
// https://www.beecrowd.com.br/judge/pt/problems/view/1003
// Lê dois inteiros e imprime a soma no formato "SOMA = Z"

public class SomaSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        System.out.println("SOMA = " + (A + B));

        input.close();
    }
}
