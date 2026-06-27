package model;

/*
 * GRASP - High Cohesion
 *
 * Esta classe contém apenas comportamentos relacionados ao Dragão de Cristal.
 *
 * Ela não possui responsabilidades de criação, gerenciamento ou controle do sistema.
 */

public class DragaoCristal implements Criatura {

    @Override
    public void atacar() {
        System.out.println("Dragão de Cristal lança uma rajada de fogo.");
    }

    @Override
    public void defender() {
        System.out.println("Dragão de Cristal cria um escudo de cristais.");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Dragão de Cristal usa Tempestade Cristalina.");
    }

    @Override
    public String getNome() {
        return "Dragão de Cristal";
    }
}