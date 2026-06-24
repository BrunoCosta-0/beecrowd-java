import java.util.Scanner;

/*
 * Beecrowd 1005 - Média 1
 * https://www.beecrowd.com.br/judge/pt/problems/view/1005
 */

public class Media1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();

        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0;

        System.out.printf("MEDIA = %.5f%n", MEDIA);

        input.close();
    }
}
