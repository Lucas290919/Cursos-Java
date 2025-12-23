package Exercícios;

import java.util.Scanner;

public class DesafioNumeroPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num = ler.nextInt();
        if (num % 2 == 0 && num<=10){
            System.out.println("Numero válido");
        } else {System.out.println("Número inválido");}

        ler.close();
    }
}
