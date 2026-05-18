public class Nodo {

    //Guarda  la información de una pizza dentro del nodo.
    Pizza pizza;

    //Referencia al siguiente nodo en la lista.
    Nodo siguienteNodo;

    //Constructor de la clase Nodo.
    public Nodo(Pizza pizza) {
        //Asigna la pizza recibida al nodo actual.
        this.pizza = pizza;
        //El nodo inicia sin conexión a otro nodo, por lo que se establece como null.
        this.siguienteNodo = null;
    }
}