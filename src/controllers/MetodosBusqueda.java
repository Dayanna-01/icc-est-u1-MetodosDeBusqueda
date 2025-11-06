package controllers;

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
}
