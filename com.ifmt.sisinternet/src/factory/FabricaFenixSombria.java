package factory;

import model.Criatura;
import model.FenixSombria;

/*
 * GOF - Factory Method
 *
 * Fábrica concreta responsável por criar objetos Fenix.
 *
 * GRASP - Pure Fabrication
 *
 * A responsabilidade de criação foi separada da classe Fenix, mantendo cada classe focada em uma única responsabilidade.
 */

public class FabricaFenixSombria extends FabricaCriatura {

    @Override
    public Criatura criarCriatura() {
        return new FenixSombria();
    }
}