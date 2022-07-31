package br.dio.com.exercicios.loops;

import java.util.Arrays;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex_4ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdeNum;
        int count = 0;
        int num;
        int par = 0;
        int impar = 0;

        System.out.println("Quantidade de números: ");
        qtdeNum = scan.nextInt();
        int[] lista = new int[qtdeNum];
        do{
            System.out.println("Digite o número: ");
            num = scan.nextInt();
            count++;
            if(num % 2 == 0){
                par++;
            }else{
                impar++;
            }

        }while(count < qtdeNum);
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);

    }
}
