# Sabiendo dónde están las cosas
Se desea construir un juego de estrategia por turnos, y para ellos el primer requisito que nos solicitan es el siguiente:

Es indispensable conocer dónde están ubicadas las unidades para poder llevar una buena interacción. Si bien el juego tiene una vista isométrica, sólamente vamos a utilizar dos dimensiones para ubicar a las unidades y edificios. Es por ello que nos alcanza con posición en el eje x, y posición en el eje y.

De todos modos, la ubicación de poco sirve: sólo la usaremos para dibujar, más adelante. Lo que realmente necesitamos es conocer la distancia que separa dos unidades. Seguramente mi asistente pueda darte un ejemplo.

```java
Unidad u1 = new Unidad(new Posicion(0, 0));
Unidad u2 = new Unidad(new Posicion(1, 1));
Assert.assertEquals(Math.sqrt(2), u1.distanciaCon(u2));
```