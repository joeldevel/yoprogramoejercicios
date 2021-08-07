package r002.inversiones.mensuales;

public class R002InversionesMensuales {

    public static void main(String[] args) {

        AlmacenPago almacen = new AlmacenPago();
        double montoInicial = 1000;
        double interesAnual = 0.24;
//        int frequenciaCapitalization = almacen.FQ_CAPITALIZACION_PERIODO;
        int cantidadPeriodos = 4;

        System.out.println("**** Metodo 1 ****");
        mostrarEjemploMetodo1(almacen, montoInicial, interesAnual, cantidadPeriodos);

        montoInicial = 1000;
        interesAnual = 0.71355714;
        cantidadPeriodos = 5;

        mostrarEjemploMetodo1(almacen, montoInicial, interesAnual, cantidadPeriodos);

        System.out.println("**** Metodo 2 ****");

        interesAnual = 0.07;
        double valorFuturo = 2000;

        mostrarEjemploMetodo2(almacen, montoInicial, interesAnual, valorFuturo);

        interesAnual = 0.24;
        valorFuturo = 2587;

        mostrarEjemploMetodo2(almacen, montoInicial, interesAnual, valorFuturo);
    }

    public static void mostrarEjemploMetodo2(AlmacenPago almacen, double p, double i, double vf) {
        System.out.printf("Dados: %n\tmonto inicial = %f%n\tinterés anual = %f%n\tvalor futuro = %f%n\tfrecuencia capitalización = %d%n",
                p, i, vf, almacen.FQ_CAPITALIZACION_PERIODO);
        System.out.println("Cantidad de meses: " + (int) almacen.minimoMesesVF(p, i, vf));
    }

    public static void mostrarEjemploMetodo1(AlmacenPago almacen, double p, double i, int n) {
        System.out.printf("Dados: %n\tmonto inicial = %f%n\tinterés anual = %f%n\taños = %d%n\tfrecuencia capitalización = %d%n",
                p, i, n, almacen.FQ_CAPITALIZACION_PERIODO);
        almacen.mostrarVF(p, i, n);
    }

}
