package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        // TODO
        int distancia = 2;
        double distanciaCm = distancia;
    }

    public static void demostrarCastingExplicito() {
        // TODO
        double decimal = 1.65;
        int conversionEntero = (int)decimal;
    
    }

    public static void demostrarProblemasDePrecision() {
        // TODO
        Long num1 = 102349L;
        short num2 = num1.shortValue();
    }
}