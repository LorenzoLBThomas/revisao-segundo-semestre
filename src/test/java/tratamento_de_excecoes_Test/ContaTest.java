package tratamento_de_excecoes_Test;

import org.junit.jupiter.api.Test;
import tratamento_de_excecoes.Conta;
import tratamento_de_excecoes.DomainException;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void sacar() throws DomainException {
        var conta = new Conta(1, "Lorenzo", 10, 5);
        conta.sacar(3.5);
        assertEquals(conta.getSaldo(), 6.5);
    }
}
