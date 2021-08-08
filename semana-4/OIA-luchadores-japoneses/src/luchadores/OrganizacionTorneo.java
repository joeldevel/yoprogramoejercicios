package luchadores;

public class OrganizacionTorneo {

    private LuchadorSumo[] luchadores;

    public OrganizacionTorneo() {
    
    }
    
    public void cargarLuchadores(LuchadorSumo[] luchadores) {
        this.luchadores = luchadores;
    }
    
    
    public static void main(String[] args) {
        LuchadorSumo[] luchadores = {
            new LuchadorSumo(300, 1500),
            new LuchadorSumo(320, 1500),
            new LuchadorSumo(299, 1580),
            new LuchadorSumo(330, 1690),
            new LuchadorSumo(330, 1540),
            new LuchadorSumo(339, 1500),
            new LuchadorSumo(298, 1700),
            new LuchadorSumo(344, 1570),
            new LuchadorSumo(276, 1678),
            new LuchadorSumo(289, 1499)
        };
        int[] arrayDominancia = new int[10];
        
        // Recorro el array de luchadores
        for (int i = 0; i < luchadores.length; i++) {
            // comparo con los elementos siguientes
            for (int j = i+1; j < luchadores.length; j++) {
                // compara quien domina a quien y guardo el dato
                if (luchadores[i].dominaA(luchadores[j])) {
                    arrayDominancia[i]++;
                }
                if(luchadores[j].dominaA(luchadores[i])) {
                    arrayDominancia[j]++;
                }
            }
        }
        
        for(int e: arrayDominancia) {
            System.out.println(e);
        }

    }

//    public  void generarDominancia() {
//        int contador = 0; // cantidad de dominados
//        for (int i = 0; i < luchadores.length; i++) {
//            for (int j = 0; j < luchadores.length; j++) {
//                if (luchadores[i].dominaA(luchadores[j])) {
//                    contador++;
//                }
//            }
//            System.out.println(contador);
//        }
//    }
}
