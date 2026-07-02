// Beecrowd 1052 - Mês
// https://www.beecrowd.com.br/judge/pt/problems/view/1052

// 💡 Lógica:
// Lê um número de 1 a 12 e imprime o mês correspondente por extenso.
// Usa switch expression para mapear o número ao nome do mês.
// Se o número for inválido, imprime "mes invalido".

import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes = input.nextInt();

        String nomeMes = switch (mes) {
            case 1  -> "janeiro";
            case 2  -> "fevereiro";
            case 3  -> "marco";
            case 4  -> "abril";
            case 5  -> "maio";
            case 6  -> "junho";
            case 7  -> "julho";
            case 8  -> "agosto";
            case 9  -> "setembro";
            case 10 -> "outubro";
            case 11 -> "novembro";
            case 12 -> "dezembro";
            default -> "mes invalido";
        };

        System.out.println(nomeMes);

        input.close();
    }
}
