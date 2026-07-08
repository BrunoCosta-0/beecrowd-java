// Beecrowd 1114 - Senha Fixa
// https://www.beecrowd.com.br/judge/pt/problems/view/1114

// 💡 Lógica:
// Lê um número inteiro e verifica se é igual à senha fixa 2002.
// Se for igual, imprime "Acesso Permitido".
// Se for diferente, imprime "Acesso Negado".

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha = input.nextInt();

        // Senha correta definida pelo problema
        if (senha == 2002) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }

        input.close();
    }
}
