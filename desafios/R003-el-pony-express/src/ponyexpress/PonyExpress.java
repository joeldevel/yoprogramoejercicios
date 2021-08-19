package ponyexpress;

public class PonyExpress {

    /**
     * @param distancias es la distancia en millas de una estación hasta la otra
     * @return la cantidad de caballos necesarios para enviar el correo desde un
     * extremo hasta el otro del recorrido
     */
    public static int caballos(int[] distancias) {
        double sumaDistancias = 0;
        int cantidadCaballos = 1;
        for (int i = 0; i < distancias.length; i++) {
//            if(distancias[i] > 100) {
//                int d = distancias[i]; 
//                while( d > 100) {
//                    d -= 100;
//                    cantidadCaballos++;
//                }
//                continue;
//            }
            sumaDistancias += distancias[i];
            // los caballos no recorren mas de 100 millas
            if (sumaDistancias > 100) {
                // necesito un caballo adicional
                cantidadCaballos++;
                sumaDistancias = 0;
                // comienzo a sumar distancias desde el elemento anterior
                i--;
            }
        }
//        return (int)Math.ceil(sumaDistancias / 100 );
        return cantidadCaballos;
    }
}
