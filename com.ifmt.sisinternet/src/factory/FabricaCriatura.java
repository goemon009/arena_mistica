package factory;

import model.Criatura;

/*
 * GOF - Factory Method
 *
 * Esta classe define o método de criação das criaturas.
 * As subclasses decidirão qual criatura concreta será criada.
 *
 * GRASP - Pure Fabrication
 *
 * Esta classe não representa um elemento do domínio do jogo.
 * Ela foi criada apenas para concentrar a responsabilidade de criação dos objetos, reduzindo o acoplamento do sistema.
 */

public abstract class FabricaCriatura {

    public abstract Criatura criarCriatura();
}