
package oop001a;

public class Cuenta {
    
   private double saldo;
   
   public Cuenta(double saldo) {
       this.setSaldo(saldo);
   }
   
   public Cuenta() {
       this(0.0);
   }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if( !esCantidadValida(saldo)) {
            throw new Error("Cantidad invalida");
        }
        this.saldo = saldo;
    }
   
    public void ingresarDinero(double cantidad) {
        if( !esCantidadValida(cantidad)) {
            throw new Error("Cantidad invalida");
        }
        
        saldo += cantidad;
    }
   
    public double retirarDinero(double cantidad) {
        if( !esCantidadValida(cantidad) || cantidad > this.getSaldo()) {
            throw new Error("Cantidad invalida");
        }
        
        this.setSaldo(this.getSaldo() - cantidad);
        
        return this.getSaldo();
       
    }
    
    private boolean esCantidadValida(double cantidad) {
        return cantidad >= 0;
    }
}
