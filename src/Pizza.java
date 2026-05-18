public class Pizza {
    private String nombre;
    private String[] ingredientes;

    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        String texto = "Pizza: " + nombre + "\nIngredientes: ";

        for (int i = 0; i < ingredientes.length; i++) {
            texto += ingredientes[i];

            if (i < ingredientes.length - 1) {
                texto += ", ";
            }
        }

        return texto;
    }
}
