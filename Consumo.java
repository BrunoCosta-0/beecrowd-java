// Beecrowd 1014 - Consumo
// https://www.beecrowd.com.br/judge/pt/problems/view/1014

// 💡 Lógica:
// Lê a distância percorrida (km) e a quantidade de litros usados.
// Calcula o consumo médio dividindo a distância pelos litros.
// A saída deve ter 3 casas decimais no formato "X.XXX km/l".

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distancia = input.nextInt();
        double litros = input.nextDouble();

        // Consumo médio = distância ÷ litros consumidos
        double consumo = distancia / litros;

        System.out.printf("%.3f km/l%n", consumo);

        input.close();
    }
}
