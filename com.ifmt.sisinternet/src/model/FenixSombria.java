package model;

/*
 * GRASP - High Cohesion
 *
 * Esta classe contém apenas comportamentos relacionados ao Fênix Sombria.
 *
 * Ela não possui responsabilidades de criação, gerenciamento ou controle do sistema.
 */

public class FenixSombria implements Criatura {

    @Override
    public void atacar() {
        System.out.println("Fênix Sombria lança chamas negras.");
    }

    @Override
    public void defender() {
        System.out.println("Fênix Sombria cria um círculo de fogo sombrio.");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Fênix Sombria usa Renascimento das Cinzas.");
    }

    @Override
    public String getNome() {
        return "Fênix Sombria";
    }
}