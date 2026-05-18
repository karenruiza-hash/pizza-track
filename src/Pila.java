public class Pila {
    //Puntero que referencia al nodo ubicado en el tope de la pila.
    private Nodo tope;

    //Constructor de la clase Pila.
    public Pila() {
        //La pila inicia sin ningún nodo, por eso el tope es null.
        tope = null;
    }

    //Método para agregar una pizza a la pila.
    public void push(Pizza pizza) {
        //Se crea un nuevo nodo con la pizza recibida.
        Nodo nuevoNodo = new Nodo(pizza);
        //El nuevo nodo apunta al nodo que actualmente está en el tope de la pila.
        nuevoNodo.siguienteNodo = tope;
        //El puntero tope ahora pasa a apuntar al nuevo nodo agregado.
        tope = nuevoNodo;
    }

    // Método para eliminar el elemento superior de la pila
    public Pizza pop() {
        // Verifica si la pila está vacía
        if (isEmpty()) {
            return null;
        }
        // Guarda la pizza almacenada en el nodo superior
        Pizza pizza = tope.pizza;
        //El puntero tope se actualiza al siguiente nodo, eliminando la referencia anterior.
        tope = tope.siguienteNodo;
        //Retorna la pizza que se ha eliminado de la pila.
        return pizza;
    }

    //M'etodo para consultar el elemento superior de la pila sin eliminarlo.
    public Pizza peek() {
        // Verifica si la pila está vacía
        if (isEmpty()) {
            return null;
        }
        // Retorna la pizza almacenada en el nodo superior.
        return tope.pizza;
    }
    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        // La pila está vacía si el puntero tope es null.
        return tope == null;
    }
}
