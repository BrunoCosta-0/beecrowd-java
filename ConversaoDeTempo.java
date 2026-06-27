// Beecrowd 1019 - Conversão de Tempo
// https://www.beecrowd.com.br/judge/pt/problems/view/1019

// 💡 Lógica:
// Lê um valor em segundos e converte para horas, minutos e segundos.
// 1 hora = 3600 segundos → horas = segundos / 3600
// 1 minuto = 60 segundos → minutos = (resto) / 60
// Segundos restantes = resto final
// Usa divisão inteira (/) e módulo (%) para fazer a conversão.

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segundos = input.nextInt();

        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        input.close();
    }
}
