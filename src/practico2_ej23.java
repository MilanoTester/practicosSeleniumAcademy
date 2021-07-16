public class practico2_ej23 {
    public static void main (String args[]) {
        // Mostrar los números múltiplos de 3, que se encuentran entre 10 al 40 utilizando un for. Es decir, 12,15,18…

        //Descripción del programa
        System.out.println("El programa muestra los números múltiplos de 3, que se encuentran entre 10 y 40:");

        for (int i=10; i<=40; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }

        System.out.println("El programa ha finalizado.");

    }
}
