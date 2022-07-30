package br.dio.com.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex_3MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int count = 0;
        int maior = 0;

        do{
            System.out.println("Informe o número: ");
            num = scan.nextInt();

            if(num > maior){
                maior = num;
            }
            count++;
        }while(count < 5);

        System.out.println("O maior número é: " + maior);
    }
}
