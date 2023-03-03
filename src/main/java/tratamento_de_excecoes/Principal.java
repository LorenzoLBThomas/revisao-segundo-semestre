package tratamento_de_excecoes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Dono da conta: ");
        sc.next();
        String dono = sc.nextLine();
        System.out.println("Saldo inicial da conta: ");
        String saldoAux = sc.next();
        double saldo = Double.parseDouble(saldoAux);
        System.out.println("Limite de saque: ");
        String limiteSaqueAux = sc.next();
        double limiteSaque = Double.parseDouble(limiteSaqueAux);

        Conta conta = new Conta(numConta, dono, saldo, limiteSaque);

        System.out.println("Digite o valor que deseja sacar: ");
        String quantiaAux = sc.next();
        double quantia = Double.parseDouble(quantiaAux);

        try {
            conta.sacar(quantia);
            System.out.println(conta.getSaldo());
        }

        catch (DomainException e) {
            System.out.println("Erro no saque: " + e.getMessage());
        }

    }
}
