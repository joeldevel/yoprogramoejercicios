package vehiculos;

public class Motocicleta extends Vehiculo {

    Persona acompaniante;

    @Override
    public boolean asignarChofer(Chofer chofer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean agregarAcompaniante(Persona acompaniante) {
        if(!this.llevaAcompaniante()) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
