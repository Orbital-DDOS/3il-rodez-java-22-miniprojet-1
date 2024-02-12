package fr.ecole3il.rodez2023.perlin.terrain.elements;

public class Terrain {
    private double altitude;
    private double hydrometrie;
    private double temperature;

    public Terrain(double altitude, double hydrometrie, double temperature) {
        this.altitude = altitude;
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
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


}
