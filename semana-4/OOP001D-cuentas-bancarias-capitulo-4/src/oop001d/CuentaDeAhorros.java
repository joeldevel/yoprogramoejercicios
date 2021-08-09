package oop001d;

public class CuentaDeAhorros extends Cuenta {

    private double saldoAhorro;

    public CuentaDeAhorros() {
        super();
    }

    public CuentaDeAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    public void liberarSaldoAhorro() {
        this.setSaldo(this.getSaldo() + this.saldoAhorro);
        this.setSaldoAhorro(0);
    }

    public double getSaldoAhorro() {
        return this.saldoAhorro;
    }

    public void setSaldoAhorro(double saldoAhorro) {
        if (saldoAhorro <= this.getSaldo()) {
            this.saldoAhorro = saldoAhorro;
            this.setSaldo(this.retirarDinero(saldoAhorro));
        }
    }
}
