package fr.ecole3il.rodez2023.perlin.terrain.generation;

public class TerrainInexistant extends Exception{

    public TerrainInexistant() {
        super();
    }

    public TerrainInexistant(String error){
        super(error);
    }

}
