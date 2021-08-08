package luchadores;

public class App {

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

        OrganizacionTorneo preTorneo = new OrganizacionTorneo();

        preTorneo.cargarLuchadores(luchadores);

        preTorneo.generarDominancia();
        preTorneo.mostrarTablaDominancia();

    }
}
