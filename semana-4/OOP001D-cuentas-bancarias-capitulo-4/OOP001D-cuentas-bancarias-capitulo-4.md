# Capítulo IV: Se agranda la familia

Esta vez necesitamos modelar dos nuevos tipos de cuenta:

```java    CuentaDeAhorros```, que permite reservar parte del saldo para que no esté disponible, en una especie de saldo secundario. Se puede disponer de ese saldo normalmente una vez que se reintegre (a pedido del cliente) al saldo total de la cuenta.

```java    CuentaCorriente```, que permite retirar todo lo disponible, y un descubierto de hasta cierta cantidad de dinero extra. El monto “en descubierto” se establece al momento de la apertura de la cuenta.