# Capítulo III: Abriendo el juego

Es común transferir dinero entre cuentas bancarias. Para ello, debemos dotar a nuestro modelo con dicha funcionalidad. Cuando querramos transferir un monto, deberá verificarse que la operación puede realizarse, y deberá acreditarse directamente en la cuenta destino. El código para dicha operación se verá similar a este:
```java
    // main
    Cuenta cuentaOrigen = new Cuenta();
    cuentaOrigen.depositar(10000);
    System.out.println(cuentaOrigen.consultarSaldo()); // 10000

    Cuenta cuentaDestino = new Cuenta();
    System.out.println(cuentaDestino.consultarSaldo()); // 0

    cuentaOrigen.transferir(550, cuentaDestino);
    System.out.println(cuentaOrigen.consultarSaldo()); // 9450
    System.out.println(cuentaDestino.consultarSaldo()); // 550

```
## Preguntas para profundizar

* Al interactuar con objetos del mismo tipo, es importante distinguir entre parámetros y atributos. ¿Cómo puede hacerse para evitar confusiones?
* ¿Es correcto el orden de los parámetros para el método transferir? ¿Qué cambiarías?
* Dentro del código de transferir, ¿utilizaste los métodos preexistentes o repetiste lógica que ya existía? ¿Cuál es la ventaja de cada una de las aproximaciones?
* ¿Qué pasaría la operación de transferir se ve interrumpida a la mitad de su ejecución? ¿Cómo se podría prevenir esto?