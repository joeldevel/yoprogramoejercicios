# Capítulo I: Estructuras de Datos

Una Cuenta posee un saldo. Se puede agregar dinero a la Cuenta, incrementando el saldo. También se puede retirar dinero de la Cuenta, decrementando dicho saldo.
Debe poderse resolver la siguiente secuencia de acciones:

1. Creación de una Cuenta nueva, saldo == 0.
2. Acreditación de $ 1000, saldo == 1000.
3. Retiro de $ 550, saldo == 450.

```
    // main
    Cuenta miCuenta = new Cuenta();
    System.out.println(miCuenta.saldo); // 0

    miCuenta.saldo += 1000;
    System.out.println(miCuenta.saldo); // 1000

    miCuenta.saldo -= 550;
    System.out.println(miCuenta.saldo); // 450
```

### Preguntas para profundizar

* ¿Qué tipo de dato se utilizó para el saldo? ¿Es el más apropiado?
* ¿Qué visibilidad tiene el atributo saldo de la Cuenta? ¿Es correcto?
* Si extraigo más dinero del disponible en saldo, seguramente pueda hacerlo. ¿Está bien que así sea?
