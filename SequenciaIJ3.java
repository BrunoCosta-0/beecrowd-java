// Beecrowd 1097 - Sequência IJ 3
// https://www.beecrowd.com.br/judge/pt/problems/view/1097

// 💡 Lógica:
// Imprime pares (I, J) onde I vai de 1 a 5 e J vai de 1 a 5.
// Mas J só é impresso se J <= I ou J >= (6 - I).
// Usa dois loops aninhados com condição para filtrar os valores.

public class SequenciaIJ3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i || j >= (6 - i)) {
                    System.out.println("I=" + i + " J=" + j);
                }
            }
        }
    }
}
