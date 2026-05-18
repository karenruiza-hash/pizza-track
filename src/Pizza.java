public class Pizza {
    // Nombre de la pizza.
    private String nombre;
    // Arreglo de ingredientes de la pizza.
    private String[] ingredientes;

    //Constructor de la clase Pizza.
    public Pizza(String nombre, String[] ingredientes) {
        // Asigna el nombre recibido
        this.nombre = nombre;
         // Guarda el arreglo de ingredientes
        this.ingredientes = ingredientes;
    }
    // Método para obtener el nombre de la pizza.
    public String getNombre() {
        return nombre;
    }
    // Método para obtener el arreglo de ingredientes de la pizza.
    public String[] getIngredientes() {
        return ingredientes;
    }
    //Método que convierte el objeto Pizza a una representación en texto.
    @Override
    public String toString() {
        //Texto incial con el combre de la pizza.
        String texto = "Pizza: " + nombre + "\nIngredientes: ";

        //Recorre el arreglo de los ingredientes y los agrega al texto, separándolos por comas.
        for (int i = 0; i < ingredientes.length; i++) {
            // Agrega el ingrediente actual al texto.
            texto += ingredientes[i];
            // Si no es el último ingrediente, agrega una coma y un espacio.
            if (i < ingredientes.length - 1) {
                texto += ", ";
            }
        }
        // Devuelve la representación en texto de la pizza.
        return texto;
    }
}
