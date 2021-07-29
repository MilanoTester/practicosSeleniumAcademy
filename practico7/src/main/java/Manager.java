public class Manager extends Empleado {
    // Atributos
    private String area;

    // Constructor con parámetro Área
    public Manager(String unNombre, int unTelefono, float unSueldo, String unArea) {
        super(unNombre, unTelefono, unSueldo);
        this.area = unArea;
    }

    // Método get
    public String getArea() {
        return this.area;
    }

    // Método set
    public void setArea(String unArea) {
        this.area = unArea;
    }

    // Método toString
    public String toString() {
        String retorno = super.toString();
        retorno += " Manager del area: " + this.getArea() + ".";
        return retorno;
    }




}
