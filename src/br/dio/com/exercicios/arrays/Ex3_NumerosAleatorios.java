package br.dio.com.exercicios.arrays;
/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static <Randon> void main(String[] args) {
          Random random = new Random();

          int[] numAleatorios = new int[20];

          for(int i = 0; i < numAleatorios.length; i++){
              int num = random.nextInt(100);
              numAleatorios[i] = num;
          }
        System.out.println("Numeros Aleatórios: ");
        for (int numero : numAleatorios  ) {
            System.out.println(numero + " ");
        }

        System.out.println("Sucessores dos Numeros Aleatórios: ");
        for (int numero : numAleatorios  ) {
            System.out.println((numero + 1) + " ");
        }
    }

}
