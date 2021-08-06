package r002.inversiones.mensuales;


public class AlmacenPago {
    final private int c = 12; // frecuancia capitalizacion por periodo
    public AlmacenPago() {
        
    }
    
    // VF = valor futuro
    public void mostrarVF(double montoAInvertir, double interesAnual, byte cantidadPeriodos) {
        
       
    }
    
    protected double calcularVFPeriodo(double p, double i, byte n) {
        return p * Math.pow( (1+ (i / c )), n * c );
    }
    
    public void calcularPrincipar() {
        
    }
}
