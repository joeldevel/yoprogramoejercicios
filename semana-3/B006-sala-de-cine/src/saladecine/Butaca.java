package saladecine;

public class Butaca {
    private boolean ocupada = false;
    
    public boolean ocupar() {
        this.ocupada = true;
        return true;
    }
    
    public boolean desocupar() {
        this.ocupada = false;
        return true;
    }
    
    public boolean estaOcupada() {
        return this.ocupada;
    }
    
    
}
