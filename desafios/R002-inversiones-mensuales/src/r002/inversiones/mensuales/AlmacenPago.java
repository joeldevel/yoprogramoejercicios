package r002.inversiones.mensuales;


public class AlmacenPago {
    final private int c = 12; // frecuancia capitalizacion por periodo
    public AlmacenPago() {
        
    }
    
    // VF = valor futuro
    public void mostrarVF(double montoAInvertir, double interesAnual, int cantidadPeriodos) {
        double fvParcial = montoAInvertir;
        for(int i =0; i< cantidadPeriodos; i++) {
            fvParcial = calcularVFPeriodo(fvParcial, interesAnual, 1);
            System.out.println(i+1 + " " + fvParcial);
        }
       
    }
    
    protected double calcularVFPeriodo(double p, double i, int n) {
        return p * Math.pow( (1+ (i / c )), n * c );
    }
    
    public void calcularPrincipar() {
        
    }
}
