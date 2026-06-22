# Arena Mistica

Aplicacao Java simples que simula a invocacao de criaturas em uma arena fantastica usando os padroes GRASP e GoF.

## Objetivo

O projeto demonstra uma estrutura orientada a objetos com foco em extensibilidade e organizacao das responsabilidades.

## Padroes Aplicados

- `GRASP - Low Coupling`: a classe `Arena` depende apenas das abstracoes `Criatura` e `FabricaCriatura`.
- `GRASP - High Cohesion`: cada classe possui uma responsabilidade bem definida dentro do dominio.
- `GRASP - Pure Fabrication`: as fabricas concentram a criacao dos objetos, evitando sobrecarregar as entidades de dominio.
- `GoF - Factory Method`: a criacao das criaturas ocorre por meio de subclasses concretas de `FabricaCriatura`.

## Estrutura

```text
com.ifmt.sisinternet/src
|- factory
|  |- FabricaCriatura.java
|  |- FabricaDragaoCristal.java
|  |- FabricaFenixSombria.java
|  `- FabricaGolemObsidiana.java
|- main
|  `- Main.java
|- model
|  |- Criatura.java
|  |- DragaoCristal.java
|  |- FenixSombria.java
|  `- GolemObsidiana.java
`- service
   `- Arena.java
```

## Criaturas Disponiveis

- Dragao de Cristal
- Fenix Sombria
- Golem de Obsidiana

## Como Executar

Compile os arquivos:

```bash
javac -d out $(find com.ifmt.sisinternet/src -name "*.java")
```

Execute a aplicacao:

```bash
java -cp out main.Main
```

## Resultado Esperado

A aplicacao exibe no terminal a invocacao de cada criatura e suas respectivas acoes de ataque, defesa e habilidade especial.
