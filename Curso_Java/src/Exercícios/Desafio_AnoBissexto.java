package Exercícios;

import java.util.Scanner;

public class Desafio_AnoBissexto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Qual o ano:");
        int ano = ler.nextInt();

        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0)
        {
            System.out.println("Ano Bissexto");
        } else {System.out.println("Esse Ano NÃO é Bissexto");}


        ler.close();
    }
}
