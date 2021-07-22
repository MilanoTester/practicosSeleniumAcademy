package practico6;

import java.util.ArrayList;

public class EjerciciosListas {
    public static void main(String args []) {

        // Crear listas
        ArrayList<Integer> listaDatos = new ArrayList<Integer>();
        ArrayList<String> listaColores = new ArrayList<String>();

        // Agregar datos a las listas
        listaDatos.add(10);
        listaDatos.add(20);
        listaDatos.add(30);
        listaDatos.add(40);
        listaDatos.add(50);
        listaDatos.add(-3);

        listaColores.add("Azul");
        listaColores.add("Verde");
        listaColores.add("Naranja");
        listaColores.add("Rojo");
        listaColores.add("Púrpura");

        // Imprimir datos de las listas
        System.out.println("Imprimiendo lista en pantalla (usando un sout): " + listaDatos);
        System.out.println("Imprimiendo lista en pantalla (usando un sout): " + listaColores);

        // 3. Crear un método imprimirListaEnteros que reciba una lista de enteros, y los imprima en pantalla
        imprimirListaEnteros(listaDatos);

        // 4. Crear un método imprimirListaStrings que reciba una lista de Strings, y los imprima en pantalla
        imprimirListaStrings(listaColores);

        // 5. Método que reciba una lista de enteros, y retorne la cantidad de elementos de la misma
        int tamañoListaDatos = cantidadElementosEnteros(listaDatos);
        System.out.println("Cantidad de elementos en la lista de números enteros: " + tamañoListaDatos);

        // 6. Método que reciba una lista de enteros, y retorne verdadero si y sólo si la lista está vacía
        boolean listaDatosVacia = listaEnterosVacia(listaDatos);
        System.out.println("La lista de números enteros esta vacía? " + listaDatosVacia);

        // 7. Método que reciba una lista de enteros, y retorne la suma
        int sumaListaDatos = sumaListaEnteros(listaDatos);
        System.out.println("La suma de la lista de números enteros es: " + sumaListaDatos);

        // 8. Método que reciba una lista de enteros, y retorne el promedio de los mismos
        float promedioListaDatos = promedioListaEnteros(listaDatos);
        System.out.println("El promedio de los números enteros es: " + promedioListaDatos);

        // 9. Método que reciba una lista de enteros, y retorne el menor
        int menorListaDatos = menorListaEnteros(listaDatos);
        System.out.println("El menor valor de la lista de números enteros es: " + menorListaDatos);

        // 10. Método que reciba una lista de enteros, y retorne el mayor
        int mayorListaDatos = mayorListaEnteros(listaDatos);
        System.out.println("El mayor valor de la lista de números enteros es: " + mayorListaDatos);



        // PROBAR QUE SUCEDE CON EL TAMAÑO DE LA LISTA SI ELIMINO UN ELEMENTO? (EL TAMAÑO DISMINUYE?)
    }

    // 3. Crear un método imprimirListaEnteros que reciba una lista de enteros, y los imprima en pantalla
    public static void imprimirListaEnteros(ArrayList<Integer> listaEnteros) {
        System.out.println("Estos son los datos de la lista de enteros:");
        for (int i=0; i<listaEnteros.size(); i++) {
            System.out.println(listaEnteros.get(i));
        }
    }

    // 4. Crear un método imprimirListaStrings que reciba una lista de Strings, y los imprima en pantalla
    public static void imprimirListaStrings(ArrayList<String> listaStrings) {
        System.out.println("Estos son los datos de la lista de Strings:");
        for (int i=0; i<listaStrings.size(); i++) {
            System.out.println(listaStrings.get(i));
        }
    }

    // 5. Método que reciba una lista de enteros, y retorne la cantidad de elementos de la misma
    public static int cantidadElementosEnteros(ArrayList<Integer> listaEnteros) {
        return listaEnteros.size();
    }

    // 6. Método que reciba una lista de enteros, y retorne verdadero si y sólo si la lista está vacía
    public static boolean listaEnterosVacia(ArrayList<Integer> listaEnteros) {
        boolean listaVacia;
        if (listaEnteros.isEmpty() == true) {
            listaVacia = true;
        } else {
            listaVacia = false;
        }
        return listaVacia;

    }

    // 7. Método que reciba una lista de enteros, y retorne la suma
    public static int sumaListaEnteros(ArrayList<Integer> listaEnteros) {
        int suma = 0;
        for (int i=0; i<listaEnteros.size(); i++) {
            suma = suma + listaEnteros.get(i);
        }
        return suma;
    }

    // 8. Método que reciba una lista de enteros, y retorne el promedio de los mismos
    public static float promedioListaEnteros(ArrayList<Integer> listaEnteros) {
        float promedio = sumaListaEnteros(listaEnteros) / listaEnteros.size();
        return promedio;
    }

    // 9. Método que reciba una lista de enteros, y retorne el menor
    public static int menorListaEnteros(ArrayList<Integer> listaEnteros) {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < listaEnteros.size(); i++) {
            if (listaEnteros.get(i) < menor) {
                menor = listaEnteros.get(i);
            }
        }
        return menor;
    }

    // 10. Método que reciba una lista de enteros, y retorne el mayor
    public static int mayorListaEnteros(ArrayList<Integer> listaEnteros) {
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < listaEnteros.size(); i++) {
            if (listaEnteros.get(i) > mayor) {
                mayor = listaEnteros.get(i);
            }
        }
        return mayor;
    }


}
