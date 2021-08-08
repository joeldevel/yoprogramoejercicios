# Introduciendo un poco de variabilidad

Nuestros primeros usuarios notaron que el juego era un poco aburrido ¡Tenemos que agregar variabilidad! Tengamos tres tipos de unidades: Los caballeros, que atacan entre 1 y 3 metros, y que ocasionan un daño de 30 puntos. Los arqueros, que atacan entre 5 y 25 metros, y ocasionan un daño de 7 puntos. Los soldados, que atacan a menos de 1.5 metros, y ocasionan un daño de 20 puntos.

 Esta vez mi asistente está un poco ocupada, pero creo que podrán generar los ejemplos ustedes mismos.

```java

    Caballero c1 = new Caballero(new Posicion(0, 10));
    Caballero c2 = new Caballero(new Posicion(5, 0));

    Arquero a1 = new Arquero(new Posicion(7, 0));

    Soldado s1 = new Soldado(new Posicion(4, 0));
    Soldado s2 = new Soldado(new Posicion(0, 0));

// tests
    assertTrue(s1.atacar(c2)); // true
    assertEquals(80, c2.getSalud(), 0); // -20;

    assertTrue(c2.atacar(s1)); //true
    assertEquals(70, s1.getSalud(), 0); // -30

    assertFalse(s1.atacar(a1)); // no llega 
    assertEquals(100, a1.getSalud(), 0); // igual que antes del ataque

    assertFalse(a1.atacar(s1)); // true
    assertEquals(70, s1.getSalud(), 0); 

    assertTrue(a1.atacar(c1)); // true
    assertEquals(93, c1.getSalud(), 0); // -7

    assertTrue(a1.atacar(s2)); // -7
    assertEquals(93, s2.getSalud(), 0);

```