package Matrizes;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        // Leitura da ordem da matriz
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número n: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        // Preenchimento da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++)
                matriz[linha][coluna] = sc.nextInt();
        }
        // Descobrindo negativos
        int quantNegativos = 0;
        for (int linha = 0; linha < matriz.length; linha++)
            for (int coluna = 0; coluna < matriz[linha].length; coluna++)
                if (matriz[linha][coluna] < 0)
                    quantNegativos++;
        System.out.println("Quant núm. negativos: " + quantNegativos);

        // Descobrindo a diagonal principal
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++)
            System.out.print(matriz[i][i] + " ");

    }

    // matriz.length é igual a quantidade de linhas
    // Matrizes são vetores de vetores. Ou seja, para a quantidade de colunas, usamos matriz[linha].length.
}

