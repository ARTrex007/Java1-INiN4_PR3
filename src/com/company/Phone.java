package com.company;

public class Phone
{
    private String MODEL, MARKA;
    private int WIEK;
    public static int counter=0;

    public Phone(String model, String marka, int wiek) {
        MODEL = model;
        MARKA = marka;
        WIEK = wiek;
        System.out.println("Utworzono obiekt PHONE numer: ");
        System.out.println(counter);
        counter++;
    }
}
