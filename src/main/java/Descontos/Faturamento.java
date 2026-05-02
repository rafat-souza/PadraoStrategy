package Descontos;

import Descontos.TiposDesconto.DescontoBlackFriday;
import Descontos.TiposDesconto.DescontoEstudante;
import Descontos.TiposDesconto.DescontoVIP;

public class Faturamento {

    private float valorFinal;

    public float getValorFinal() {
        return valorFinal;
    }

    public void aplicarDescontoEstudante(float valorOriginal) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto(valorOriginal);
        this.valorFinal = calculadora.calcular(new DescontoEstudante());
    }

    public void aplicarDescontoVIP(float valorOriginal) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto(valorOriginal);
        this.valorFinal = calculadora.calcular(new DescontoVIP());
    }

    public void aplicarDescontoBlackFriday(float valorOriginal) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto(valorOriginal);
        this.valorFinal = calculadora.calcular(new DescontoBlackFriday());
    }

}
