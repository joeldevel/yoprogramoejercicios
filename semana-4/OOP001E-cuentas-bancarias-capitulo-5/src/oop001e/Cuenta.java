package oop001e;

import java.util.Date;

public class Cuenta {

    private static final int MAX_CANTIDAD_TRANSACCIONES = 100;
    private double saldo;
    private Transaccion[] registroDeTransacciones;
    private int cantidadTransacciones;

    public Cuenta(double saldo) {
        this.setSaldo(saldo);
        this.registroDeTransacciones = new Transaccion[MAX_CANTIDAD_TRANSACCIONES];
        this.cantidadTransacciones = 0;
    }

    public Cuenta() {
        this(0.0);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (!esCantidadValida(saldo)) {
            throw new Error("Cantidad invalida");
        }
        this.saldo = saldo;
    }

    public void ingresarDinero(double cantidad) {
        if (!esCantidadValida(cantidad)) {
            throw new Error("Cantidad invalida");
        }

        saldo += cantidad;

    }

    public void ingresarDinero(double cantidad, String motivo) {
        if (!esCantidadValida(cantidad)) {
            throw new Error("Cantidad invalida");
        }
        this.saldo += cantidad;

        Transaccion t = new Transaccion(motivo, cantidad, TipoTransaccion.DEPOSITO, new Date());
        this.guardarTransaccion(t);
    }

    public double retirarDinero(double cantidad) {
        if (!esCantidadValida(cantidad) || cantidad > this.getSaldo()) {
            throw new Error("Cantidad invalida");
        }

        this.setSaldo(this.getSaldo() - cantidad);

        return this.getSaldo();

    }

    public double retirarDinero(double cantidad, String motivo) {
        if (!esCantidadValida(cantidad) || cantidad > this.getSaldo()) {
            throw new Error("Cantidad invalida");
        }

        this.setSaldo(this.getSaldo() - cantidad);
        Transaccion t = new Transaccion(motivo, cantidad, TipoTransaccion.RETIRO, new Date());
        this.guardarTransaccion(t);
        return this.getSaldo();

    }
    
    public Transaccion[] getRegistroDeTransacciones() {
        return this.registroDeTransacciones;
    }

    protected boolean esCantidadValida(double cantidad) {
        return cantidad >= 0;
    }

    public boolean transferir(Cuenta destinoTransferencia, double cantidadATransferir) {
        destinoTransferencia.ingresarDinero(this.getSaldo() - this.retirarDinero(cantidadATransferir));
        return true;
    }

    private boolean guardarTransaccion(Transaccion t) {
        this.registroDeTransacciones[this.cantidadTransacciones] = t;
        this.cantidadTransacciones++;
        return true;
    }
}
