package controllers;

import models.Persona;
import view.ShowConsole;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private int[] arreglo;

    // Constructor
    public MetodosBusqueda() {
        this.arreglo = new int[]{10, 11, -2, 5, 6, 8, 15, 22};
        this.showConsole = new ShowConsole();

        System.out.println("\nArreglo Original: ");
        showConsole.printArray(arreglo);
        System.out.println();

        // Buscar el número 5 (con for)
        int resultado1 = busquedaLineal(5);
        showConsole.printResult(5, resultado1);

        // Buscar el número -2 (con for)
        int resultado2 = busquedaLineal(-2);
        showConsole.printResult(-2, resultado2);

        // Buscar el número 20 (con while)
        int resultado3 = busquedaLinealWhile(20);
        showConsole.printResult(20, resultado3);

        // Buscar el número 100 (con Integer)
        Integer resultado4 = busquedaLinealObj(100);
        showConsole.printResult(resultado4);

        // Buscar el número 10 (con Integer)
        Integer resultado5 = busquedaLinealObj(10);
        showConsole.printResult(resultado5);
    }

    // Método de búsqueda lineal con for
    public int busquedaLineal(int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // Método de búsqueda lineal con while
    public int busquedaLinealWhile(int valor) {
        int i = 0;
        while (i < arreglo.length) {
            if (arreglo[i] == valor) {
                return i;
            }
            i++;
        }
        return -1;
    }

    // Retorna el objeto buscado si lo encontró, si no retorna null
    public Integer busquedaLinealObj(int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return arreglo[i];
            }
        }
        return null;
    }

    // Buscar una persona por nombre
    public Persona searchPersonByName(Persona[] personas, String name){
        for (Persona persona : personas) {
            if (persona.getName().equalsIgnoreCase(name)) {
                return persona;
            }
        }
        return null;
    }

    // Encontrar una persona que sea mayor de: age
    // Y la edad sea impar
    public Persona findPersonByAgeAndImpar(Persona[] personas, int age){
        for (Persona persona : personas) {
            // Persona con edad mayor a 'age' y edad impar
            if (persona.getAge() > age && persona.getAge() % 2 != 0) {
                return persona;
            }
        }
        return null;
    }

    // Buscar una persona por valor del nombre (suma de códigos ASCII igual a value)
    public Persona findPersonaByValueName(Persona[] personas, int value) {
        for (Persona persona : personas) {
            int suma = 0;
            // Calcula el "valor del nombre" sumando los códigos ASCII de cada letra
            for (int i = 0; i < persona.getName().length(); i++) {
                suma += persona.getName().charAt(i);
                //convertir el nombre (una cadena de texto) en sus caracteres individuales, y sumar el valor numérico (código ASCII) de cada uno.
            }
            if (suma == value) {
                return persona;
            }
        }
        return null;
    }
}
