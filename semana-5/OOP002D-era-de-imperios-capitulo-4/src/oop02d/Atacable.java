package oop02d;

public interface Atacable {
    public boolean atacar(Unidad enemigo);
    public void recibirDanio(double cantidad);
//    public double distanciaCon(Atacable otraUnidad);
    public Posicion getPosicion();
}
