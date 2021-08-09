package oop001e;

import java.util.Date;

public class Transaccion {

    private final String motivo;
    private final double monto;
    private final Date fecha;

    public Transaccion(String motivo, double monto, Date fecha) {
        this.motivo = motivo;
        this.monto = monto;
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
