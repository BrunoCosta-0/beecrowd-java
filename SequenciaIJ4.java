// Beecrowd 1098 - Sequência IJ 4
// https://www.beecrowd.com.br/judge/pt/problems/view/1098

// 💡 Lógica:
// Imprime pares (I, J) onde I vai de 1 a 5 e J vai de 1 a 5.
// J só é impresso se estiver entre I e (6 - I) inclusive.
// Usa dois loops aninhados com condição para filtrar os valores.

public class SequenciaIJ4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= (6 - i); j++) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }
}
