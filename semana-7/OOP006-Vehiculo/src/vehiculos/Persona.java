package vehiculos;

public abstract class Persona {

    private  String nombre;
    Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
}
