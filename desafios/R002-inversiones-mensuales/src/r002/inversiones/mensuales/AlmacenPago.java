package r002.inversiones.mensuales;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AlmacenPago {

    final private int c = 12; // frecuancia capitalizacion por periodo

    public AlmacenPago() {

    }

    // VF = valor futuro
    public void mostrarVF(double montoAInvertir, double interesAnual, int cantidadPeriodos) {
        double fvParcial = montoAInvertir;
        for (int i = 0; i < cantidadPeriodos; i++) {
            fvParcial = calcularVFPeriodo(fvParcial, interesAnual, 1);
//            String.format("%.5g%n", 0.912385);
            DecimalFormat df = new DecimalFormat("#.####");
            df.setRoundingMode(RoundingMode.CEILING);
            
            System.out.println(i + 1 + " " +df.format(fvParcial));
        }

    }
    
    public double minimoMesesVF(double montoAInvertir, double interesAnual, double vfDeseado) {
        return calcularNumeroPeriodos(montoAInvertir, vfDeseado, interesAnual);
    }
    protected double calcularVFPeriodo(double p, double i, int n) {
        return p * Math.pow((1 + (i / c)), n * c);
    }
    
    protected double calcularNumeroPeriodos(double p, double vf, double i) {
        return  Math.floor(Math.log(vf/p) / Math.log(1 + i)) * 12;
    }

    public void calcularPrincipar() {

    }
}
