package br.dio.com.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numDesejado, resultado, numMulti, cont = 0, escolha;

        System.out.println("\n*****Sistema de Tabuada***** \n");
        System.out.println("Qual tipo de tabuada deseja?\n ");
        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        escolha = scan.nextInt();

        while(escolha > 0 && escolha <= 4){

            switch (escolha) {
                case 1:
                    System.out.println("Digite o número da tabuada desejada: ");
                    numDesejado = scan.nextInt();
                    System.out.println("Digite o número de repetições, ex: 2 + 10, o dez é o limite ");
                    numMulti = scan.nextInt();

                    while(cont <= numMulti){
                        resultado = numDesejado + cont;
                        System.out.println(cont + " + " + numDesejado + " = " + resultado);
                        cont++;
                    }
                    break;
                case 2:
                    System.out.println("Digite o número da tabuada desejada: ");
                    numDesejado = scan.nextInt();
                    System.out.println("Digite o número de repetições, ex: 2 - 10, o dez é o limite ");
                    numMulti = scan.nextInt();

                    while(cont <= numMulti){
                        resultado = numDesejado - cont;
                        System.out.println(cont + " - " + numDesejado + " = " + resultado);
                        cont++;
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da tabuada desejada: ");
                    numDesejado = scan.nextInt();
                    System.out.println("Digite o número de repetições, ex: 2 x 10, o dez é o limite ");
                    numMulti = scan.nextInt();

                    while(cont <= numMulti){
                        resultado = numDesejado * cont;
                        System.out.println(cont + " x " + numDesejado + " = " + resultado);
                        cont++;
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da tabuada desejada: ");
                    numDesejado = scan.nextInt();
                    System.out.println("Digite o número de repetições, ex: 2 / 10, o dez é o limite ");
                    numMulti = scan.nextInt();

                    while(cont <= numMulti){
                        resultado = numDesejado / (cont +1);
                        System.out.println(cont + " / " + numDesejado + " = " + resultado);
                        cont++;
                    }
                    break;
            }


            }
            System.out.println("Digite o número da tabuada desejada: ");
            numDesejado = scan.nextInt();
            System.out.println("Digite o número de repetições, ex: 2 x 10, o dez é o limite ");
            numMulti = scan.nextInt();

            while(cont <= numMulti){
                resultado = numDesejado * cont;
                System.out.println(cont + " x " + numDesejado + " = " + resultado);
                cont++;
            }
            System.out.println("\n*****Sistema de Tabuada***** \n");
            System.out.println("Qual tipo de tabuada deseja?\n ");
            System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
            escolha = scan.nextInt();
        }




    }


