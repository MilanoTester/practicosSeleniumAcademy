public class practico2_ej32 {
    public static void main (String args[]) {
        // Mostrar los múltiplos de 9 entre 0 y 100 que sean impares.

        System.out.println("El programa muestra los números múltiplos de 9 que son impares, comprendidos entre 0 y 100:");
        int i=0;

        while (i<=100) {
            if ((i%9==0) && (i%2!=0)) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("Fin.");
    }

}
