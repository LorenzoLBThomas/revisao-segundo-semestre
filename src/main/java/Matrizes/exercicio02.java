package Matrizes;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        // Leitura das dimensões e criação da matriz
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Digite o número de colunas: ");
        int colunas = sc.nextInt();
        int[][] matriz = new int[linhas][colunas];

        // Preenchimento da matriz
        for (int linha = 0; linha < matriz.length; linha++)
            for (int coluna = 0; coluna < matriz[linha].length; coluna++)
                matriz[linha][coluna] = sc.nextInt();


        System.out.println("De qual valor deseja saber as informações? ");
        int valor = sc.nextInt();

        for (int linha = 0; linha < matriz.length; linha++)
            for (int coluna = 0; coluna < matriz[linha].length; coluna++)
                if (matriz[linha][coluna] == valor) {
                    System.out.println("Posição: " + linha + ", " + coluna);
                    if (coluna > 0)
                        System.out.println("Esquerda: " + matriz[linha][coluna - 1]);
                    if (coluna < colunas - 1)
                        System.out.println("Direita: " + matriz[linha][coluna + 1]);
                    if (linha > 0)
                        System.out.println("Em cima: " + matriz[linha - 1][coluna]);
                    if (linha < linhas - 1)
                        System.out.println("Em baixo: " + matriz[linha + 1][coluna]);
                }
    }
}
