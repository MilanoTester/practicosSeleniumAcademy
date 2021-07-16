public class practico2_ej21 {
    public static void main (String args[]) {
        // Mostrar los números pares de 1 a 4000.

        //Presentación del programa
        System.out.println("El programa muestra en pantalla los números pares desde 1 hasta 4000.");

        for (int i=1; i<=4000; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

        System.out.println("El programa ha finalizado.");
    }

}
