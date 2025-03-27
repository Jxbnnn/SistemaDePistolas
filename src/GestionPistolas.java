import java.util.Scanner;

public class GestionPistolas {
    private static final int MAX_PISTOLAS = 100;
    private static String[][] pistolas = new String[MAX_PISTOLAS][2]; // [ID, NombreSoldado]
    private static int totalPistolas = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 5);
    }

    private static void mostrarOpciones() {
        System.out.println("\n--- Inventario de Pistolas ---");
        System.out.println("1. Agregar pistola");
        System.out.println("2. Eliminar pistola");
        System.out.println("3. Listar pistolas");
        System.out.println("4. Buscar pistola");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int obtenerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese un número válido: ");
            scanner.next(); // Descartar entrada inválida
        }
        return scanner.nextInt();
    }

    private static void ejecutarOpcion(int opcion) {
        scanner.nextLine();
        switch (opcion) {
            case 1 -> agregarPistola();
            case 2 -> eliminarPistola();
            case 3 -> listarPistolas();
            case 4 -> buscarPistola();
            case 5 -> System.out.println("Saliendo del sistema...");
            default -> System.out.println("Opción inválida, intente de nuevo.");
        }
    }

    private static void agregarPistola() {
        if (totalPistolas >= MAX_PISTOLAS) {
            System.out.println("El inventario está lleno.");
            return;
        }

        int id;
        while (true) {
            System.out.print("Ingrese el ID de la pistola (solo números): ");
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Por favor, ingrese un número válido para el ID.");
                scanner.next();
            }
        }

        System.out.print("Ingrese el nombre del soldado asignado: ");
        String nombre = scanner.nextLine();

        pistolas[totalPistolas][0] = String.valueOf(id); // Convertir el ID a String
        pistolas[totalPistolas][1] = nombre;
        totalPistolas++;

        System.out.println("Pistola registrada correctamente.");
    }


    private static void eliminarPistola() {
        System.out.print("Ingrese el ID de la pistola a eliminar: ");
        String id = scanner.nextLine();

        int indice = -1;
        for (int i = 0; i < totalPistolas; i++) {
            if (pistolas[i][0].equals(id)) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("Pistola no encontrada.");
            return;
        }

        reordenarInventario(indice);
        totalPistolas--;
        System.out.println("Pistola eliminada correctamente.");
    }

    private static void reordenarInventario(int indice) {
        for (int i = indice; i < totalPistolas - 1; i++) {
            pistolas[i][0] = pistolas[i + 1][0];
            pistolas[i][1] = pistolas[i + 1][1];
        }
        pistolas[totalPistolas - 1][0] = null;
        pistolas[totalPistolas - 1][1] = null;
    }

    private static void listarPistolas() {
        if (totalPistolas == 0) {
            System.out.println("No hay pistolas registradas.");
            return;
        }

        System.out.println("\n--- Inventario de Pistolas ---");
        for (int i = 0; i < totalPistolas; i++) {
            System.out.println("ID: " + pistolas[i][0] + " | Soldado: " + pistolas[i][1]);
        }
    }

    private static void buscarPistola() {
        System.out.print("Ingrese el ID o el nombre del soldado: ");
        String entrada = scanner.nextLine();
        boolean encontrada = false;

        for (int i = 0; i < totalPistolas; i++) {
            if (pistolas[i][0].equals(entrada) || pistolas[i][1].equalsIgnoreCase(entrada)) {
                System.out.println("ID: " + pistolas[i][0] + " | Soldado: " + pistolas[i][1]);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontró la pistola.");
        }
    }
}
