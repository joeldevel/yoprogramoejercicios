package oop002a;

public class Unidad {

    private Posicion posicion;

    public Unidad(Posicion posicion) {
        this.posicion = posicion;
    }
    
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
    public double distanciaCon(Unidad otraUnidad) {
        return this.posicion.distanciaCon(otraUnidad.getPosicion());
    }
    
    
}
