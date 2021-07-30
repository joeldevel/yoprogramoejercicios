package oop007;

public class OOP007TarjetaBaja {

    public static void main(String[] args) {
        TarjetaBaja t = new TarjetaBaja(100);

        System.out.println("**** Probando la tarjeta *****");

        System.out.println("cantidad de viajes: " + t.contarViajes());
        System.out.println("cantidad de viajes en colectivo: " + t.contarViajesEnColectivo());
        System.out.println("cantidad de viajes en subte: " + t.contarViajesEnSubte());
        System.out.println("Saldo: " + t.obtenerSaldo());
        System.out.println("~~~~");

        System.out.println("Pagar un viaje en colectivo, costo " + PrecioViaje.COLECTIVO.getPrecio());
        t.pagarViajeEnColectivo();
        System.out.println("Saldo: " + t.obtenerSaldo());
        System.out.println("cantidad de viajes: " + t.contarViajes());
        System.out.println("cantidad de viajes en colectivo: " + t.contarViajesEnColectivo());
        System.out.println("cantidad de viajes en subte: " + t.contarViajesEnSubte());
        System.out.println("~~~~");

        System.out.println("Pagar un viaje en subte, costo " + PrecioViaje.SUBTE.getPrecio());
        t.pagarViajeEnSubte();
        System.out.println("Saldo: " + t.obtenerSaldo());
        System.out.println("cantidad de viajes: " + t.contarViajes());
        System.out.println("cantidad de viajes en colectivo: " + t.contarViajesEnColectivo());
        System.out.println("cantidad de viajes en subte: " + t.contarViajesEnSubte());

        System.out.println("~~~~");
        System.out.println("cargar 523 patacones");
        t.cargar(523);
        System.out.println("Saldo: " + t.obtenerSaldo());

        System.out.println("**** Fin del programa ****");

    }

}
