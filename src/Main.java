import java.util.Scanner;

public class PistolasImperio {
    private static final int MAX_PISTOLAS = 100;
    private static String[][] pistolas = new String[MAX_PISTOLAS][2]; // [ID, NombreSoldado]
    private static int totalPistolas = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    /**
     * Ejecuta el menú principal del programa y gestiona la interacción con el usuario.
     */
    public static void menu() {
        // TODO: Implementar el código para gestionar la interacción con el usuario.
    }

    /**
     * Muestra el menú principal con las opciones disponibles.
     */
    private static void mostrarOpciones() {
        // TODO: Implementar el código para mostrar las opciones del menú en pantalla.
    }

    /**
     * Obtiene y valida la opción ingresada por el usuario.
     * @return La opción seleccionada.
     */
    private static int obtenerOpcion() {
        // TODO: Implementar la lectura y validación de la opción ingresada.
    }

    /**Sistema de Gestion de Pistolas
     * Ejecuta la acción correspondiente según la opción seleccionada.
     * @param opcion Opción ingresada por el usuario.
     */
    private static void ejecutarOpcion(int opcion) {
        // TODO: Implementar la lógica para ejecutar la opción seleccionada.
    }

    /**
     * Agrega una nueva pistola al inventario, registrando su ID y el nombre del soldado.
     */
    private static void agregarPistola() {
        // TODO: Implementar la lógica para agregar una pistola al inventario.
    }

    /**
     * Elimina una pistola del inventario según su ID.
     */
    private static void eliminarPistola() {
        // TODO: Implementar la lógica para eliminar una pistola del inventario.
    }

    /**
     * Reorganiza el inventario después de eliminar una pistola, evitando espacios vacíos.
     * @param indice Índice de la pistola eliminada.
     */
    private static void reordenarInventario(int indice) {
        // TODO: Implementar la lógica para reorganizar el inventario después de una eliminación.
    }

    /**
     * Muestra en pantalla todas las pistolas registradas en el inventario.
     */
    private static void listarPistolas() {
        // TODO: Implementar la lógica para listar todas las pistolas registradas.
    }

    public static int getTotalPistolas() {
        return totalPistolas;
    }

    public static void setTotalPistolas(int totalPistolas) {
        PistolasImperio.totalPistolas = totalPistolas;
    }

    public static String[][] getPistolas() {
        return pistolas;
    }

    public static void setPistolas(String[][] pistolas) {
        PistolasImperio.pistolas = pistolas;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        PistolasImperio.scanner = scanner;
    }
}