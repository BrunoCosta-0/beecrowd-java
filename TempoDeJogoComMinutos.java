// Beecrowd 1047 - Tempo de Jogo com Minutos
// https://www.beecrowd.com.br/judge/pt/problems/view/1047

// 💡 Lógica:
// Mesma lógica do 1046, mas agora considerando horas E minutos.
// Converte tudo para minutos totais para facilitar o cálculo:
// minutosTotais = horas * 60 + minutos
// Se o término for antes do início, soma 24h (1440 min) ao término.
// No final, converte o resultado de volta para horas e minutos.

import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horaInicio = input.nextInt();
        int minutoInicio = input.nextInt();
        int horaTermino = input.nextInt();
        int minutoTermino = input.nextInt();

        // Converte tudo para minutos totais
        int inicio = horaInicio * 60 + minutoInicio;
        int termino = horaTermino * 60 + minutoTermino;

        int duracao = termino - inicio;
        if (duracao <= 0) {
            duracao += 24 * 60; // soma 24h se passou da meia-noite
        }

        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        input.close();
    }
}
