package oop001e;

import java.util.Date;

public class Transaccion {

    private final String motivo;
    private final double monto;
    private final Date fecha;
    private final TipoTransaccion tipo;

    public Transaccion(String motivo, double monto, TipoTransaccion tipo, Date fecha) {
        this.motivo = motivo;
        this.monto = monto;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public double getMonto() {
        return this.monto;
    }

    public Date getFecha() {
        return this.fecha;
    }

}
