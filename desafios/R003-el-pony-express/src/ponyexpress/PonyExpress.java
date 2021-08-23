package ponyexpress;

public class PonyExpress {

    /**
     * @param distancias es la distancia en millas de una estación hasta la otra
     * @return la cantidad de caballos necesarios para enviar el correo desde un
     * extremo hasta el otro del recorrido
     */
    public static int caballos(int[] distancias) {
        if(distancias.length <= 0) return 0;
        int sumaDistancias = 0;
        int cantidadCaballos = 1;
        for (int i = 0; i < distancias.length; i++) {
            sumaDistancias += distancias[i];
            // los caballos no recorren mas de 100 millas
            if (sumaDistancias > 100) {
                // necesito un caballo adicional
                cantidadCaballos++;
                sumaDistancias = 0;
                // comienzo a sumar distancias desde el elemento actual
                i--;
            }
        }
        return cantidadCaballos;
    }
}
