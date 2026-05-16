package com.example;

public class App {
    public static void main(String[] args) {
        // Variables y Constantes
        //m.out.println("--- Tema: VariablesYConstantes ---");
        //blesYConstantes.demostrarDeclaracionAsignacion();
        //blesYConstantes.demostrarConvencionesNombres();
        //blesYConstantes.demostrarConstantes();

        // Tipos de Datos Primitivos
        //m.out.println("\n--- Tema: TiposDeDatosPrimitivos ---");
        //DeDatosPrimitivos.demostrarEnteros();
        //DeDatosPrimitivos.demostrarFlotantes();
        //DeDatosPrimitivos.demostrarCaracteres();
        //DeDatosPrimitivos.demostrarBooleanos();
        //DeDatosPrimitivos.demostrarValoresPorDefecto();

        // 3. Conversión de Tipos
        //System.out.println("\n--- Tema: ConversionDeTipos ---");
        //ConversionDeTipos.demostrarCastingImplicitito();
        //ConversionDeTipos.demostrarCastingExplicito();
        //ConversionDeTipos.demostrarProblemasDePrecision();
//
        //// 4. Operadores
        //System.out.println("\n--- Tema: Operadores ---");
        //Operadores.demostrarAritmeticos();
        //Operadores.demostrarIncrementoDecremento();
        //Operadores.demostrarRelacionales();
        //Operadores.demostrarLogicos();
        //Operadores.demostrarAsignacionCompuesta();
        //Operadores.demostrarOperadorTernario();

        // 5. Estructuras Condicionales
        //System.out.println("\n--- Tema: EstructurasCondicionales ---");
        //EstructurasCondicionales.ejemploIf();
        //EstructurasCondicionales.ejemploIfElse();
        //EstructurasCondicionales.ejemploIfElseIfElse();
        //EstructurasCondicionales.ejemploSwitch();
        //EstructurasCondicionales.ejemploSwitchExpression();

        // 6. Estructuras de Repetición
        System.out.println("\n--- Tema: EstructurasDeRepeticion ---");
        //EstructurasDeRepeticion.ejemploWhile();
        //EstructurasDeRepeticion.ejemploDoWhile();
        //EstructurasDeRepeticion.ejemploForClasico();
        //EstructurasDeRepeticion.ejemploForAnidado();
        //EstructurasDeRepeticion.ejemploBreakContinue();
        //EstructurasDeRepeticion.ejemploEtiquetas();

        // 7. Métodos Estáticos Simples
        System.out.println("\n--- Tema: MetodosEstaticosSimples ---");
        //MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        //MetodosEstaticosSimples.ejemploPasoParametros("Estudiante Java");
        //int valorRetornado = MetodosEstaticosSimples.ejemploRetornoValores();
        //System.out.println("Valor retornado: " + valorRetornado);
        //MetodosEstaticosSimples.ejemploSobrecarga();
        //MetodosEstaticosSimples.ejemploSobrecarga(100);

        // 8. Arreglos Unidimensionales
        System.out.println("\n--- Tema: ArreglosUnidimensionales ---");
        ArreglosUnidimensionales.declararCrearInicializar();
        ArreglosUnidimensionales.mostrarLongitud();
        ArreglosUnidimensionales.recorrerConForClasico();
        ArreglosUnidimensionales.recorrerConForEach();
        int[] miArray = {5, 10, 15};
        ArreglosUnidimensionales.arrayComoParametroYRetorno(miArray);

//        // 9. Arreglos Bidimensionales
//        System.out.println("\n--- Tema: ArreglosBidimensionales ---");
//        ArreglosBidimensionales.declararCrearMatrices();
//        ArreglosBidimensionales.recorrerMatriz();
//        ArreglosBidimensionales.ejemploUsosTipicos();
//
//        // 10. Manipulación de Cadenas
//        System.out.println("\n--- Tema: ManipulacionCadenas ---");
//        ManipulacionCadenas.demostrarConcatenacion();
//        ManipulacionCadenas.demostrarMetodosUtiles();
//        ManipulacionCadenas.demostrarInmutabilidad();
//        ManipulacionCadenas.usarStringBuilder();

  //      // 11. Manejo Básico de Excepciones
  //      System.out.println("\n--- Tema: ManejoBasicoExcepciones ---");
  //      ManejoBasicoExcepciones.ejemploTryCatchDivision();
  //      ManejoBasicoExcepciones.ejemploTryCatchInput();
  //      ManejoBasicoExcepciones.ejemploBloqueFinally();
  //      ManejoBasicoExcepciones.evitarCierrePrograma();
//
        // 12. Entrada de Datos (Opcional/Comentado para evitar pausas en la calificación)
        /*
        System.out.println("\n--- Tema: EntradaDeDatos ---");
        EntradaDeDatos.leerVariosTipos();
        EntradaDeDatos.manejarSaltoDeLineaPendiente();
        */
        
        System.out.println("\n--- Fin de la Demostración ---");
    }
}