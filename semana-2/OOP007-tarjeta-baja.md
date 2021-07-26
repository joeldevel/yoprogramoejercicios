# Implementar la clase TarjetaBaja a partir de la siguiente declaración:

```
    class TarjetaBaja {
         /**
         * post: saldo de la Tarjeta en saldoInicial.
         */
        public TarjetaBaja(double saldoInicial) { }
    
        /**
         * post: devuelve el saldo actual de la Tarjeta
         */
        public double obtenerSaldo() { }
    
         /**
         * post: agrega el monto al saldo de la Tarjeta.
         */
        public void cargar(double monto) { }
    
        /**
         * pre : saldo suficiente.
         * post: utiliza 21.50 del saldo para un viaje en colectivo.
         */
        public void pagarViajeEnColectivo() { }
    
        /**
         * pre : saldo suficiente.
         * post: utiliza 19.50 del saldo para un viaje en subte. 
         */
        public void pagarViajeEnSubte() { }
    
        /**
         * post: devuelve la cantidad de viajes realizados.
         */
        public int contarViajes() { }
    
        /**
         * post: devuelve la cantidad de viajes en colectivo.
         */
        public int contarViajesEnColectivo() { }
    
        /**
         * post: devuelve la cantidad de viajes en subte.
         */
        public int contarViajesEnSubte() { }
    }
```
