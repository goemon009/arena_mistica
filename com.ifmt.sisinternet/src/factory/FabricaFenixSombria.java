package factory;

import model.Criatura;
import model.FenixSombria;

public class FabricaFenixSombria extends FabricaCriatura {

    @Override
    public Criatura criarCriatura() {
        return new FenixSombria();
    }
}