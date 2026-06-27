package model;

/*
 * GRASP - Low Coupling
 *
 * A Arena trabalha com esta abstração ao invés das classes
 * concretas Dragon, Phoenix e Golem.
 *
 * Isso reduz dependências diretas entre módulos.
 */

public interface Criatura {

    void atacar();

    void defender();

    void habilidadeEspecial();

    String getNome();
}