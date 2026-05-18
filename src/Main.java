import java.util.Scanner;

public class Main {
    //Método principal para ejecutar el programa.
    public static void main(String[] args) {
        //Objeto Scanner para leer los datos ingresados por el usuario.
        Scanner scanner = new Scanner(System.in);

        //Objeto encargado de gestionar los pedidos de pizza.
        GestionPedidos gestion = new GestionPedidos();

        //Variable para almacenar la opción seleccionada por el usuario.
        int opcion;

        //Ciclo que mantiene el menú activo hasta que el usuario decida salir.
        do {
            //Menú de opciones para el usuario.
            System.out.println("\n===== PIZZA TRACK =====");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            //Lee la opción ingresada por el usuario.
            opcion = scanner.nextInt();
            //Limpia el salto de línea después de leer el número.
            scanner.nextLine();

            //Estructura de control para ejecutar la acción correspondiente según la opción seleccionada.
            switch (opcion) {
                //Registrar una nueva pizza en el pedido.
                case 1:
                    System.out.print("Nombre de la pizza: ");
                    String nombre = scanner.nextLine();
                    //Arreglo para almacenar los ingredientes 3 de la pizza.
                    String[] ingredientes = new String[3];

                    //Ciclo para ingresar los ingredientes de la pizza.
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Ingrediente " + (i + 1) + ": ");
                        //Guarda cada ingrediente ingresado por el usuario en el arreglo.
                        ingredientes[i] = scanner.nextLine();
                    }

                    //Crea un nuevo objeto Pizza con el nombre y los ingredientes ingresados, y lo registra en la gestión de pedidos.
                    Pizza pizza = new Pizza(nombre, ingredientes);
                    //Registra la pizza en el sistema de gestión de pedidos.
                    gestion.registrarPizza(pizza);

                    break;

                //Deshace el último pedido.
                case 2:
                    gestion.deshacer();
                    break;

                //Rehace el último pedido deshecho.
                case 3:
                    gestion.rehacer();
                    break;

                //Mostrar el pedido actual.
                case 4:
                    gestion.mostrarPedidoActual();
                    break;

                //Salir del sistema.
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                //Opción inválida.
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        //Cierra el objeto Scanner para liberar recursos.
        scanner.close();
    }
}
