package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.Utils;

import javax.rmi.CORBA.Util;
import java.awt.image.BufferedImage;

public enum TypeTerrain {
    FORET_CONIFÈRES("coniferous_forest.png"),
    FORET_FEUILLUS("deciduous_forest.png"),
    DESERT ("desert.png"),
    COLLINES ("hills.png"),
    MARAIS ("marsh.png"),
    MONTAGNE ("mountain.png"),
    OCEAN("Ocean.png"),
    PLAINE ("plain.png"),
    TOUNDRA("tundra.png");

    public final String nom;
    TypeTerrain(String nom) {
        this.nom = nom;
    }
    public BufferedImage getImage(){
        return Utils.chargerTuile(nom);
    }
    @Override
    public String toString() {
        return nom.substring(nom.length() - 4); //Le substring retire les derniers composants de l'élément ciblé en fonction du paramètre renseigné
    }

}