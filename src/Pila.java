public class Pila {
    private Nodo tope;

    public Pila() {
        tope = null;
    }

    public void push(Pizza pizza) {
        Nodo nuevoNodo = new Nodo(pizza);
        nuevoNodo.siguienteNodo = tope;
        tope = nuevoNodo;
    }

    public Pizza pop() {
        if (isEmpty()) {
            return null;
        }
        
        Pizza pizza = tope.pizza;
        tope = tope.siguienteNodo;

        return pizza;
    }

    public Pizza peek() {
        if (isEmpty()) {
            return null;
        }

        return tope.pizza;
    }

    public boolean isEmpty() {
        return tope == null;
    }
}
