package vehiculos;

public abstract class Vehiculo {

    Vehiculo(String patente) {
        this.patente = patente;
    }

    public void asignarChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public abstract boolean cambiarChofer(Chofer chofer);

    public Chofer getChofer() {
        return this.chofer;
    }

    public String getPatente() {
        return this.patente;
    }

    protected Chofer chofer;
    protected String patente;
}
