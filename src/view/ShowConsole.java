package view;

import models.Persona;

// Métodos solo para imprimir
public class ShowConsole {

    public ShowConsole() {
    }

    public void printArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1) {
                System.out.print(", ");
            }
        }
    }

    // Mensajes tipo for o while
    public void printResult(int numeroBuscado, int posicion) {
        if (posicion == -1) {
            System.out.println("Error... el numero buscado no se encontro el [" + numeroBuscado + "]");
        } else {
            System.out.println("El numero [" + numeroBuscado + "] encontro en la posicion [" + posicion + "]");
        }
    }

    // Mensajes tipo Integer
    public void printResult(Integer resultado) {
        if (resultado != null) {
            System.out.println("El numero [" + resultado + "] se encontro");
        } else {
            System.out.println("Error...el numero buscado NO se encontro");
        }
    }

    // Mostrar resultado búsqueda por nombre
    public void showPersonResult(Persona persona, String name) {
        if (persona != null) {
            System.out.println("Persona encontrada: " + persona);
        } else {
            System.out.println("Error... no se encontro a una persona con el nombre " + name);
        }
    }

    // Mostrar resultado búsqueda por edad impar y mayor que age
    public void showPersonResult2(Persona persona, int age) {
        if (persona != null) {
            System.out.println("Persona encontrada: " + persona);
        } else {
            System.out.println("Error... no se encontro a una persona mayor de " + age + " con edad impar");
        }
    }

    // Mostrar resultado de búsqueda por valor del nombre
    public void showPersonResult3(Persona persona, int value, boolean valorNombre) {
        if (persona != null) {
            System.out.println("Persona encontrada con valor " + value + ": " + persona);
        } else {
            System.out.println("Error... no se encontro a una persona con valor  " + value + "");
        }
    }

}
