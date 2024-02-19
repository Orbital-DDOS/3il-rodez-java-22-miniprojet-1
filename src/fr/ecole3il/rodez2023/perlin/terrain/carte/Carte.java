package fr.ecole3il.rodez2023.perlin.terrain.carte;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.TerrainInexistant;

public class Carte {
    int nom;
    private  int largeur;
    private int longueur;
    private int[][] tableau;

    public int getNom() {
        return nom;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }
    public Terrain getTerrain(int x, int y) throws TerrainInexistant {

        return new Terrain(x,y);
    }

    public int getHauteur() {
        return 0;
    }
}
