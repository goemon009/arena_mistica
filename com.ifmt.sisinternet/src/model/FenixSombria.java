package model;

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