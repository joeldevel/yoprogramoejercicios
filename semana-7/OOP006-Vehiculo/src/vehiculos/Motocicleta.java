package vehiculos;

public class Motocicleta extends Vehiculo {

    public Motocicleta(String patente) {
        super(patente);
    }

    public boolean agregarAcompaniante(Persona acompaniante) {
        if (!this.llevaAcompaniante()) {
            this.acompaniante = acompaniante;
            return true;
        }
        return false;
    }

    public boolean llevaAcompaniante() {
        return this.acompaniante != null;
    }

    @Override
    public boolean cambiarChofer(Chofer chofer) {
        if(!this.llevaAcompaniante()) {
            this.asignarChofer(chofer);
            return true;
        }
        return false;
    }

    Persona acompaniante;
}
