package practico6;

import java.util.ArrayList;

public class EjerciciosListas {
    public static void main(String args []) {

        ArrayList<Integer> listaDatos = new ArrayList<Integer>();
        listaDatos.add(10);
        listaDatos.add(20);
        listaDatos.add(30);
        listaDatos.add(40);
        listaDatos.add(50);

        System.out.println("La lista esta formada por estos datos: " + listaDatos);

        // 5. Método que reciba una lista de enteros, y retorne la cantidad de elementos de la misma
        int tamañoLista = cantidadElementosEnteros(listaDatos);
        System.out.println("Cantidad de elementos en la lista: " + tamañoLista);

        // PROBAR QUE SUCEDE CON EL TAMAÑO DE LA LISTA SI ELIMINO UN ELEMENTO? (EL TAMAÑO DISMINUYE?)
    }

    // 5. Método que reciba una lista de enteros, y retorne la cantidad de elementos de la misma
    public static int cantidadElementosEnteros (ArrayList<Integer> listaEnteros) {
        return listaEnteros.size();
    }



}
