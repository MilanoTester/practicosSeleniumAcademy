package practico6;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosArreglos {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // 1. Calcular la media de una serie de números que se leen por teclado.
        // Creando un arreglo de 5 posiciones, pedir el ingreso de datos y mostrarlos
        Float[] arregloPesos = new Float[5];
        ingresoDatos(arregloPesos);
        imprimirArreglo(arregloPesos);

        // Calcular el promedio de los datos en el arreglo:
        float promedio = promedioArreglo(arregloPesos);
        System.out.println("El promedio de los datos ingresados es: " + promedio);

        // 4. Definir un arreglo de Double de 16 posiciones. Imprimir todos los valores del mismo.
        arregloDouble();

        // 5. Definir un arreglo de Booleanos con 9 posiciones. Imprimir todos los valores del arreglo.
        arregloBooleanos();

        // 6. Crear un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtener la suma de todos ellos y el promedio.
        promedioArregloEnteros();

        // 7. Llenar un array con números aleatorios. Imprimir todos los números en pantalla.
        arregloAleatorios();

        // 8. Crear un array de booleanos con 10 posiciones llamado asientosLibres y colocar todos sus elementos en true.
        asientosLibres();

        // 9. Contar el número de elementos positivos, negativos y ceros en un array de 5 enteros.
        // Mostrar la cantidad de números positivos, negativos y ceros: Ej. “Se ingresaron 2 números positivos, 1 número negativo y 1 cero”
        signosEnArreglo();

        // 10. Crear un método que reciba un arreglo, y retorne la cantidad de elementos de la misma.
        System.out.println("Ejercicio 10. Calculando la cantidad de datos en el arreglo seleccionado...");
        int cantidadElementos = largoArregloFloat(arregloPesos);
        System.out.println("En el arreglo hay " + cantidadElementos + " elementos.");





        System.out.println("Fin");
    }




    // 1. Calcular la media de una serie de números que se leen por teclado.
    public static Float[] ingresoDatos(Float[] arregloNumeros) {
        Scanner input = new Scanner(System.in);
        float num = 0;
        System.out.println("Ejercicio 1. A continuación ingrese los datos a guardar.");
        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println("Ingrese un número: ");
            num = input.nextFloat();
            arregloNumeros[i] = num;
        }
        return arregloNumeros;
    }

    public static float promedioArreglo(Float[] arregloNumeros) {
        float suma = 0;
        float promedio = 0;
        for (int i = 0; i < arregloNumeros.length; i++) {
            suma = suma + arregloNumeros[i];
        }
        promedio = suma / arregloNumeros.length;
        return promedio;
    }

    public static void imprimirArreglo(Float[] arregloNumeros) {
        for (int i=0; i < arregloNumeros.length; i++) {
            System.out.println("Valor de la posición " + i + ": " + arregloNumeros[i]);
        }
    }

    // 4. Definir un arreglo de Double de 16 posiciones. Imprimir todos los valores del mismo.
    public static void arregloDouble() {
        Double[] arregloDouble = new Double[16];
        System.out.println("Ejercicio 4. Estos son los valores del arreglo de datos tipo Double.");
        for (int i = 0; i < arregloDouble.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + arregloDouble[i]);
        }
    }

    // 5. Definir un arreglo de Booleanos con 9 posiciones. Imprimir todos los valores del arreglo.
    public static void arregloBooleanos() {
        Boolean[] arregloBooleanos = new Boolean[9];
        System.out.println("Ejercicio 5. Estos son los valores del arreglo de datos tipo Boolean.");
        for (int i = 0; i < arregloBooleanos.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + arregloBooleanos[i]);
        }
    }

    // 6. Crear un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtener la suma de todos ellos y el promedio.
    public static void promedioArregloEnteros() {
        System.out.println("Ejercicio 6. Calculando arreglo de 100 posiciones que contiene números desde 1 hasta 100...");
        Float[] arregloEnteros = new Float[100];
        float suma = 0f;
        float promedio = 0f;
        for (int i = 0; i < arregloEnteros.length; i++) {
            arregloEnteros[i] = i+1f;
            suma = suma + arregloEnteros[i];
        }
        promedio = suma / arregloEnteros.length;
        System.out.println("La suma de todos los números en el arreglo es: " + suma);
        System.out.println("El promedio de todos los números en el arreglo es: " + promedio);
    }

    // 7. Llenar un array con números aleatorios. Imprimir todos los números en pantalla.
    public static void arregloAleatorios() {
        System.out.println("Ejercicio 7. Calculando arreglo de 5 posiciones que contiene números enteros aleatorios entre 1 y 100...");
        Integer[] arregloAleatorios = new Integer[5];
        Random r = new Random();
        int numAleatorio = 0;

        for (int i = 0; i < arregloAleatorios.length; i++) {
            numAleatorio = r.nextInt(99)+1;
            arregloAleatorios[i] = numAleatorio;
            System.out.println("Valor de la posición " + i + ": " + arregloAleatorios[i]);
        }
    }

    // 8. Crear un array de booleanos con 10 posiciones llamado asientosLibres y colocar todos sus elementos en true.
    public static void asientosLibres() {
        System.out.println("Ejercicio 8. Calculando arreglo de 10 asientos y mostrar cuáles están libres...");
        Boolean[] arregloAsientos = new Boolean[10];
        for (int i = 0; i < arregloAsientos.length; i++) {
            arregloAsientos[i] = true;
            System.out.println("El asiento " + (i+1) + " está libre? " + arregloAsientos[i]);
        }
    }

    // 9. Contar el número de elementos positivos, negativos y ceros en un array de 5 enteros.
    // Mostrar la cantidad de números positivos, negativos y ceros: Ej. “Se ingresaron 2 números positivos, 1 número negativo y 1 cero”
    public static void signosEnArreglo() {
        System.out.println("Ejercicio 9. Calculando un arreglo de 5 números enteros...");
        Integer[] arregloEnteros = new Integer[5];
        Random r = new Random();
        int numNegativos = 0;
        int numPositivos = 0;
        int numCeros = 0;

        for (int i = 0; i < arregloEnteros.length; i++) {
            int numero = r.nextInt(101)-50 ;
            arregloEnteros[i] = numero;
            System.out.println("Valor de la posición " + i + ": " + arregloEnteros[i]);

            if (arregloEnteros[i] > 0) {
                numPositivos++;
            } else if (arregloEnteros[i] < 0) {
                numNegativos++;
            } else {
                numCeros++;
            }
        }
        if (numCeros != 0) {
            System.out.println("El arreglo tiene " + numPositivos + " números positivos, " + numNegativos + " números negativos y " + numCeros + " cero(s).");
        } else {
            System.out.println("El arreglo tiene " + numPositivos + " números positivos, " + numNegativos + " números negativos y no tiene ceros.");
        }
    }

    // 10. Crear un método que reciba un arreglo, y retorne la cantidad de elementos de la misma.
    public static int largoArregloFloat (Float[] arregloFloat) {
        int nElementos = arregloFloat.length;
        return nElementos;
    }







}
