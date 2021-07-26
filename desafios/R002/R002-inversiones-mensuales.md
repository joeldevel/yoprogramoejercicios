# Consigna

AlmacenPago esta lanzando un nuevo servicio de inversión, donde el porcentaje anual de inversión se calcula mes a mes sin necesidad de sacar el dinero. Por lo tanto si el rendimiento es de 12% anual, y decido invertir $10000, en un mes tendría $10100 (+1%) y en dos meses $10201 (+1% del mes anterior)

AlmacenPago te pide a ti armar un módulo para informar al usuario como crece su dinero en el tiempo. Este módulo debe contar con dos métodos


## Método 1
Este método se encargará de calcular la inversión y mostrar para cada uno de los siguientes años, el saldo al finalizar el mismo. Para ello se tienen los siguientes datos

* Monto a invertir
* Interés anual
* Cantidad de años máximo

### Ejemplo 1
Entrada:
```
    montoInverir = 1000
    interesAnual = 0.24
    cantidadAñosMaximo = 4
```

Salida:

```
    1268.2418
    1608.4372
    2039.8873
    2587.0703
```

### Ejemplo 2
Entrada:

```
    montoInverir = 1000
    interesAnual = 0.71355714
    cantidadAñosMaximo = 5
```

Salida:
```
    2000
    4000.0001
    8000.0002
    16000.0005
    32000.0012
```
## Método 2
El otro se encargará de calcular y mostrar cuanto tiempo (en meses) se necesita para superar cierto saldo en la inversión. Para ello se tienen los siguientes datos

* Monto a invertir
* Interés anual
* Mínimo saldo deseado

### Ejemplo 1
Entrada:
```
    montoInvertir = 1000
    interesAnual = 0.07
    saldoFinalDeseado = 2000
```
Salida:
``` 
    120
```

### Ejemplo 2
Entrada:

```
    montoInvertir = 1000
    interesAnual = 0.24
    saldoFinalDeseado = 2587
```

Salida:

```
    48
```