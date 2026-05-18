public class GestionPedidos {
    //Pila princial en la que se almacenan los pedidos activos.
    private Pila pilaPrincipal;
    //Pila secundaria que se utiliza para almacenar los pedidos deshechos, permitiendo rehacerlos posteriormente.
    private Pila pilaSecundaria;

    //Constructor de la clase GesrionPedidos.
    public GestionPedidos() {
        //Inicialización de las pilas.
        pilaPrincipal = new Pila();
        pilaSecundaria = new Pila();
    }

    //Método para registrar una nueva pizza.
    public void registrarPizza(Pizza pizza) {
        //Agrega una nueva pizza a la pila principal, representando un nuevo pedido.
        pilaPrincipal.push(pizza);
        System.out.println("Pizza registrada correctamente.");
    }

    //Método para deshacer el último pedido registrado.
    public void deshacer() {
        //Verifica si existen pedidos en la pila principal.
        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        //Elimina el nodo o la pizza que está en el tope de la pila principal.
        Pizza pizza = pilaPrincipal.pop();
        //El nodo o la pizza eliminada se agrega a la pila secundaria.
        pilaSecundaria.push(pizza);
        System.out.println("Pedido deshecho:");
        System.out.println(pizza);
    }

    // Método para recuperar un pedido eliminado.
    public void rehacer() {
        // Verifica si existen pedidos para recuperar.
        if (pilaSecundaria.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }
        
        // Elimina el nodo o la pizza que está en el tope de la pila secundaria.
        Pizza pizza = pilaSecundaria.pop();
        // El nodo o la pizza eliminada se agrega nuevamente a la pila principal.
        pilaPrincipal.push(pizza);
        System.out.println("Pedido recuperado:");
        System.out.println(pizza);
    }

    // Método para mostrar el pedido actual.
    public void mostrarPedidoActual() {
        // Verifica si existen pedidos activos.
        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos activos.");
            return;
        }
        System.out.println("Pedido actual:");
        //Permite ver el nodo o la pizza que está en el tope de la pila principal sin eliminarlo, mostrando el pedido actual.
        System.out.println(pilaPrincipal.peek());
    }
}
