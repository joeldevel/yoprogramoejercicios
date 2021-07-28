package b005;

public class SumaCifras {

    public static int sumarCifras(int numero) {
        int suma = 0;

        int cantidadCifras = obtenerCantidadCifras(numero);

        if (numero < 10) {
            return numero;
        }

        for (int i = 0; i < cantidadCifras; i++) {
            suma += numero / Math.pow(10, i) % 10;
        }

        return sumarCifras(suma);

    }

    public static int obtenerCantidadCifras(int numero) {
        int cantidadCifras = 0;
        while (numero != 0) {
            numero /= 10;
            cantidadCifras++;
        }
        return cantidadCifras;
    }

}
