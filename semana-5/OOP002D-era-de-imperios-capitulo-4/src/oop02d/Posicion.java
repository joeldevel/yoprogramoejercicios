package oop02d;

public class Posicion {

    private double x, y;

    public Posicion(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanciaCon(Posicion otraPosicion) {
        return Math.sqrt(Math.pow(otraPosicion.getY() - this.getY(), 2)
                + Math.pow(otraPosicion.getX() - this.getX(), 2));
    }
}
