package saladecine;

public class Butaca {
    private boolean ocupada = false;
    
    public boolean ocupar() {
        if(this.estaOcupada()) return false;
        this.ocupada = true;
        return true;
    }
    
    public boolean desocupar() {
        if(!this.estaOcupada()) return false;
        this.ocupada = false;
        return true;
    }
    
    public boolean estaOcupada() {
        return this.ocupada;
    }
    
    
}
