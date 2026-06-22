package service;

import factory.FabricaCriatura;
import model.Criatura;

/*
 * GRASP - Low Coupling
 *
 * A Arena depende apenas das abstrações
 * Criatura e FabricaCriatura.
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