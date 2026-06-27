// Beecrowd 1017 - Gasto de Combustível
// https://www.beecrowd.com.br/judge/pt/problems/view/1017

// 💡 Lógica:
// Lê a distância percorrida (km) e o preço do litro de combustível.
// O carro faz 12 km por litro (dado fixo do problema).
// Calcula os litros gastos dividindo a distância por 12.
// Calcula o gasto total multiplicando os litros pelo preço.
// A saída deve ter 3 casas decimais.

import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distancia = input.nextInt();
        double precoPorLitro = input.nextDouble();

        // Consumo fixo: 12 km por litro
        double litrosGastos = distancia / 12.0;
        double gastoTotal = litrosGastos * precoPorLitro;

        System.out.printf("%.3f%n", gastoTotal);

        input.close();
    }
}
