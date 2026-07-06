// Beecrowd 1095 - Sequência IJ 1
// https://www.beecrowd.com.br/judge/pt/problems/view/1095

// 💡 Lógica:
// Imprime pares (I, J) onde I vai de 1 a 5 e J vai de 1 a I.
// Para cada valor de I, J começa em 1 e vai até I.
// Usa dois loops for aninhados para gerar a sequência.

public class SequenciaIJ1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }
}
