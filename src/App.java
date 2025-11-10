import controllers.MetodosBusqueda;
import models.Persona;
import view.ShowConsole;

public class App {

    public static void main(String[] args) {
        System.out.println("\nDayanna Chacha");

        MetodosBusqueda mBusqueda = new MetodosBusqueda();
        // mBusqueda.BusquedaLineal(5);
        ShowConsole showConsole = new ShowConsole();

        Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
        };

        System.out.println("\nArreglo de Personas: ");
        //Busqueda de Juan
        String name = "Juan";
        Persona resultadoPer = mBusqueda.searchPersonByName(personas, "Juan");

        //Imprime la persona si encontro
        //Impirme no encontro a una persona con el nombre dado
        showConsole.showPersonResult(resultadoPer, "Juan");

        //Busqueda de edad impar y mayor a 25
        Persona resultadoPer2 = mBusqueda.findPersonByAgeAndImpar(personas, 25);

        //Imprime la persona si encontro
        //Impirme no encontro una persona con edad impar mayor a 25
        showConsole.showPersonResult2(resultadoPer2, 25);

        //Busqueda por valor de nombre 498
        Persona resultadoPer3 = mBusqueda.findPersonaByValueName(personas, 498);
        boolean valorNombre = true;
        showConsole.showPersonResult3(resultadoPer3, 498, valorNombre);
    }
}
