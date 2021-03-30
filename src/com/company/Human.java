package com.company;

public class Human
{
    public String IMIE, NAZWISKO, ZAWOD;
    public int WIEK;
    public double MASA;
    public static int counter=0;

    public Human(String imie, String nazwisko, String zawod, int wiek, double masa) {
        IMIE = imie;
        NAZWISKO = nazwisko;
        ZAWOD = zawod;
        WIEK = wiek;
        MASA = masa;
        System.out.println("Utworzono obiekt HUMAN numer: " + counter);
        counter++;
    }
}
