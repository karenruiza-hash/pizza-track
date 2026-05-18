# Pizza Track

Pizza Track es una aplicación de consola en Java para gestionar pedidos de pizzas con soporte de deshacer y rehacer.

## Descripción

El programa permite registrar pizzas con nombre e ingredientes, deshacer el último pedido registrado y rehacer pedidos previamente deshechos. Los pedidos se almacenan internamente usando pilas para implementar el comportamiento de historial.

## Estructura del proyecto

- `src/Main.java`: Clase principal con el menú de consola y la interacción con el usuario.
- `src/GestionPedidos.java`: Controla el registro de pedidos, la operación de deshacer/rehacer y muestra el pedido actual.
- `src/Pizza.java`: Modelo de una pizza con nombre e ingredientes.
- `src/Pila.java`: Implementación simple de una pila basada en nodos enlazados.
- `src/Nodo.java`: Nodo de la pila que contiene una `Pizza` y un puntero al siguiente nodo.
- `bin/`: Carpeta de salida donde se generan los archivos compilados.

## Funcionamiento

El menú principal ofrece las siguientes opciones:

1. Registrar Pizza
2. Deshacer
3. Rehacer
4. Mostrar Pedido Actual
0. Salir

### Comportamiento

- `Registrar Pizza`: pide nombre e ingredientes de la pizza y añade el pedido a la pila principal.
- `Deshacer`: mueve la última pizza registrada de la pila principal a la pila secundaria.
- `Rehacer`: recupera la última pizza deshecha de la pila secundaria y la vuelve a la pila principal.
- `Mostrar Pedido Actual`: muestra la pizza que está actualmente en el tope de la pila principal.

## Cómo compilar y ejecutar

Desde la raíz del proyecto, se puede compilar usando `javac` y ejecutar con `java`:

```bash
javac -d bin src/*.java
java -cp bin Main
```

> Asegúrate de estar en la carpeta `pizza-track` antes de ejecutar estos comandos.

## Ejemplo de uso

1. Selecciona `1` para registrar una pizza.
2. Introduce un nombre y tres ingredientes.
3. Selecciona `4` para ver el pedido actual.
4. Selecciona `2` para deshacer el último pedido.
5. Selecciona `3` para rehacer el pedido deshecho.

## Consideraciones

- El programa asume que cada pizza tiene exactamente 3 ingredientes.
- Si no hay pedidos activos y se selecciona `Deshacer`, muestra un mensaje de error.
- Si no hay pedidos deshechos y se selecciona `Rehacer`, también muestra un mensaje de error.

## Mejora sugerida

Para extender la aplicación, se puede:

- permitir un número variable de ingredientes,
- agregar historial de todos los pedidos activos,
- guardar y cargar pedidos desde un archivo.
