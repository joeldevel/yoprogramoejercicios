package luchadores;

public class LuchadorSumo {

    private int peso;
    private int altura;

    public LuchadorSumo(int peso, int altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public int getPeso() {
        return this.peso;
    }

    public int getAltura() {
        return this.altura;
    }

    public boolean dominaA(LuchadorSumo oponente) {
        return this.getAltura() > oponente.getAltura() && this.getPeso() > oponente.getPeso()
                || this.getAltura() > oponente.getAltura() && this.getPeso() == oponente.getPeso()
                || this.getAltura() == oponente.getAltura() && this.getPeso() > oponente.getPeso();

    }

}
