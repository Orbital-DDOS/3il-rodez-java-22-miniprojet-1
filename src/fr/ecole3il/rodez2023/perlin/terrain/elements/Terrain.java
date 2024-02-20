package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

public class Terrain {
    private double altitude;
    private double hydrometrie;
    private double temperature;

    public Terrain(double altitude, double hydrometrie, double temperature) throws MauvaiseValeurException{
        if ( temperature < 0 || temperature > 1) throw new MauvaiseValeurException("La valeur n'est pas dans la plage de valeur autorisée (de 0 à 1)");
        this.temperature = temperature;

        if ( altitude < -1 || altitude > 1) throw new MauvaiseValeurException("La valeur n'est pas dans la plage de valeur autorisée (de -1 à 1)");
        this.altitude = altitude;

        if ( hydrometrie < 0 || hydrometrie > 1) throw new MauvaiseValeurException("La valeur n'est pas dans la plage de valeur autorisée (de 0 à 1)");
        this.hydrometrie = hydrometrie;
    }


    //utilisation du type double pour afficher des décimales
    public double getAltitude() {
        return altitude;
    }

    public double getHydrometrie() {
        return hydrometrie;
    }

    public double getTemperature() {
        return temperature;
    }

    public TypeTerrain getTypeTerrain(DetermineurTerrain dt){
        return dt.determinerTerrain(this.altitude, this.hydrometrie, this.temperature);
    }
}
