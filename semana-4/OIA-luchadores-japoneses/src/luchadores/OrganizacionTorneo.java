package luchadores;

public class OrganizacionTorneo {

    private LuchadorSumo[] luchadores;

    public OrganizacionTorneo() {

    }

    public void cargarLuchadores(LuchadorSumo[] luchadores) {
        this.luchadores = luchadores;
    }

    private int[] arrayDominancia = new int[10];

    public int[] generarDominancia() {
        // Recorro el array de luchadores
        for (int i = 0; i < this.luchadores.length; i++) {
            // comparo con los elementos siguientes
            for (int j = i + 1; j < this.luchadores.length; j++) {
                // compara quien domina a quien y guardo el dato
                if (luchadores[i].dominaA(luchadores[j])) {
                    this.arrayDominancia[i]++;
                }
                if (luchadores[j].dominaA(luchadores[i])) {
                    this.arrayDominancia[j]++;
                }
            }
        }
        return this.arrayDominancia;
    }

    public void mostrarTablaDominancia() {
        for (int e : arrayDominancia) {
            System.out.println(e);
        }
    }

}
