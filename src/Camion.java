public class Camion {
    // Atributos
    private int chapa;
    private String color;
    private int añoCompra;
    private static int IDENTIFICADOR = 0;


    // Constructor sin parámetros y asignar a atributos valores por defecto
    public Camion() {
        this.chapa = 0000;
        this.color = "desconocido";
        this.añoCompra = 0000;
        IDENTIFICADOR++;
    }

    // Constructor con un parámetro: chapa
    public Camion(int unaChapa) {
        this.chapa = unaChapa;
        this.color = "desconocido";
        this.añoCompra = 0000;
        IDENTIFICADOR++;
    }

    // Constructor con dos parámetros: chapa y color
    public Camion(int unaChapa, String unColor) {
        this.chapa = unaChapa;
        this.color = unColor;
        this.añoCompra = 0000;
        IDENTIFICADOR++;
    }

    // Constructor con tres parámetros: chapa, color y año de compra
    public Camion(int unaChapa, String unColor, int unAñoCompra) {
        this.chapa = unaChapa;
        this.color = unColor;
        this.añoCompra = unAñoCompra;
        IDENTIFICADOR++;
    }


    // Métodos get
    public int getChapa() {
        return this.chapa;
    }
    public String getColor() {
        return  this.color;
    }
    public int getIDENTIFICADOR() {
        return this.IDENTIFICADOR;
    }
    public int getAñoCompra() {
        return this.añoCompra;
    }

    // Métodos set
    public void setChapa(int unaChapa) {
        this.chapa = unaChapa;
    }
    public void setColor(String unColor) {
        this.color = unColor;
    }
    public void setAñoCompra(int unAñoCompra) {
        this.añoCompra = unAñoCompra;
    }


    // Método leTocaRevision
    public boolean leTocaRevision(int añoCompra) {
        if (añoCompra < 2015) {
            return true;
        } else {
            return false;
        }
    }


    // Método para comparar si un camión tiene el mismo color que otro camión pasado como parámetro
    public boolean tienenMismoColor(Camion otroCamion) {
        return this.getColor().equals(otroCamion.getColor());
    }


    // Método toString
    public String toString() {
        boolean tocaRevision = leTocaRevision(this.añoCompra);
        if (tocaRevision == true) {
            return "El camión " + this.getIDENTIFICADOR() + " tiene chapa " + this.getChapa() + ", color " + this.getColor() + ", y sí necesita revisión.";
        } else {
            return "El camión " + this.getIDENTIFICADOR() + " tiene chapa " + this.getChapa() + ", color " + this.getColor() + ", y no necesita revisión.";
        }
    }

}
