package r002.inversiones.mensuales;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AlmacenPago {

    final private int FQ_CAPITALIZACION_PERIODO = 12;

    public AlmacenPago() {

    }

    /**
     * pre: los argumentos son numeros positivos post: muestra valor futuro al
     * finalizar cada periodo en una linea cada uno
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
//        double fvParcial = montoAInvertir;
        double[] valoresFuturos = this.obtenerValoresFuturos(montoAInvertir, interesAnual, cantidadPeriodos);
        for (int i = 0; i < valoresFuturos.length; i++) {
            System.out.println(this.formatearSalida(valoresFuturos[i]));
        }
//      
    }

    /**
     * pre: los argumentos son numeros positivos post: devuelve la cantidad de
     * meses minima para alcanzar vfDesesado
     *
     * @param montoAInvertir
     * @param interesAnual
     * @param vfDeseado
     * @return la cantidad de meses minima para alcanzar vfDesesado
     */
    // VF = valor futuro
    public double minimoMesesVF(double montoAInvertir, double interesAnual, double vfDeseado) {
        if (!esValorValido(interesAnual) || !esValorValido(montoAInvertir) || !esValorValido(vfDeseado)) {
            throw new Error("argumentos invalidos");
        }
        return this.calcularNumeroPeriodos(montoAInvertir, vfDeseado, interesAnual);
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

    protected double[] obtenerValoresFuturos(double montoAInvertir, double interesAnual, int cantidadPeriodos) {
        double[] valoresFuturos = new double[cantidadPeriodos];
        double fvParcial = montoAInvertir;
        for (int i = 0; i < cantidadPeriodos; i++) {
            fvParcial = this.calcularVF(fvParcial, interesAnual, 1, FQ_CAPITALIZACION_PERIODO);
            valoresFuturos[i] = fvParcial;
        }
        return valoresFuturos;
    }

    protected String formatearSalida(double numero) {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        String numeroFormateado = df.format(numero);
        return numeroFormateado;
    }

}
