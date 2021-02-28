package com.company;

public class Animal
{
    private String IMIE, GATUNEK;
    private boolean NAJEDZONY;
    private int WIEK;
    public static int counter=0;

    public Animal(String imie, String gatunek, boolean najedzony, int wiek) {
        IMIE = imie;
        GATUNEK = gatunek;
        NAJEDZONY = najedzony;
        WIEK = wiek;
        System.out.println("Utworzono obiekt ANIMAL numer: ");
        System.out.println(counter);
        counter++;
    }
}
