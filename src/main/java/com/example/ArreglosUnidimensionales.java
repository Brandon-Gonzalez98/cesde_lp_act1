package com.example;

public class ArreglosUnidimensionales {
    public static void usaeForeach() {
        // TODO
        String[] peliculas = {
                "Interestelar",
                "Avatar",
                "Titanic",
                "Matrix",
                "El Padrino"
        };

        System.out.println("Mis películas favoritas:");

        for (String pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public static void numneroMenor() {
        // TODO
        int[] numeros = {15, 8, 22, 3, 19, 7, 30, 1, 12, 5};

        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("\nEl número menor es: " + menor);


    }

    public static void recorrerConForClasico() {
        // TODO
    }

    public static void recorrerConForEach() {
        // TODO
    }

    public static int[] arrayComoParametroYRetorno(int[] array) {
        // TODO
        return array;
    }
}