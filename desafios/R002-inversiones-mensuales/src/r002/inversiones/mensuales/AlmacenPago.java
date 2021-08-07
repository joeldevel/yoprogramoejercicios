package r002.inversiones.mensuales;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AlmacenPago {

    final private int FQ_CAPITALIZACION_PERIODO = 12; // frecuencia capitalizacion por periodo

    public AlmacenPago() {

    }

    /**
     *
     * pre: los argumentos son numeros positivos
     * post: muestra valor futuro al finalizar cada periodo en una linea cada uno
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
            fvParcial = calcularVF(fvParcial, interesAnual, 1, FQ_CAPITALIZACION_PERIODO);
//            String.format("%.5g%n", 0.912385);
            DecimalFormat df = new DecimalFormat("#.####");
            df.setRoundingMode(RoundingMode.CEILING);

            System.out.println(i + 1 + " " + df.format(fvParcial));
        }

    }

    /**
     * pre: los argumentos son numeros positivos 
     * @param montoAInvertir
     * @param interesAnual
     * @param vfDeseado
     * @return la cantidad de meses minima para alcanzar vfDesesado  
     */
    public double minimoMesesVF(double montoAInvertir, double interesAnual, double vfDeseado) {
        if (!esValorValido(interesAnual) || !esValorValido(montoAInvertir) || !esValorValido(vfDeseado)) {
            throw new Error("argumentos invalidos");
        }
        return calcularNumeroPeriodos(montoAInvertir, vfDeseado, interesAnual);
    }

    protected double calcularVF(double p, double i, int n, int fqC) {
        return p * Math.pow((1 + (i / fqC)), n * fqC);
    }

    protected double calcularNumeroPeriodos(double p, double vf, double i) {
        return Math.floor(Math.log(vf / p) / Math.log(1 + i)) * 12;
    }

    private boolean esValorValido(double x) {
        return x >= 0;
    }

}
