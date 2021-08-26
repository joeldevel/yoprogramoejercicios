package maquinasdecafe;

public class MaquinaEconomica extends MaquinaDeCafe {

    private int contadorDeServidos = 0;

    @Override
    public void restarCafe() {
        this.contadorDeServidos++;
        if (contadorDeServidos % 3 == 0) {
            super.restarCafe();
            this.contadorDeServidos = 0;
        }
    }
}
