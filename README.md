# Pizza Track

## Objetivo
Desarrollar un sistema de consola que permita administrar pedidos de pizza de forma organizada y eficiente, utilizando programación orientada a objetos y estructura de datos. 

## Descripción

El programa permite registrar pizzas con nombre e ingredientes, deshacer el último pedido registrado y rehacer pedidos previamente deshechos. Los pedidos se almacenan internamente usando pilas para implementar el comportamiento de historial.

## Estructura del proyecto

El proyecto está conformado por las siguientes clases:
- `Main`: Clase principal con el menú de consola y la interacción con el usuario.
- `GestionPedidos`: Controla el registro de pedidos, la operación de deshacer/rehacer y muestra el pedido actual.
- `Pizza`: Modelo de una pizza con nombre e ingredientes.
- `Pila`: Implementación simple de una pila basada en nodos enlazados.
- `Nodo`: Nodo de la pila que contiene una `Pizza` y un puntero al siguiente nodo.
- `bin/`: Carpeta de salida donde se generan los archivos compilados.

## Funcionamiento
## - Inicio del programa
Al ejecutar el programa, el sistema muestra un menú con las opciones disponibles. 
<img width="1492" height="852" alt="image" src="https://github.com/user-attachments/assets/7b8b8675-bea2-4a98-96bc-a57034fcdc1c" />

### - Registro de pizza
Al seleccionar la opción 1 para registrar una nueva pizza, el sistema solicita:
Nombre de la pizza
Tres ingredientes
Luego, el pedido queda almacenado en la pila principal. 
<img width="1479" height="1013" alt="image" src="https://github.com/user-attachments/assets/2a792299-db12-4217-8bb7-b5c35eb75348" />

### - Deshacer pedido
La opción 2 elimina temporalmente el último pedido realizado y lo mueve a la pila secundaria. 
<img width="1491" height="829" alt="image" src="https://github.com/user-attachments/assets/acc38a10-c334-4e99-b7f8-6ddaaecc7908" />

### - Rehacer pedido
La opción 3 recupera el último pedido eliminado mediante la función deshacer. 
<img width="1476" height="835" alt="image" src="https://github.com/user-attachments/assets/0d349986-1105-44ae-9938-ff3ce88990ab" />

### - Mostrar pedido actual
La opción 4 permite visualizar el último pedido registrado en el sistema. 
<img width="1480" height="826" alt="image" src="https://github.com/user-attachments/assets/04cecf33-5491-4d30-b2d7-c16caec44371" />

### - Salida del sistema 
La opción 0 permite finalizar la ejecución del programa. 
<img width="1476" height="1015" alt="image" src="https://github.com/user-attachments/assets/d9e10f7b-36ce-429f-9382-32f6709fae91" />

## Explicación técnica 
El sistema utiliza una estructura de datos tipo pila para almacenar los pedidos. 
### Funcionamiento de la pila 
`push()` agrega un pedido.
`pop()` elimina el último pedido.
`peek()` muestra el pedido actual.
`isEmpty()` verifica si la pila está vacía.

El uso de dos pilas permite implementar las funciones:
Deshacer
Rehacer

## Pruebas realizadas
Registro de pizza </br>
Deshacer pedido </br>
Rehacer pedido </br>
Mostrar pedido actual </br>
Salir del sistema </br>

