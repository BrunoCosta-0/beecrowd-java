// Beecrowd 1115 - Quadrante
// https://www.beecrowd.com.br/judge/pt/problems/view/1115

// 💡 Lógica:
// Lê as coordenadas X e Y de um ponto e determina em qual quadrante ele está.
// Quadrante I:   X > 0 e Y > 0
// Quadrante II:  X < 0 e Y > 0
// Quadrante III: X < 0 e Y < 0
// Quadrante IV:  X > 0 e Y < 0
// Se X ou Y for zero, o ponto está fora dos quadrantes.

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();

        if (X == 0 || Y == 0) {
            System.out.println("Fora de Quadrante");
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
