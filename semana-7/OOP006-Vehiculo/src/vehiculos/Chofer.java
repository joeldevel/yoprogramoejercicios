
package vehiculos;


class Chofer extends Persona{

    private int idCarnet;
    
    Chofer(String nombre, int idCarnet) {
        super(nombre);
        this.idCarnet = idCarnet;
    }
}
