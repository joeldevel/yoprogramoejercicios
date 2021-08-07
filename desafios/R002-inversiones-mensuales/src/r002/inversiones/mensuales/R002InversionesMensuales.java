package r002.inversiones.mensuales;

public class R002InversionesMensuales {

    public static void main(String[] args) {

        AlmacenPago almacen = new AlmacenPago();
        double montoInicial = 1000;
        double interesAnual = 0.24;
        int frequenciaCapitalization = almacen.FQ_CAPITALIZACION_PERIODO;
        int cantidadPeriodos = 4;

        mostrarDatos(almacen, montoInicial, interesAnual, cantidadPeriodos);

        montoInicial = 1000;
        interesAnual = 0.71355714;
        cantidadPeriodos = 5;

        mostrarDatos(almacen, montoInicial, interesAnual, cantidadPeriodos);

    }

    public static void mostrarDatos(AlmacenPago almacen, double p, double i, int n) {
        System.out.printf("Dados: %n\tmontoInicial = %f%n\tinteresAnual = %f%n\taños = %d%n",
                p, i, n);
        almacen.mostrarVF(p, i, n);
    }

}
