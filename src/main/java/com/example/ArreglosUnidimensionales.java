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
          int[] arregloOriginal = {1, 2, 3, 4, 5};

        int[] arregloInvertido = invertirArray(arregloOriginal);

        System.out.println("\nArreglo invertido:");

        for (int numero : arregloInvertido) {
            System.out.print(numero + " ");
        }
    }


    // Método que invierte un arreglo
    public static int[] invertirArray(int[] array) {

        int[] invertido = new int[array.length];

        int indice = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            invertido[indice] = array[i];
            indice++;
        }

        return invertido;
    }
}
