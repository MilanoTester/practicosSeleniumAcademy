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

        float promedio = promedioArreglo(arregloPesos);  // Calculando el promedio de los datos en el arreglo
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
        imprimirArreglo(arregloPesos);
        System.out.println("En el arreglo hay " + cantidadElementos + " elementos.");

        // 11. Crear un método llamado crearArregloBooleano que retorne un arreglo de 10 posiciones de tipo booleanos donde todas
        // sus posiciones tengan valor false.
        System.out.println("Ejercicio 11. Calculando un arreglo de 10 datos booleanos con valor 'false'...");
        Boolean[] materialesEntregados = new Boolean[10];
        materialesEntregados =  crearArregloBooleano();

        // Imprimir al arreglo para ver el resultado
        for (int i = 0; i < materialesEntregados.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + materialesEntregados[i]);
        }

        // 12. Crear un método llamado imprimirArreglo que imprima en pantalla los elementos de un array de enteros recibido por parámetro.
        System.out.println("Ejercicio 12. Calculando un arreglo de 5 números enteros...");
        Integer[] ropaEntregada = new Integer[5];  // Creando un arreglo de números enteros
        ropaEntregada[0] = 25;
        ropaEntregada[1] = 11;
        ropaEntregada[2] = 34;
        ropaEntregada[3] = 48;
        ropaEntregada[4] = 75;
        imprimirArreglo(ropaEntregada); // Imprimiendo con el método imprimirArreglo

        // 13. Crear un método llamado imprimirArreglo que imprima en pantalla los elementos de un array de booleanos recibido por parámetro.
        System.out.println("Ejercicio 13. Calculando un arreglo de datos booleanos...");
        Boolean[] personasPorEntregar = new Boolean[5];  // Creando un arreglo de datos booleanos
        personasPorEntregar[0] = true ;
        personasPorEntregar[1] = false;
        personasPorEntregar[2] = true ;
        personasPorEntregar[3] = true;
        personasPorEntregar[4] = false;
        imprimirArreglo(personasPorEntregar); // Imprimiendo el arreglo creado de datos booleanos

        // 14. Crear un método que muestre en pantalla todos los elementos de un array de float.
        System.out.println("Ejercicio 14. Calculando un arreglo de números con decimales...");
        Float[] arregloAlturas = new Float[5];  // Creando un arreglo de datos con números decimales
        arregloAlturas[0] = 1.80f;
        arregloAlturas[1] = 1.63f;
        arregloAlturas[2] = 1.57f;
        arregloAlturas[3] = 1.98f;
        arregloAlturas[4] = 1.75f;
        imprimirArreglo(arregloAlturas); // Imprimiendo el arreglo creado de datos con números decimales

        // 15. Crear un método que reciba una arreglo, y retorne el promedio de los mismos.
        float promedioAlturas = promedioArreglo(arregloAlturas);
        System.out.println("Ejercicio 15. El promedio de las alturas es: " + promedioAlturas);

        // 16. Crear un método que reciba un arreglo, y retorne la suma.
        float sumaAlturas = sumaArreglo(arregloAlturas);
        System.out.println("ejercicio 16. La suma de las alturas es: " + sumaAlturas);

        // 17. Crear un método que reciba un arreglo de enteros, y retorne el menor.
        int menorRopaEntregada = menorValor(ropaEntregada); // Obtener el menor valor de un arreglo de números enteros creado previamente
        System.out.println("Ejercicio 17. En el arreglo de ropa entregada, la menor cantidad es: " + menorRopaEntregada);

        // 18. Crear un método que reciba un arreglo de enteros, y retorne el mayor.
        int mayorRopaEntregada = mayorValor(ropaEntregada); // Obtener el menor valor de un arreglo de números enteros creado previamente
        System.out.println("Ejercicio 18. En el arreglo de ropa entregada, la mayor cantidad es: " + mayorRopaEntregada);

        // 19. Crear un método llamado hayVacantes que reciba un arreglo de booleanos y retorne verdadero si alguna de sus posiciones
        // esta en true, de lo contrario, deberá retornar false.
        System.out.println("Ejercicio 19. Revisar registro de habitaciones vacantes...");
        Boolean[] habitacionesVacantes = new Boolean[5];    // Creando arreglo de datos booleanos
        habitacionesVacantes[0] = false;
        habitacionesVacantes[1] = false;
        habitacionesVacantes[2] = true;
        habitacionesVacantes[3] = false;
        habitacionesVacantes[4] = false;

        boolean siHayVacantes = hayVacantes(habitacionesVacantes);
        // Imprimiendo resultado en pantalla
        if (siHayVacantes == true) {
            System.out.println("Sí hay habitaciones vacantes.");
        } else {
            System.out.println("No hay habitaciones vacantes.");
        }

        imprimirArreglo(habitacionesVacantes);  // Imprimir datos del arreglo para validar el resultado del método hayVacantes


        // 20. Crear un método que reciba un arreglo de enteros por parámetro y que solicite el ingreso de un valor. Debe retornar true
        // si y sólo si el valor ingresado por el usuario se encuentra en el arreglo.
        System.out.println("Ejercicio 20. Identificar si un dato ingresado por el usuario se encuentra en los registros...");
        Integer[] arregloExistencias = new Integer[5];  // Creando un arreglo de números enteros
        arregloExistencias[0] = 5;
        arregloExistencias[1] = 12;
        arregloExistencias[2] = 24;
        arregloExistencias[3] = 45;
        arregloExistencias[4] = 66;

        boolean valorEnRegistro = valorEnArreglo(arregloExistencias);   // Solicitar el dato a buscar y hacer la búsqueda
        if (valorEnRegistro == true) {
            System.out.println("El dato consultado SÍ se encuentra en el registro.");
        } else {
            System.out.println("El dato consultado NO se encuentra en el registro.");
        }
        imprimirArreglo(arregloExistencias); // Imprimir el arreglo para validar el resultado


        // 21. Crear un método que reciba un arreglo de booleanos y retorne true si y sólo si, todos los elementos son verdaderos.
        System.out.println("Ejercicio 21. Identificar si todos los elementos de un arreglo tienen valor 'verdadero'...");
        Boolean[] arregloEvaluaciones = new Boolean[5];  // Creando un arreglo de números enteros
        arregloEvaluaciones[0] = true;
        arregloEvaluaciones[1] = true;
        arregloEvaluaciones[2] = true;
        arregloEvaluaciones[3] = true;
        arregloEvaluaciones[4] = true;

        Boolean aprobado = arregloTodosVerdaderos(arregloEvaluaciones);   // Aplicar el método al arreglo de booleanos
        if (aprobado == true) {
            System.out.println("Todos los datos del registro tienen valor 'true'. Resultado: Aprobado. ");
        } else {
            System.out.println("Existen datos con valor 'false' en el registro. Resultado: NO aprobado. ");
        }
        imprimirArreglo(arregloEvaluaciones); // Imprimir el arreglo para validar el resultado


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

    // 11. Crear un método llamado crearArregloBooleano que retorne un arreglo de 10 posiciones de tipo booleano donde todas
    // sus posiciones tengan valor false.
    public static Boolean[] crearArregloBooleano() {

        Boolean[] arregloBooleano = new Boolean[10];
        for (int i = 0; i < arregloBooleano.length; i++) {
            arregloBooleano[i] = false;
        }
        return arregloBooleano;
    }

    // 12. Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos de un array de enteros el cual es
    // recibido por parámetro.
    public static void imprimirArreglo(Integer[] arregloNumeros) {
        System.out.println("Imprimiendo el arreglo de datos...");
        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + arregloNumeros[i]);
        }
    }

    // 13. Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos de un array de booleanos el cual
    // es recibido por parámetro.
    public static void imprimirArreglo(Boolean[] arregloBooleanos) {
        System.out.println("Imprimiendo el arreglo de datos...");
        for (int i = 0; i < arregloBooleanos.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + arregloBooleanos[i]);
        }
    }

    // 14. Crear un método que muestre en pantalla todos los elementos de un array de float.
    public static void imprimirArreglo(Float[] arregloNumeros) {
        System.out.println("Imprimiendo el arreglo de datos...");
        for (int i=0; i < arregloNumeros.length; i++) {
            System.out.println("Valor de la posición " + i + ": " + arregloNumeros[i]);
        }
    }

    // 15. Crear un método que reciba una arreglo, y retorne el promedio de los mismos.
    public static float promedioArreglo(Float[] arregloNumeros) {
        float promedio = 0;
        float suma = sumaArreglo(arregloNumeros);
        promedio = suma / arregloNumeros.length;
        return promedio;
    }

    // 16. Crear un método que reciba un arreglo, y retorne la suma.
    public static float sumaArreglo(Float[] arregloNumeros) {
        float suma = 0;
        for (int i = 0; i < arregloNumeros.length; i++) {
            suma = suma + arregloNumeros[i];
        }
        return suma;
    }

    // 17. Crear un método que reciba un arreglo de enteros, y retorne el menor.
    public static int menorValor(Integer[] arregloNumeros) {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < arregloNumeros.length; i++) {
            if (arregloNumeros[i] < menor) {
                menor = arregloNumeros[i];
            }
        }
        return menor;
    }

    // 18. Crear un método que reciba un arreglo de enteros, y retorne el mayor.
    public static int mayorValor(Integer[] arregloNumeros) {
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < arregloNumeros.length; i++) {
            if (arregloNumeros[i] > mayor) {
                mayor = arregloNumeros[i];
            }
        }
        return mayor;
    }

    // 19. Crear un método llamado hayVacantes que reciba un arreglo de booleanos y retorne verdadero si alguna de sus posiciones
    // esta en true, de lo contrario, deberá retornar false.
    public static Boolean hayVacantes(Boolean[] arregloVacantes) {
        boolean estaVacante = false;
        int i = 0;
        while ((i < arregloVacantes.length) && (estaVacante != true)) {
            if (arregloVacantes[i] == true) {
                estaVacante = arregloVacantes[i];
            }
            i++;
        }
        return estaVacante;
    }

    // 20. Crear un método que reciba un arreglo de enteros por parámetro y que solicite el ingreso de un valor. Debe retornar true
    // si y sólo si el valor ingresado por el usuario se encuentra en el arreglo.
    public static Boolean valorEnArreglo(Integer[] arregloNumeros) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        Integer num = input.nextInt();

        boolean numEnArreglo = false;
        int i = 0;
        while ((i < arregloNumeros.length) && (numEnArreglo == false)) {
            if (arregloNumeros[i] == num) {
                numEnArreglo = true;
            }
            i++;
        }
        return numEnArreglo;
    }

    // 21. Crear un método que reciba un arreglo de booleanos y retorne true si y sólo si, todos los elementos son verdaderos.
    public static Boolean arregloTodosVerdaderos(Boolean[] arregloBooleanos) {
        boolean valorVerdadero = true;
        int i = 0;
        while ((i < arregloBooleanos.length) && (valorVerdadero == true)) {
            if (arregloBooleanos[i] == false) {
                valorVerdadero = arregloBooleanos[i];
            }
            i++;
        }
        return valorVerdadero;
    }


}
