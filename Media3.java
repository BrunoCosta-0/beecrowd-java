// Beecrowd 1040 - Média 3
// https://www.beecrowd.com.br/judge/pt/problems/view/1040

// 💡 Lógica:
// Lê duas notas (N1 e N2) e calcula a média ponderada:
// Média = (N1 * 3.5 + N2 * 7.5) / 11.0
// Se média >= 5.0 → "Aprovado"
// Se média < 5.0 → calcula o exame:
//   Exame lido, nova média = (média + exame) / 2
//   Se nova média >= 5.0 → "Aprovado"
//   Senão → "Reprovado"

import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double N1 = input.nextDouble();
        double N2 = input.nextDouble();

        double media = (N1 * 3.5 + N2 * 7.5) / 11.0;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 5.0) {
            System.out.println("Situacao: Aprovado");
        } else {
            double exame = input.nextDouble();
            double mediaFinal = (media + exame) / 2.0;
            System.out.printf("Exame: %.1f%n", exame);
            System.out.printf("Media: %.1f%n", mediaFinal);
            if (mediaFinal >= 5.0) {
                System.out.println("Situacao: Aprovado");
            } else {
                System.out.println("Situacao: Reprovado");
            }
        }

        input.close();
    }
}
