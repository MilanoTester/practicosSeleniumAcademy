import java.util.Scanner;

public class practico2_ej16 {
    public static void main (String args[]) {
        /* Mostrar el resultado del examen:
        Si la nota está entre 0 y 59 → Eliminado
        Si la nota está entre 60 y 79 → Aprobado
        Si la nota está entre 80 y 100 → Aprobado con Excelente
        Si el numero esta fuera de 0 y 100, mostrar que se ha ingresado una nota invalida
        */

        Scanner input = new Scanner(System.in);
        int nota = 0;
        String status = "";

        //Instrucciones para el usuario

        System.out.println("Introducza una nota; el programa indicará el status del alumno:");
        nota = input.nextInt();

        // Validar que el número ingresado se encuentre entre 0 y 100
        while ((nota <0) || (nota > 100)) {
            System.out.println("La nota no es correcta; ingrese un número entre 0 y 100:");
            nota = input.nextInt();
        }

        //Asigna a la nota el status del alumno
        if ((nota >=0) && (nota <= 59)) {
            status = "Eliminado.";
        } else if ((nota >= 60) && (nota <= 79)) {
            status = "Aprobado.";
        } else if ((nota >= 80) && (nota <= 100)) {
            status = "Aprobado con Excelente!";
        }

        //Resultado de la consulta y fin del programa
        System.out.println("La nota es: " + nota + ". El estado del alumno es: " + status);
        System.out.println("El programa ha finalizado.");

    }

}




