package main;

import factory.FabricaDragaoCristal;
import factory.FabricaFenixSombria;
import factory.FabricaGolemObsidiana;
import service.Arena;

/*
 * Demonstração do padrão GOF Factory Method.
 *
 * O cliente (Main) solicita a criação de criaturas
 * através das fábricas concretas sem instanciar
 * diretamente os objetos Dragon, Phoenix e Golem.
 *
 * Benefícios observados:
 * - Low Coupling
 * - High Cohesion
 * - Pure Fabrication
 */

public class Main {

    public static void main(String[] args) {

        Arena arena = new Arena();

        arena.invocarCriatura(new FabricaDragaoCristal());

        arena.invocarCriatura(new FabricaFenixSombria());

        arena.invocarCriatura(new FabricaGolemObsidiana());
        
    }
}