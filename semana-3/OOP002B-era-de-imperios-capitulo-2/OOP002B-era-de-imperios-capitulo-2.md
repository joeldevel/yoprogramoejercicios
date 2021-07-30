# Si entre ellos se pelean…

¡Genial! Ahora podemos avanzar al siguiente nivel. Las unidades sólo podrán atacarse si están a menos de 2 metros de distancia. En ese caso, cada golpe restará 10 puntos de salud a la otra. Hagamos una prueba de concepto de este primer modelo jugable.

```java

Unidad u1 = new Unidad(new Posicion(0, 0));
Unidad u2 = new Unidad(new Posicion(1, 1));
Unidad u3 = new Unidad(new Posicion(2, 2));

Assert.assertEquals(100, u2.getSalud());
u1.atacar(u2);
Assert.assertEquals( 90, u2.getSalud());

Assert.assertEquals(100, u3.getSalud());
u1.atacar(u3);
Assert.assertEquals(100, u3.getSalud());
```