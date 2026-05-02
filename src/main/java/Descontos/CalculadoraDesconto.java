package Descontos;

public class CalculadoraDesconto {

    private float valorOriginal;

    public CalculadoraDesconto(float valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public float calcular(RegraDesconto regraDesconto) {
        return regraDesconto.calcular(valorOriginal);
    }

}
