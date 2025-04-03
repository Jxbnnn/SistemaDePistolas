import java.util.Scanner;  // Importamos la clase Scanner para leer datos del usuario

public class NaveHiperEspacio {

    public static void main(String[] args) {
        menu();  // Iniciamos el menú del programa
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);  // Creamos el Scanner para leer entrada del usuario
        int opcion;  // Variable para almacenar la opción elegida

        do {
            mostrarMenu();  // Mostramos el menú en pantalla
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();  // Leemos la opción ingresada por el usuario
            ejecutarOpcion(opcion, sc);  // Llamamos a la función que ejecuta la opción
        } while (opcion != 6);  // Repetimos el ciclo hasta que el usuario elija salir

        sc.close();  // Cerramos el Scanner para evitar fugas de memoria
    }

    public static void mostrarMenu() {
        System.out.println("\nMenú de Operaciones:");
        System.out.println("1. Suma de Matrices");
        System.out.println("2. Resta de Matrices");
        System.out.println("3. Multiplicación de Matrices");
        System.out.println("4. Inversa de una Matriz");
        System.out.println("5. División de Matrices");
        System.out.println("6. Salir");
    }

    public static void ejecutarOpcion(int opcion, Scanner sc) {
        switch (opcion) {
            case 1:
                operacionSuma(sc);
                break;
            case 2:
                operacionResta(sc);
                break;
            case 3:
                operacionMultiplicacion(sc);
                break;
            case 4:
                operacionInversa(sc);
                break;
            case 5:
                operacionDivision(sc);
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida, intente de nuevo.");
        }
    }

    public static void operacionSuma(Scanner sc) {
        System.out.println("SUMA DE MATRICES");
        double[][] A = leerMatriz(sc, "A");
        double[][] B = leerMatriz(sc, "B");
        double[][] C = sumaMatrices(A, B);
        imprimirMatriz(C);
    }

    public static void operacionResta(Scanner sc) {
        System.out.println("RESTA DE MATRICES");
        double[][] A = leerMatriz(sc, "A");
        double[][] B = leerMatriz(sc, "B");
        double[][] C = restaMatrices(A, B);
        imprimirMatriz(C);
    }

    public static void operacionMultiplicacion(Scanner sc) {
        System.out.println("MULTIPLICACIÓN DE MATRICES");
        double[][] A = leerMatriz(sc, "A");
        double[][] B = leerMatriz(sc, "B");
        double[][] C = multiplicacionMatrices(A, B);
        imprimirMatriz(C);
    }

    public static void operacionInversa(Scanner sc) {
        System.out.println("INVERSA DE UNA MATRIZ");
        double[][] A = leerMatriz(sc, "A");
        double[][] inversa = inversaMatriz(A);
        if (inversa == null) {
            System.out.println("La matriz no tiene inversa.");
        } else {
            imprimirMatriz(inversa);
        }
    }

    public static void operacionDivision(Scanner sc) {
        System.out.println("DIVISIÓN DE MATRICES");
        double[][] A = leerMatriz(sc, "A");
        double[][] B = leerMatriz(sc, "B");
        double[][] X = divisionMatrices(A, B);
        if (X == null) {
            System.out.println("No se puede realizar la división.");
        } else {
            imprimirMatriz(X);
        }
    }

    public static double[][] leerMatriz(Scanner sc, String nombre) {
        double[][] matriz = new double[2][2];
        System.out.println("Ingrese los valores de la matriz " + nombre + ":");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(double[][] matriz) {
        System.out.println("Resultado:");
        for (double[] fila : matriz) {
            for (double valor : fila) {
                System.out.printf("%8.2f ", valor);
            }
            System.out.println();
        }
    }

    public static double[][] sumaMatrices(double[][] A, double[][] B) {
        return new double[][] {
                {A[0][0] + B[0][0], A[0][1] + B[0][1]},
                {A[1][0] + B[1][0], A[1][1] + B[1][1]}
        };
    }

    public static double[][] restaMatrices(double[][] A, double[][] B) {
        return new double[][] {
                {A[0][0] - B[0][0], A[0][1] - B[0][1]},
                {A[1][0] - B[1][0], A[1][1] - B[1][1]}
        };
    }

    public static double[][] multiplicacionMatrices(double[][] A, double[][] B) {
        return new double[][] {
                {A[0][0] * B[0][0] + A[0][1] * B[1][0], A[0][0] * B[0][1] + A[0][1] * B[1][1]},
                {A[1][0] * B[0][0] + A[1][1] * B[1][0], A[1][0] * B[0][1] + A[1][1] * B[1][1]}
        };
    }

    public static double[][] inversaMatriz(double[][] A) {
        double det = A[0][0] * A[1][1] - A[0][1] * A[1][0];
        if (det == 0) return null;
        return new double[][] {
                {A[1][1] / det, -A[0][1] / det},
                {-A[1][0] / det, A[0][0] / det}
        };
    }

    public static double[][] divisionMatrices(double[][] A, double[][] B) {
        double[][] A_inv = inversaMatriz(A);
        if (A_inv == null) return null;
        return multiplicacionMatrices(A_inv, B);
    }
}
