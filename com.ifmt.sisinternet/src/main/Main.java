package main;

import factory.FabricaDragaoCristal;
import factory.FabricaFenixSombria;
import factory.FabricaGolemObsidiana;
import service.Arena;

public class Main {

    public static void main(String[] args) {

        Arena arena = new Arena();

        arena.invocarCriatura(new FabricaDragaoCristal());

        arena.invocarCriatura(new FabricaFenixSombria());

        arena.invocarCriatura(new FabricaGolemObsidiana());
    }
}