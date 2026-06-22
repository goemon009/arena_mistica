package model;

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