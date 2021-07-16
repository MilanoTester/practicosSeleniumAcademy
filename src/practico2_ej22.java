public class practico2_ej22 {
    public static void main (String args[]) {
        // Mostrar los números entre 90 y 100, de forma decreciente. Ej. 100, 99, 98….. 90

        //Descripción del programa
        System.out.println("El programa muestra los números entre 90 y 100, de forma decreciente:");

        for (int i=100; i>=90; i=i-1) {
            System.out.println(i);
        }

        System.out.println("El programa ha finalizado.");
    }
}
