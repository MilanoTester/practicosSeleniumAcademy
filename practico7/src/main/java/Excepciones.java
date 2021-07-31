import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String args[]) {

        // Ejemplos de excepciones, uso de try y catch
        Scanner input = new Scanner(System.in);
        JavaUtils.mensajeBienvenida();


        System.out.println("Ejercicio 1: se pide ingresar un número; ingresar una letra en su lugar.");
        try {
            System.out.println("Ingrese un número:");
            int numero = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar sólo números enteros!");

        } catch (Exception e) {
             System.out.println("Ha ocurrido un error del tipo: " + e + ". Contacte un administrador.");
        }


        System.out.println("Ejercicio 2: creando arreglo de 3 posiciones, e imprimiendo posición 4...");
        Integer[]unArreglo = new Integer[3];
        try {
            System.out.println(unArreglo[3]);
        } catch (Exception e){
            System.out.println("Ha ocurrido un error del tipo " + e + ". Contacte un administrador.");
        }


        System.out.println("Ejercicio 3: realizando la siguiente operación: 3/0");
        try {
            double promedio = 3 / 0;
            System.out.println(promedio);
        } catch (ArithmeticException e) {
            System.out.println("Ha ocurrido un error del tipo " + e + ". Contacte un administrador.");
        }

         JavaUtils.mensajeFin();
    }

}
