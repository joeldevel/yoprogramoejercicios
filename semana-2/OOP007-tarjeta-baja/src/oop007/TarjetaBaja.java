package oop007;

public class TarjetaBaja {

    private double saldo;
    
    

    /**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
        this.saldo = saldoInicial;
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
    }

    /**
     * pre : saldo suficiente. post: utiliza 19.50 del saldo para un viaje en
     * subte.
     */
    public void pagarViajeEnSubte() {
    }

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
        return 0;
    }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() {
        return 0;
    }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() {
        return 0;
    }
}
