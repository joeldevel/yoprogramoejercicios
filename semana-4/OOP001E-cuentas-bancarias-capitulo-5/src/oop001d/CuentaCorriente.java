package oop001d;

public class CuentaCorriente extends Cuenta {

    private Cuenta descubierto;

    public CuentaCorriente(double saldoInicial, double descubierto) {
        super(saldoInicial);
        this.descubierto = new Cuenta(descubierto);
    }

    public double getDescubierto() {
        return this.descubierto.getSaldo();
    }

    @Override
    public double retirarDinero(double cantidad) {
        if (!super.esCantidadValida(cantidad)
                || cantidad > this.getSaldo() + this.descubierto.getSaldo()) {
            throw new Error("Cantidad invalida");
        }
        double diff = this.getSaldo() - cantidad;
        
        if (diff < 0) { // quiero sacar mas de lo que hay
            this.descubierto.setSaldo(this.descubierto.getSaldo() + diff);
            this.setSaldo(0);
        } else {
            this.setSaldo(this.getSaldo() - cantidad);
        }

        return this.getSaldo();

    }
}
