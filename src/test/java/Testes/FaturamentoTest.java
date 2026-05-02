package Testes;

import Descontos.Faturamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaturamentoTest {

    @Test
    void deveAplicarDescontoEstudante() {
        Faturamento faturamento = new Faturamento();
        faturamento.aplicarDescontoEstudante(100.0f);

        assertEquals(90.0f, faturamento.getValorFinal(), 0.01f);
    }

    @Test
    void deveAplicarDescontoVIP() {
        Faturamento faturamento = new Faturamento();
        faturamento.aplicarDescontoVIP(100.0f);

        assertEquals(80.0f, faturamento.getValorFinal(), 0.01f);
    }

    @Test
    void deveAplicarDescontoBlackFriday() {
        Faturamento faturamento = new Faturamento();
        faturamento.aplicarDescontoBlackFriday(100.0f);

        assertEquals(50.0f, faturamento.getValorFinal(), 0.01f);
    }

}
