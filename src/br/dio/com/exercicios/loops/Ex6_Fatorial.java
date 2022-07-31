package br.dio.com.exercicios.loops;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número para ver o fatorial: ");
        int fatorial = scan.nextInt();

        int multi = 1;

        for(int cont = fatorial; cont >= 1; cont--){
            multi = multi * cont;

        }
        System.out.println("!" + fatorial + " = " + multi);
    }
}
