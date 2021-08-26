package maquinasdecafe;


public abstract class MaquinaDeCafe {
    private int gramosDeCafe;
    private static final int GRAMOS_POR_CAFE = 10;
    private static final int CANTIDAD_INICIAL_DE_CAFE = 1000;
    
    public MaquinaDeCafe() {
        this.gramosDeCafe = CANTIDAD_INICIAL_DE_CAFE;
    }
    
    public VasoDeCafe servirCafe() {
        return new VasoDeCafe(true);
    }
}
