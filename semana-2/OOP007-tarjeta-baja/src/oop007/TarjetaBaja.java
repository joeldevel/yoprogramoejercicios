package oop007;

public class TarjetaBaja {

    /**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
        this.saldo = saldoInicial;
        this.viajesEnColectivo = 0;
        this.viajesEnSubte = 0;
    }

    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() {
        return this.saldo;
    }

    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) {
        this.saldo += monto;
    }

    /**
     * pre : saldo suficiente. post: utiliza 21.50 del saldo para un viaje en
     * colectivo.
     */
    public void pagarViajeEnColectivo() {
        this.pagarViaje(PrecioViaje.COLECTIVO.getPrecio());
        this.viajesEnColectivo = this.aumentarCantidadViaje(this.contarViajesEnColectivo());
    }

    /**
     * pre : saldo suficiente. post: utiliza 19.50 del saldo para un viaje en
     * subte.
     */
    public void pagarViajeEnSubte() {
        this.pagarViaje(PrecioViaje.SUBTE.getPrecio());
        this.viajesEnSubte = this.aumentarCantidadViaje(this.contarViajesEnSubte());
    }

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
        return this.contarViajesEnColectivo() + this.contarViajesEnSubte();
    }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() {
        return this.viajesEnColectivo;
    }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() {
        return this.viajesEnSubte;
    }

    //    medotos auxiliares
    
    private void pagarViaje(double costoViaje) {
        if (this.hayDineroDisponible(costoViaje)) {
            this.setSaldo(this.obtenerSaldo() - costoViaje);
        } else {
            throw new Error("No hay saldo suficiente");
        }
    }

    private int aumentarCantidadViaje(int medioViaje) {
        return ++medioViaje;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private boolean hayDineroDisponible(double cantidad) {
        return this.saldo >= cantidad;
    }

    

    private double saldo;

    private int viajesEnSubte, viajesEnColectivo;
}

