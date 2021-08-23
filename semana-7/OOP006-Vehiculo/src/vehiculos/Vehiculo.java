package vehiculos;


public abstract class Vehiculo {

    protected Chofer chofer;
    public abstract boolean asignarChofer(Chofer chofer);
    public abstract boolean cambiarChofer(Chofer chofer);
    
}
