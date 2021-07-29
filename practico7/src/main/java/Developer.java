public class Developer extends Empleado {
    // Atributos
    private String lenguaje;

    // Constructor con parámetro String
    public Developer(String unNombre, int unTelefono, float unSueldo, String unLenguaje) {
        super(unNombre, unTelefono, unSueldo);
        this.lenguaje = unLenguaje;
    }

    // Método get
    public String getLenguaje() {
        return this.lenguaje;
    }

    // Método set
    public void setLenguaje(String unLenguaje) {
        this.lenguaje = unLenguaje;
    }

    // Método toString
    public String toString() {
        String retorno = super.toString();
        retorno += " Developer en lenguaje: " + this.getLenguaje();
        return retorno;
    }




}
