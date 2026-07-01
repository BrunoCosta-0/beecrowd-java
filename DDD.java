// Beecrowd 1050 - DDD
// https://www.beecrowd.com.br/judge/pt/problems/view/1050

// 💡 Lógica:
// Lê um código DDD e imprime o nome da cidade correspondente.
// Usa switch expression para mapear cada DDD a uma cidade.
// Se o DDD não for reconhecido, imprime "DDD nao cadastrado".

import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ddd = input.nextInt();

        String cidade = switch (ddd) {
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 11 -> "Sao Paulo";
            case 21 -> "Rio de Janeiro";
            case 32 -> "Juiz de Fora";
            case 19 -> "Campinas";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            default -> "DDD nao cadastrado";
        };

        System.out.println(cidade);

        input.close();
    }
}
