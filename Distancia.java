// Beecrowd 1016 - Distância
// https://www.beecrowd.com.br/judge/pt/problems/view/1016

// 💡 Lógica:
// O carro Y se distancia do carro X 1 km a cada 2 minutos.
// Logo, se a distância entre eles é X km, o tempo decorrido é X * 2 minutos.
// Lê a distância em km e calcula o tempo em minutos.
// A saída deve ser no formato "X minutos".

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distancia = input.nextInt();

        // A cada 1 km de distância = 2 minutos decorridos
        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");

        input.close();
    }
}
