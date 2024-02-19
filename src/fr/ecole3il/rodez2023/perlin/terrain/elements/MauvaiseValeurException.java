package fr.ecole3il.rodez2023.perlin.terrain.elements;

public class MauvaiseValeurException extends Exception{
    public MauvaiseValeurException() {
        super();
    }

    public MauvaiseValeurException(String error){
        super(error);
    }

}
