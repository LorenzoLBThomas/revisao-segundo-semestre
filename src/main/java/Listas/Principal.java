package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Quantos funcionários devem ser registrados?: ");
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();

        List<Funcionario> lista = new ArrayList<>();

        // Criando os funcionários e adicionando na lista.
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Funcionário " + (i + 1) + ": ");
            System.out.println("ID: ");
            int id = sc.nextInt();
            // Filtro de ID utilizando método auxiliar.
            while (temId(lista, id)) {
                System.out.println("ID já existente. Tente novamente.");
                id = sc.nextInt();
            }
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            String salario1 = sc.next();
            double salario = Double.parseDouble(salario1);
            Funcionario func = new Funcionario(id, nome, salario);
            lista.add(func);
        }

        // Aumentando o salário do funcionário desejado
        System.out.println("Qual o ID do funcionário que terá o salário aumentado?: ");
        int idAumento = sc.nextInt();
        int posicaoIdAumento = posicao(lista, idAumento);
        if (posicaoIdAumento == -1)
            System.out.println("ID inválido");
        else {
            System.out.println("Qual a porcentagem do aumento?: ");
            String porcentagemAumento1 = sc.next();
            double porcentagemAumento = Double.parseDouble(porcentagemAumento1);
            lista.get(posicaoIdAumento).aumentaSalario(porcentagemAumento);

        }

        // Listando os funcionários
        System.out.println();
        System.out.println("Lista de funcionários: ");

        for (Funcionario func : lista)
            System.out.println(func);


    }

    // Método auxiliar para encontrar a posição do ID que terá aumento na lista.
    // Não precisaria desse método caso utilizasse função lambda.
    public static int posicao(List<Funcionario> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id)
                return i;
        }
        return -1;
    }

    // Método auxiliar que filtra a lista.
    // Stream é o tipo especial do Java que aceita funções lambda.
    // Quero somente os funcionários x que tiverem o ID igual ao id, e pega o primeiro. Caso não exista, retorna nulo.
    public static boolean temId(List<Funcionario> lista, int id) {
        Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }
}
