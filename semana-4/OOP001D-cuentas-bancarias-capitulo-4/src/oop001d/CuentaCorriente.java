package oop001d;

public class CuentaCorriente extends Cuenta {

    private Cuenta descubierto;

    public CuentaCorriente(double saldoInicial, double descubierto) {
        super(saldoInicial);
        this.descubierto = new Cuenta(descubierto);
    }

}
