package factory;

import model.Criatura;
import model.GolemObsidiana;

public class FabricaGolemObsidiana extends FabricaCriatura {

    @Override
    public Criatura criarCriatura() {
        return new GolemObsidiana();
    }
}