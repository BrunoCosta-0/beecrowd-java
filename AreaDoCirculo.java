import java.util.Scanner;

// Beecrowd 1002 - Área do Círculo
// https://www.beecrowd.com.br/judge/pt/problems/view/1002
// Lê o raio e calcula a área do círculo usando π = 3.14159

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();

        double area = 3.14159 * R * R;
        System.out.printf("A=%.4f%n", area);

        input.close();
    }
}
