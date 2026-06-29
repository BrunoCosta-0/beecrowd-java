// Beecrowd 1041 - Coordenadas de um Ponto
// https://www.beecrowd.com.br/judge/pt/problems/view/1041

// 💡 Lógica:
// Lê as coordenadas X e Y de um ponto e determina sua posição:
// Quadrante I:   X > 0 e Y > 0
// Quadrante II:  X < 0 e Y > 0
// Quadrante III: X < 0 e Y < 0
// Quadrante IV:  X > 0 e Y < 0
// Eixo X: Y == 0 e X != 0
// Eixo Y: X == 0 e Y != 0
// Origem: X == 0 e Y == 0

import java.util.Scanner;

public class CoordenadasDeUmPonto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X =input.nextDouble();
        double Y = input.nextDouble();

        if (X == 0 && Y == 0) {
            System.out.println("Origem");
        } else if (X == 0) {
            System.out.println("Eixo Y");
        } else if (Y == 0) {
            System.out.println("Eixo X");
        } else if (X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        input.close();
    }
}
