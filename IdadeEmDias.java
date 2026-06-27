// Beecrowd 1020 - Idade em Dias
// https://www.beecrowd.com.br/judge/pt/problems/view/1020

// 💡 Lógica:
// Lê uma quantidade de dias e converte para anos, meses e dias.
// Lógica igual à do 1019 (Conversão de Tempo), mas com datas:
// 1 ano = 365 dias → anos = dias / 365
// 1 mês = 30 dias  → meses = (resto) / 30
// Dias restantes = resto final
// Usa divisão inteira (/) e módulo (%) para a conversão.

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dias = input.nextInt();

        int anos = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        input.close();
    }
}
