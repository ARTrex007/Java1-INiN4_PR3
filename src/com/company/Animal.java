package com.company;

public class Animal
{
    public String IMIE, GATUNEK;
    public boolean NAJEDZONY;
    public int WIEK;
    public float MASA;
    public static int counter=0;

    public Animal(String imie, String gatunek, boolean najedzony, int wiek, float masa) {
        IMIE = imie;
        GATUNEK = gatunek;
        NAJEDZONY = najedzony;
        WIEK = wiek;
        MASA = masa;
        System.out.println("Utworzono obiekt ANIMAL numer: " + counter);
        counter++;
    }
}
