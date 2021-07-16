public class practico2_ej27 {
    public static void main (String args[]) {
        // Mostrar por pantalla cuantos multiplos de 3 existen entre el 10 y el 70.

        System.out.println("El programa muestra cuántos números múltiplos de 3 existen entre 10 y 70:");
        int contador = 0;

        for (int i=10; i<=70; i++) {
            if (i%3==0) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Existen " + contador + " números múltiplos de 3.");
        System.out.println("Fin.");
    }
}
