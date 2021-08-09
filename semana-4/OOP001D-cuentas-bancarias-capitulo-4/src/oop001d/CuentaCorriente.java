package oop001d;

public class CuentaCorriente extends Cuenta{

    private double descubierto;
    
//    public CuentaCorriente() {
//        super();
//    }
    
    public CuentaCorriente(double saldoInicial, double descubierto) {
        super(saldoInicial);
        this.descubierto = descubierto;
    }
    
    
}
