# Consigna

El Pony Express fue un servicio de correo rápido que cruzaba Estados Unidos. Empezaba en St. Joseph (Misuri) y llegaba hasta Sacramento (California). Estuvo operativo desde abril de 1860 a noviembre de 1861. Los mensajes se llevaban a caballo a lo largo de praderas, planicies, desiertos y montañas. Redujo el tiempo que tardaba el correo en llegar desde el océano Atlántico al océano Pacífico a diez días.

## Cómo funcionaba
Habia una cierta cantidad de estaciones, donde cada jinete cambiaba su caballo por uno fresco, o se le pasaba la bolsa de correo a un relevo.

## El problema
Se te pide ayuda para implementar el siguiente método:

```java
    /**
     * @param distancias es la distancia en millas de una estación hasta la otra
     * @return la cantidad de caballos necesarios para enviar el correo desde un
     * extremo hasta el otro del recorrido
     */
     public int caballos(int[] distancias) { }
```
Nota: Cada caballo viaja tan lejos como puede, pero nunca lo hace más de 100 millas seguidas


### Algunos ejemplos
Los siguientes ejemplos pueden servirte para probar tu solución

```java
Assert.assertEquals(1, caballos(new int[] { 18, 15 }));
Assert.assertEquals(2, caballos(new int[] { 43, 23, 40, 13 }));
Assert.assertEquals(3, caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
Assert.assertEquals(3, caballos(new int[] { 51, 51, 51 }));
Assert.assertEquals(4, caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
```