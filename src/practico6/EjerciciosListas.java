package practico6;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosListas {
    public static void main(String args []) {

        // Crear listas
        ArrayList<Integer> listaDatos = new ArrayList<Integer>();

        // Agregar datos a las listas
        listaDatos.add(10);
        listaDatos.add(20);
        listaDatos.add(30);
        listaDatos.add(40);
        listaDatos.add(50);
        listaDatos.add(-3);


        // 3. Crear un método imprimirListaEnteros que reciba una lista de enteros, y los imprima en pantalla
        imprimirListaEnteros(listaDatos);

        // 4. Crear un método imprimirListaStrings que reciba una lista de Strings, y los imprima en pantalla
        ArrayList<String> listaColores = new ArrayList<String>();
        listaColores.add("Azul");
        listaColores.add("Verde");
        listaColores.add("Naranja");
        listaColores.add("Rojo");
        listaColores.add("Púrpura");
        imprimirListaStrings(listaColores);

        // 5. Método que reciba una lista de enteros, y retorne la cantidad de elementos de la misma
        int tamañoListaDatos = cantidadElementosEnteros(listaDatos);
        System.out.println("Ejercicio 5. Cantidad de elementos en la lista de números enteros: " + tamañoListaDatos);

        // 6. Método que reciba una lista de enteros, y retorne verdadero si y sólo si la lista está vacía
        boolean listaDatosVacia = listaEnterosVacia(listaDatos);
        System.out.println("Ejercicio 6. La lista de números enteros esta vacía? " + listaDatosVacia);

        // 7. Método que reciba una lista de enteros, y retorne la suma
        int sumaListaDatos = sumaListaEnteros(listaDatos);
        System.out.println("Ejercicio 7. La suma de la lista de números enteros es: " + sumaListaDatos);

        // 8. Método que reciba una lista de enteros, y retorne el promedio de los mismos
        float promedioListaDatos = promedioListaEnteros(listaDatos);
        System.out.println("Ejercicio 8. El promedio de los números enteros es: " + promedioListaDatos);

        // 9. Método que reciba una lista de enteros, y retorne el menor
        int menorListaDatos = menorListaEnteros(listaDatos);
        System.out.println("Ejercicio 9. El menor valor de la lista de números enteros es: " + menorListaDatos);

        // 10. Método que reciba una lista de enteros, y retorne el mayor
        int mayorListaDatos = mayorListaEnteros(listaDatos);
        System.out.println("Ejercicio 10. El mayor valor de la lista de números enteros es: " + mayorListaDatos);

        // 11. Método que reciba una lista de booleanos, y retorne verdadero si y sólo si todos los elementos de la lista son true.
        // De lo contrario se debe retornar false. Sugerencia: utilizar WHILE.
        ArrayList<Boolean> listaPreguntas = new ArrayList<Boolean>();
        listaPreguntas.add(true);
        listaPreguntas.add(false);
        listaPreguntas.add(true);
        listaPreguntas.add(true);
        listaPreguntas.add(true);
        boolean trueListaPreguntas = trueListaBooleanos(listaPreguntas);

        if (listaPreguntas.isEmpty() == false) {
            if (trueListaPreguntas == true) {
                System.out.println("Ejercicio 11. Todos los valores de la lista de preguntas son verdaderos, por lo tanto el resultado es verdadero.");
            } else {
                System.out.println("Ejercicio 11. Al menos un valor de la lista de preguntas es falso, por lo tanto el resultado es falso.");
            }
        } else {
            System.out.println("Ejercicio 11. La lista de preguntas esta vacía, no contiene ningún valor.");
        }

        // 12. Método leerValores(): pide por teclado los números y los almacena en el ArrayList. La lectura acaba cuando se introduce
        // el valor -99. El método devuelve mediante return el ArrayList con los valores introducidos
        System.out.println("Ejercicio 12. El sistema acepta el ingreso de números para generar una lista.");
        ArrayList<Float>listaNumeros = leerValores();
        System.out.println("La lista de números ingresados es: " + listaNumeros);

        // FIN DEL PROGRAMA
        System.out.println("Fin");

    }


    // 3. Crear un método imprimirListaEnteros que reciba una lista de enteros, y los imprima en pantalla
    public static void imprimirListaEnteros(ArrayList<Integer> listaEnteros) {
        System.out.println("Ejercicio 3. Estos son los datos de la lista de enteros:");
        for (int i=0; i<listaEnteros.size(); i++) {
            System.out.println(listaEnteros.get(i));
        }
    }

    // 4. Crear un método imprimirListaStrings que reciba una lista de Strings, y los imprima en pantalla
    public static void imprimirListaStrings(ArrayList<String> listaStrings) {
        System.out.println("Ejercicio 4. Estos son los datos de la lista de Strings:");
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
        if (listaEnteros.isEmpty() == true) {
            return true;
        } else {
            return false;
        }

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

    // 11. Método que reciba una lista de booleanos, y retorne verdadero si y sólo si todos los elementos de la lista son true.
    // De lo contrario se debe retornar false. Sugerencia: utilizar WHILE.
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

    // 12. Método leerValores(): pide por teclado los números y los almacena en el ArrayList. La lectura acaba cuando se introduce
    // el valor -99. El método devuelve mediante return el ArrayList con los valores introducidos.
    public static ArrayList leerValores() {
        Scanner input = new Scanner(System.in);
        float numero = 0;
        final float FIN = -99f;
        ArrayList<Float> listaNumeros = new ArrayList<Float>();

        while (numero != FIN) {
            System.out.println("Ingrese un número: ");
            numero = input.nextFloat();
            // Asumo que el número -99 es sólo para terminar el ingreso de datos y no debe guardarse en el ArrayList
            if (numero != FIN) {
                listaNumeros.add(numero);
            }
        }
        return listaNumeros;
    }

}
