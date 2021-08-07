package r002.inversiones.mensuales;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AlmacenPago {

    final private int c = 12; // frecuancia capitalizacion por periodo

    public AlmacenPago() {

    }

    /**
     *
     * pre: post:
     *
     * @param montoAInvertir double positivo
     * @param interesAnual double positivo
     * @param cantidadPeriodos integer positivo
     */
    // VF = valor futuro
    public void mostrarVF(double montoAInvertir, double interesAnual, int cantidadPeriodos) {
        if (!esValorValido(interesAnual) || !esValorValido(montoAInvertir) || !esValorValido(cantidadPeriodos)) {
            throw new Error("argumentos invalidos");
        }
        double fvParcial = montoAInvertir;
        for (int i = 0; i < cantidadPeriodos; i++) {
            fvParcial = calcularVFPeriodo(fvParcial, interesAnual, 1);
//            String.format("%.5g%n", 0.912385);
            DecimalFormat df = new DecimalFormat("#.####");
            df.setRoundingMode(RoundingMode.CEILING);

            System.out.println(i + 1 + " " + df.format(fvParcial));
        }

    }

    public double minimoMesesVF(double montoAInvertir, double interesAnual, double vfDeseado) {
        if (!esValorValido(interesAnual) || !esValorValido(montoAInvertir) || !esValorValido(vfDeseado)) {
            throw new Error("argumentos invalidos");
        }
        return calcularNumeroPeriodos(montoAInvertir, vfDeseado, interesAnual);
    }

    protected double calcularVFPeriodo(double p, double i, int n) {
        return p * Math.pow((1 + (i / c)), n * c);
    }

    protected double calcularNumeroPeriodos(double p, double vf, double i) {
        return Math.floor(Math.log(vf / p) / Math.log(1 + i)) * 12;
    }

//    public void calcularPrincipal() {
//
//    }
    private boolean esValorValido(double x) {
        return x >= 0;
    }

}
