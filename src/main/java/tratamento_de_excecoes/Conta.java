package tratamento_de_excecoes;

public class Conta {

    private final int num;
    private final String dono;
    private double saldo;
    private final double limiteSaque;

    public Conta(int num, String dono, double saldo, double limiteSaque) {
        this.num = num;
        this.dono = dono;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    // Métodos da classe
    public void depositar(double quantia) {
        saldo += quantia;
    }

    public void sacar(double quantia) throws DomainException {
        if (saldo < quantia)
            throw new DomainException("Você não tem saldo para realizar essa operação.");
        else if (limiteSaque < quantia)
            throw new DomainException("A quantia solicitada é maior do que o limite de saque.");
        else
            saldo -= quantia;
    }

    public double getSaldo() {
        return saldo;
    }
}
