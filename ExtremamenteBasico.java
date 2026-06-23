import java.util.Scanner;

// Beecrowd 1001 - Extremamente Básico
// https://www.beecrowd.com.br/judge/pt/problems/view/1001
// Lê dois inteiros e imprime a soma no formato "X + Y = Z"

public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        System.out.println("X = " + (A + B));

        input.close();
    }
}
