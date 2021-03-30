package com.company;


import java.util.ArrayList;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {	// Zadanie 1.
		System.out.println("Zadanie 1:\n");

		System.out.println("Hello world!");
		System.out.println(args);
		System.out.println(new Date());

		System.out.println("-----------------------------------------------");

		// Zadanie 2.
		System.out.println("Zadanie 2:\n");

		Human human1 = new Human("Jan", "Kowalski", "Spawacz", 37, 70);
		Human human2 = new Human("Agata", "Zalewska", "Nauczyciel", 42, 63);
		Human human3 = new Human("Henryk", "Nowak", "Programista", 25, 83);
		Human human4 = new Human("Weronika", "Rutkowska", "Student", 22, 52);

		Animal animal1 = new Animal("Stefan", "Pies", true, 3, 15);
		Animal animal2 = new Animal("Ryszard", "Kot", false, 2, 10);

		Phone phone1 = new Phone("Redmi x300", "Xiaomi", 0.5);
		Phone phone2 = new Phone("Moto g7", "Motorola", 0.3);

		System.out.println("-----------------------------------------------");

		// Zadanie 3
		System.out.println("Zadanie 3:\n");

		if(animal1.MASA > animal2.MASA)
			System.out.println(animal1.GATUNEK + " " + animal1.IMIE + " jest cięższy i waży " + animal1.MASA + " kilo");
		else
			System.out.println(animal2.GATUNEK + " " + animal2.IMIE + " jest cięższy i waży " + animal2.MASA + " kilo");

		if(phone1.MASA > phone2.MASA)
			System.out.println(phone1.MARKA + " " + phone1.MODEL + " jest cięższy i waży " + phone1.MASA + " kilo");
		else
			System.out.println(phone2.MARKA + " " + phone2.MODEL + " jest cięższy i waży " + phone2.MASA + " kilo");

		if(human1.MASA > human2.MASA)
			System.out.println(human1.IMIE + " " + human1.NAZWISKO + " jest cięższy i waży " + human1.MASA + " kilo");
		else
			System.out.println(human2.IMIE + " " + human2.NAZWISKO + " jest cięższy i waży " + human2.MASA + " kilo");

		System.out.println("-----------------------------------------------");

		// Zadanie 4
		System.out.println("Zadanie 4:\n");

		StringBuilder odp = new StringBuilder();

		if(animal1.MASA > animal2.MASA)
		{
			odp.append(animal1.GATUNEK + " " + animal1.IMIE + " jest cięższy i waży " + animal1.MASA + " kilo");
			System.out.println(odp);
			odp.delete(0, odp.length());
		}
		else
		{
			odp.append(animal2.GATUNEK + " " + animal2.IMIE + " jest cięższy i waży " + animal2.MASA + " kilo");
			System.out.println(odp);
			odp.delete(0, odp.length());
		}

		if(phone1.MASA > phone2.MASA)
		{
			odp.append(phone1.MARKA + " " + phone1.MODEL + " jest cięższy i waży " + phone1.MASA + " kilo");
			System.out.println(odp);
			odp.delete(0, odp.length());
		}
		else
		{
			odp.append(phone2.MARKA + " " + phone2.MODEL + " jest cięższy i waży " + phone2.MASA + " kilo");
			System.out.println(odp);
			odp.delete(0, odp.length());
		}

		if(human1.MASA > human2.MASA)
		{
			odp.append(human1.IMIE + " " + human1.NAZWISKO + " jest cięższy i waży " + human1.MASA + " kilo");
			System.out.println(odp);
			odp.delete(0, odp.length());
		}
		else
		{
			odp.append(human2.IMIE + " " + human2.NAZWISKO + " jest cięższy i waży " + human2.MASA + " kilo");
			System.out.println(odp);
			odp.delete(0, odp.length());
		}

		ArrayList<Object> human_list = new ArrayList();
		human_list.add(human1); human_list.add(human2); human_list.add(human3); human_list.add(human4);

		System.out.println();
		Human human5 = new Human("Artur", "Kuźma", "Biegły Rewident", 26, 52.6);
		human_list.add((human5));

		System.out.println();
		for (int i=0; i<human_list.size(); i++)
		{
			Human humantmp = (Human) human_list.get(i);
			System.out.println(humantmp.IMIE + " " + humantmp.NAZWISKO);
		}

		System.out.println("-----------------------------------------------");
    }
}
