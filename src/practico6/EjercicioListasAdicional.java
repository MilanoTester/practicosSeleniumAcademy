package practico6;

import java.util.ArrayList;

public class EjercicioListasAdicional {
    public static void main (String args[]) {
        // Método que reciba una lista de booleanos, y retorne verdadero si y sólo si todos los elementos de la lista son true.
        // De lo contrario se debe retornar false (ugerencia: utilizar WHILE).
        // Además, probar qué sucede al eliminar un elemento de la lista; imprimir los resultados en pantalla.

        ArrayList<Boolean> listaPreguntas = new ArrayList<Boolean>();
        listaPreguntas.add(true);
        listaPreguntas.add(true);
        listaPreguntas.add(false);
        listaPreguntas.add(true);

        System.out.println("ANTES DE BORRAR LA POSICIÓN 2: ");
        int tamaño = listaPreguntas.size();
        System.out.println("El tamaño de la lista es " + tamaño);
        mensajeDeResultado(listaPreguntas);

        // Borrar la posición 2
        listaPreguntas.remove(2);

        System.out.println("DESPUÉS DE BORRAR LA POSICIÓN 2: ");
        tamaño = listaPreguntas.size();
        System.out.println("El tamaño de la lista es " + tamaño);
        mensajeDeResultado(listaPreguntas);

        System.out.println("Fin");

    }

    public static boolean trueListaBooleanos(ArrayList<Boolean> listaBooleanos) {
        boolean trueBooleanos = true;
        int i = 0;
        while ((i < listaBooleanos.size()) && (trueBooleanos == true)) {
            if (listaBooleanos.get(i) == false) {
                trueBooleanos = listaBooleanos.get(i);
            }
            i++;
        }
        return trueBooleanos;
    }

    public static void mensajeDeResultado(ArrayList<Boolean> listaBooleanos) {
        boolean trueListaPreguntas = trueListaBooleanos(listaBooleanos);
        if (listaBooleanos.isEmpty() == false) {
            if (trueListaPreguntas == true) {
                System.out.println("Todos los valores de la lista de preguntas son verdaderos, por lo tanto el resultado es verdadero.");
            } else {
                System.out.println("Al menos un valor de la lista de preguntas es falso, por lo tanto el resultado es falso.");
            }
        } else {
            System.out.println("La lista de preguntas esta vacía, no contiene ningún valor.");
        }

    }

}
