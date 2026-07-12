// Beecrowd 1134 - Tipo de Combustível
// https://www.beecrowd.com.br/judge/pt/problems/view/1134

// 💡 Lógica:
// Lê um código de combustível e imprime o tipo correspondente.
// 1 → Alcool, 2 → Gasolina, 3 → Diesel
// Usa switch expression para mapear o código ao tipo.

import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo = input.nextInt();

        String tipo = switch (codigo) {
            case 1 -> "Alcool";
            case 2 -> "Gasolina";
            case 3 -> "Diesel";
            default -> "Combustivel invalido";
        };

        System.out.println(tipo);

        input.close();
    }
}
