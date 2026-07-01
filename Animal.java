// Beecrowd 1049 - Animal
// https://www.beecrowd.com.br/judge/pt/problems/view/1049

// 💡 Lógica:
// Lê 3 características do animal (possui pelos, amamenta os filhos, bota ovos)
// e determina o tipo com base nas respostas:
// - Possui pelos + amamenta → Mamífero
// - Não possui pelos + bota ovos → Ave ou Réptil (depende de amamenta)
// - Não possui pelos + não bota ovos → Peixe ou Anfíbio
// Usa if-else encadeado para classificar corretamente.

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pelos = input.next();
        String amamenta = input.next();
        String ovos = input.next();

        if (pelos.equals("S") && amamenta.equals("S")) {
            System.out.println("Mamifero");
        } else if (pelos.equals("N") && ovos.equals("S") && amamenta.equals("N")) {
            System.out.println("Ave");
        } else if (pelos.equals("N") && ovos.equals("S") && amamenta.equals("S")) {
            System.out.println("Reptil");
        } else if (pelos.equals("N") && ovos.equals("N") && amamenta.equals("S")) {
            System.out.println("Anfibio");
        } else {
            System.out.println("Peixe");
        }

        input.close();
    }
}
