package vehiculos;

public class Autobus extends Vehiculo {

    public Autobus(String patente) {
        super(patente);
    }

    @Override
    public boolean cambiarChofer(Chofer chofer) {
        if (!this.hayPasajeros()) {
            this.asignarChofer(chofer);
            return true;
        }
        return false;
    }

    public void agregarPasajero(Persona pasajero) {
        if (this.contadorPasajeros < MAX_PASAJEROS) {
            pasajeros[contadorPasajeros] = pasajero;
            contadorPasajeros++;
        }
    }

    public boolean hayPasajeros() {
        return this.contadorPasajeros > 0;
    }

    public static final int MAX_PASAJEROS = 50;
    private Persona[] pasajeros = new Persona[MAX_PASAJEROS];
    private int contadorPasajeros = 0;
}
