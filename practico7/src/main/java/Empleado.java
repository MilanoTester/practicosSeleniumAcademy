public class Empleado {

    // Atributos
    private String nombre;
    private int telefono;
    private float sueldo;
    private static int IDENTIFICADOR;


    // Constructor sin parámetros
    public Empleado() {
        this.nombre = "desconocido";
        this.telefono = 0000;
        this.sueldo = 0000.0f;
        IDENTIFICADOR++;
    }

    // Constructor con 3 parámetros: nombre, sueldo, teléfono
    public Empleado(String unNombre, int unTelefono, float unSueldo) {
        this.nombre = unNombre;
        this.telefono = unTelefono;
        this.sueldo = unSueldo;
        IDENTIFICADOR++;
    }


    // Métodos get
    public String getNombre() {
        return this.nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
    public float getSueldo() {
        return this.sueldo;
    }

    // Métodos set
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    public void setTelefono(int unTelefono) {
        this.telefono = unTelefono;
    }
    public void setSueldo(float unSueldo) {
        this.sueldo = unSueldo;
    }


    // Método toString
    public String toString() {
        return "Nombre del empleado: " + this.getNombre() + ". Teléfono: " + this.getTelefono();
    }

}
