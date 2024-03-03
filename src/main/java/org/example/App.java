package org.example;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Random random = new Random();
        // Para una letra mayúscula aleatoria (A-Z):
        char randomUpperCaseLetter = (char) ('A' + random.nextInt(26));
        System.out.println("Letra mayúscula aleatoria: " + randomUpperCaseLetter);
        System.out.println( "Hello World!" );
    }
}
