// Beecrowd 1061 - Tempo de um Evento
// https://www.beecrowd.com.br/judge/pt/problems/view/1061

// 💡 Lógica:
// Lê o horário de início e fim de um evento (hora e minuto).
// Converte tudo para minutos para facilitar o cálculo.
// Se o fim for antes do início, o evento passou da meia-noite: soma 24h.
// No final, converte o resultado de volta para horas e minutos.

import java.util.Scanner;

public class TempoDeUmEvento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horaInicio    = input.nextInt();
        int minutoInicio  = input.nextInt();
        int horaFim       = input.nextInt();
        int minutoFim     = input.nextInt();

        int inicio = horaInicio * 60 + minutoInicio;
        int fim    = horaFim * 60 + minutoFim;

        int duracao = fim - inicio;
        if (duracao < 0) {
            duracao += 24 * 60; // passou da meia-noite
        }

        int horas   = duracao / 60;
        int minutos = duracao % 60;

        System.out.println("O tempo de duracao do evento e de " + horas + " hora(s) e " + minutos + " minuto(s)");

        input.close();
    }
}
