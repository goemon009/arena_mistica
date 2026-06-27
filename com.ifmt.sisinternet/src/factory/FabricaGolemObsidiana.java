package factory;

import model.Criatura;
import model.GolemObsidiana;

/*
 * GOF - Factory Method
 *
 * Fábrica concreta responsável por criar objetos Golem.
 *
 * GRASP - Pure Fabrication
 *
 * A responsabilidade de criação foi separada da classe Golem, mantendo cada classe focada em uma única responsabilidade.
 */

public class FabricaGolemObsidiana extends FabricaCriatura {

    @Override
    public Criatura criarCriatura() {
        return new GolemObsidiana();
    }
}