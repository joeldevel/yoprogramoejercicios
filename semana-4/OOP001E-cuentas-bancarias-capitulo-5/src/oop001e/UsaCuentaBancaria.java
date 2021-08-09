package oop001e;

public class UsaCuentaBancaria {

    public static void main(String[] args) {
        // main
    Cuenta miCuenta = new Cuenta();
    System.out.println(miCuenta.getSaldo()); // 0

    miCuenta.ingresarDinero(1000);
    System.out.println(miCuenta.getSaldo()); // 1000

    miCuenta.retirarDinero(550);
    System.out.println(miCuenta.getSaldo()); // 450
    }
    
}
