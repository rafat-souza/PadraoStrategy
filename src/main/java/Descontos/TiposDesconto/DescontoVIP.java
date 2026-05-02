package Descontos.TiposDesconto;

import Descontos.RegraDesconto;

public class DescontoVIP implements RegraDesconto {

    public float calcular(float valor) {
        return valor * 0.80f;
    }

}
