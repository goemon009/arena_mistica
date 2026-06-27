package model;

/*
 * GRASP - High Cohesion
 *
 * Esta classe contém apenas comportamentos relacionados ao Golem de Obsidiana.
 *
 * Ela não possui responsabilidades de criação, gerenciamento ou controle do sistema.
 */

public class GolemObsidiana implements Criatura {

    @Override
    public void atacar() {
        System.out.println("Golem de Obsidiana desfere um golpe devastador.");
    }

    @Override
    public void defender() {
        System.out.println("Golem de Obsidiana reforça sua armadura.");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Golem de Obsidiana usa Impacto Sísmico.");
    }

    @Override
    public String getNome() {
        return "Golem de Obsidiana";
    }
}