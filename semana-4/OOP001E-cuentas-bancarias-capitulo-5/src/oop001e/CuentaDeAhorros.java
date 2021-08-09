package oop001e;

public class CuentaDeAhorros extends Cuenta {

    private Cuenta saldoAhorro;

    public CuentaDeAhorros() {
        super();
        this.saldoAhorro = new Cuenta();
    }

    public CuentaDeAhorros(double saldoInicial) {
        super(saldoInicial);
        this.saldoAhorro = new Cuenta();
    }

    public void liberarSaldoAhorro() {
        this.setSaldo(this.getSaldo() + this.saldoAhorro.getSaldo());
        this.saldoAhorro.setSaldo(0);
    }

    public double getSaldoAhorro() {
        return this.saldoAhorro.getSaldo();
    }

    public void setSaldoAhorro(double saldoAhorro) {
        if (saldoAhorro <= this.getSaldo()) {
            this.saldoAhorro.ingresarDinero(saldoAhorro);
            this.setSaldo(this.retirarDinero(saldoAhorro));
        }
    }
}
