package oop007;

public enum PrecioViaje {
    COLECTIVO(19.50),
    SUBTE(21.50);

    private double precio;

    private PrecioViaje(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }
}
