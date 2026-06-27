package service;

import factory.FabricaCriatura;
import model.Criatura;

    /*
    * GOF - Factory Method
    *
    * A Arena delega a criação da criatura para uma fábrica.
    * Dessa forma, não precisa conhecer qual classe concreta será instanciada.
    *
    * GRASP - Low Coupling
    *
    * O acoplamento entre Arena e as criaturas concretas é reduzido através do uso de abstrações.
    */

public class Arena {

    public void invocarCriatura(FabricaCriatura fabrica) {

        Criatura criatura = fabrica.criarCriatura();

        System.out.println("\n=== Criatura Invocada ===");
        System.out.println(criatura.getNome());

        criatura.atacar();
        criatura.defender();
        criatura.habilidadeEspecial();
    }
}