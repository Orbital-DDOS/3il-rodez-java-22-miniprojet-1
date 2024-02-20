package fr.ecole3il.rodez2023.perlin.terrain.carte;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurAleatoire;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurPerlin;
import fr.ecole3il.rodez2023.perlin.terrain.generation.TerrainInexistant;


public class Carte {
    private Terrain[][] carte ;
    int nom;
    private  int largeur;
    private int longueur;
    private int[][] tableau;

    public Carte(String nouvelleCarte, int largeur, int hauteur, GenerateurPerlin generateurPerlin) {
    }

    public Carte(String nouvelleCarte) {
        
    }

    public Carte(String nouvelleCarte, int largeur, int hauteur, GenerateurAleatoire generateurAleatoire) {
    }

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

        return carte[x][y];
    }

    public int getHauteur() {
        return 0;
    }
}
