package Descontos.TiposDesconto;

import Descontos.RegraDesconto;

public class DescontoBlackFriday implements RegraDesconto {

    public float calcular(float valor) {
        return valor * 0.50f;
    }

}
