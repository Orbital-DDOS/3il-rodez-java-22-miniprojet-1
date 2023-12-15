package fr.ecole3il.rodez2023.perlin.math;


import java.util.Random;

/**
 * La classe RandomNoise étend la classe Noise2D et génère du bruit aléatoire en deux dimensions.
 * Elle utilise la classe Random de Java pour générer des valeurs aléatoires.
 */
public class BruitAleatoire extends Bruit2D {
//Déclaration de la variable random pour l'utiliser plus bas dans le code
    Random random;

    public BruitAleatoire(long graine, double resolution) {
        super(graine, resolution); // Lien avec la classe mère
        this.random = new Random(graine); //appel de la méthode avec this.
    }

    @Override
    public double bruit2D(double x, double y) {
        return random.nextDouble();//retourner la valeur de random avec l'attribut double
    }
}
