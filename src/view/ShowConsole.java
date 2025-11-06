package view;

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
            System.out.println("El numero [" + numeroBuscado + "] encontro en la posiscion [" + posicion + "]");
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
}
