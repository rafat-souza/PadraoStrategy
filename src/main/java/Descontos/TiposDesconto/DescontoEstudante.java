package Descontos.TiposDesconto;

import Descontos.RegraDesconto;

public class DescontoEstudante implements RegraDesconto {

    public float calcular(float valor) {
        return valor * 0.90f;
    }

}
