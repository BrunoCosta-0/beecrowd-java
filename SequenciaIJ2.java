// Beecrowd 1096 - Sequência IJ 2
// https://www.beecrowd.com.br/judge/pt/problems/view/1096

// 💡 Lógica:
// Imprime pares (I, J) onde I vai de 1 a 5 e J vai de I até 5.
// Para cada valor de I, J começa em I e vai até 5.
// Usa dois loops for aninhados — J começa de onde I está.

public class SequenciaIJ2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }
}
