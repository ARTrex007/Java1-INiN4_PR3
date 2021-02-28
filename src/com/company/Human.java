package com.company;

public class Human
{
    private String IMIE, NAZWISKO, ZAWOD;
    private int WIEK;
    public static int counter=0;

    public Human(String imie, String nazwisko, String zawod, int wiek) {
        IMIE = imie;
        NAZWISKO = nazwisko;
        ZAWOD = zawod;
        WIEK = wiek;
        System.out.println("Utworzono obiekt HUMAN numer: ");
        System.out.println(counter);
        counter++;
    }
}
