package br.dio.com.exercicios.arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdeConsoantes = 0;

        int cont = 0;
        do{
            System.out.println("Digite a letra: ");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a") |
                    (letra.equalsIgnoreCase("e")|
                            (letra.equalsIgnoreCase("i")|
                                    (letra.equalsIgnoreCase("o")|
                                            (letra.equalsIgnoreCase("u"))){
                consoantes [cont] = letra;
                qtdeConsoantes++;
            }
            cont++;
        }while(cont < consoantes.length);
        System.out.println("Consoantes: ");
        for (String consoante : consoantes ) {
            if(consoante != null)
                System.out.println(consoante + " ");
        }
    }
}
