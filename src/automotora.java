import java.io.LineNumberReader;
import java.util.Scanner;

public class automotora {
    public static void main (String args[]) {

        Scanner input = new Scanner(System.in);

        // Crear un camión sin parámetros
        Camion camion1 = new Camion();
        // Mostrar camión 1 sin usar método toString
        System.out.println("El camión " + camion1.getIDENTIFICADOR() + " tiene chapa " + camion1.getChapa() + " y color " + camion1.getColor());

        // Crear un camión con un parámetro
        Camion camion2 = new Camion(1234);
        // Mostrar camión 2 usando método toString
        System.out.println(camion2);

        // Crear un camión con dos parámetros y mostrarlo
        Camion camion3 = new Camion(5678, "azul");
        System.out.println(camion3);


        // Pedir datos al usuario para generar un camión y mostrarlo en pantalla
        System.out.println("Para generar un nuevo camión, ingrese datos de chapa, color y año de compra:");
        System.out.println("Ingrese el color:");
        String unColor = input.nextLine();

        System.out.println("Ingrese el número de chapa:");
        int unaChapa = input.nextInt();

        System.out.println("Ingrese el año de compra:");
        int unAñoCompra = input.nextInt();

        Camion camion4 = new Camion(unaChapa, unColor, unAñoCompra);
        System.out.println(camion4);


        // Comparar si dos camiones son iguales:
        boolean camionesIguales = camion3.tienenMismoColor(camion4);

        if (camionesIguales == true) {
            System.out.println("Los camiones " + camion3.getIDENTIFICADOR() + " y " + camion4.getIDENTIFICADOR() + " sí tienen el mismo color.");
        } else {
            System.out.println("Los camiones " + camion3.getIDENTIFICADOR() + " y " + camion4.getIDENTIFICADOR() + " no tienen el mismo color.");
        }

        // Mensajes para conocer valores de atibutos de camiones. HAY UN PROBLEMA CON LOS IDENTIFICADORES.
        System.out.println("Estos son los camiones hasta ahora:");
        System.out.println(camion1);
        System.out.println(camion2);
        System.out.println(camion3);
        System.out.println(camion4);

        System.out.println("Fin");
    }

}
