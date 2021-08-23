package vehiculos;

public class Autobus extends Vehiculo{
    
    @Override
    public boolean asignarChofer(Chofer chofer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static final int MAX_PASAJEROS = 50;
    private Persona[] pasajeros = new Persona[MAX_PASAJEROS];

    @Override
    public boolean cambiarChofer(Chofer chofer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
