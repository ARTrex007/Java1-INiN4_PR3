package com.company;

import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
	System.out.println("Hello world!");
	System.out.println(args);
	System.out.println(new Date());

	Human human1 = new Human("Jan", "Kowalski", "Spawacz", 37);
	Human human2 = new Human("Agata", "Zalewska", "Nauczyciel", 42);

	Animal animal1 = new Animal("Stefan", "Pies", true, 3);
	Animal animal2 = new Animal("Ryszard", "Kot", false, 2);

	Phone phone1 = new Phone("Redmi x300", "Xiaomi", 2);
	Phone phone2 = new Phone("Moto g7", "Motorola", 1);
    }
}
