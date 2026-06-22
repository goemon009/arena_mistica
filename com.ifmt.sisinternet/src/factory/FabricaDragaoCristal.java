package factory;

import model.Criatura;
import model.DragaoCristal;

public class FabricaDragaoCristal extends FabricaCriatura {

    @Override
    public Criatura criarCriatura() {
        return new DragaoCristal();
    }
}