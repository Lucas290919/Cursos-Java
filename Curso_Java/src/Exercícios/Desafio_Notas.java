package Exercícios;

import java.util.Scanner;

public class Desafio_Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Nota 1: ");
        double num1 = ler.nextDouble();
        System.out.println("Nota 2: ");
        double num2 = ler.nextDouble();

        double media = (num1 + num2) / 2;

        if(media >= 7)
        {
            System.out.println("Aprovado");
        } else if (media < 7 && media >= 4)
        {
            System.out.println("Recuperação");
        } else { System.out.println("Reprovado");}

        ler.close();
    }
}
