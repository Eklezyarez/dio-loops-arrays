package br.dio.com.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -7, 12, 51, 8, 4};

        System.out.println("Vetor: ");
        int cont = 0;
        while(cont < vetor.length){
            System.out.println(vetor[cont] + " ");
            cont++;
        }

        System.out.println("\nVetor: ");
        for(int i = vetor.length -1; i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }

    }
}
