# Introduciendo un poco de variabilidad

Nuestros primeros usuarios notaron que el juego era un poco aburrido ¡Tenemos que agregar variabilidad! Tengamos tres tipos de unidades: Los caballeros, que atacan entre 1 y 3 metros, y que ocasionan un daño de 30 puntos. Los arqueros, que atacan entre 5 y 25 metros, y ocasionan un daño de 7 puntos. Los soldados, que atacan a menos de 1.5 metros, y ocasionan un daño de 20 puntos.

 Esta vez mi asistente está un poco ocupada, pero creo que podrán generar los ejemplos ustedes mismos.

```java

Caballero c1 = new Caballero(new Posicion(10, 0));
Caballero c2 = new Caballero(new Posicion(0, 5));

Arquero a1 = new Arquero(new Posicion(7, 0));

Soldado s1 = new Soldado(new Posicion(4, 0));

s1.atacar(c2);
c2.getSalud(); // -20;

c2.atacar(s1);
s1.getSalud(); // -30

s1.atacar(a1); // no llega 
a1.getSalud(); // igual que antes del ataque

a1.atacar(s1);
s1.getSalud(); // -7

a1.atacar(c1);
c1.getSalud(); // -7

c1.atacar(a1); // -30


```