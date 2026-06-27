package factory;

import model.Criatura;
import model.DragaoCristal;

/*
 * GOF - Factory Method
 *
 * Fábrica concreta responsável por criar objetos Dragon.
 *
 * GRASP - Pure Fabrication
 *
 * A responsabilidade de criação foi separada da classe Dragon, mantendo cada classe focada em uma única responsabilidade.
 */

public class FabricaDragaoCristal extends FabricaCriatura {

    @Override
    public Criatura criarCriatura() {
        return new DragaoCristal();
    }
}