import java.util.Scanner;

public class NaveHiperEspacio {

    /**
     * Método principal que inicia la aplicación.
     * TODO: Llamar al método menu para iniciar la interacción con el usuario.
     */
    public static void main(String[] args) {
        // TODO: Invocar menu();
    }

    /**
     * Menú principal con un do-while para manejar las opciones del usuario.
     * TODO: Incluir el ciclo do-while y las llamadas a mostrarMenu y ejecutarOpcion.
     */
    public static void menu() {
        // TODO: Implementar ciclo do-while, leer opción y llamar a ejecutarOpcion.
    }

    /**
     * Imprime el menú principal.
     * TODO: Mostrar las opciones disponibles para el usuario.
     */
    public static void mostrarMenu() {
        // TODO: Mostrar opciones: 1. Suma, 2. Resta, 3. Multiplicación, 4. Inversa, 5. División, 6. Salir.
    }

    /**
     * Ejecuta la opción elegida llamando al método específico para cada operación.
     * TODO: Evaluar la opción ingresada y redirigir a la operación correspondiente.
     */
    public static void ejecutarOpcion(int opcion, Scanner sc) {
        // TODO: Implementar switch-case para cada opción (1 a 6).
    }

    /**
     * Realiza la operación de suma de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, sumar elemento a elemento e imprimir el resultado.
     */
    public static void operacionSuma(Scanner sc) {
        // TODO: Invocar leerMatriz para ambas matrices, sumar y llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de resta de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, restar elemento a elemento e imprimir el resultado.
     */
    public static void operacionResta(Scanner sc) {
        // TODO: Invocar leerMatriz para ambas matrices, restar y llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de multiplicación de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, multiplicarlas utilizando la suma de productos y mostrar el resultado.
     */
    public static void operacionMultiplicacion(Scanner sc) {
        // TODO: Invocar leerMatriz para ambas matrices, multiplicar y llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de cálculo de la inversa de una matriz 2x2.
     * TODO: Leer una matriz 2x2, calcular su determinante, verificar invertibilidad y mostrar la inversa.
     */
    public static void operacionInversa(Scanner sc) {
        // TODO: Invocar leerMatriz, calcular determinante, verificar y calcular la inversa, luego llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de división de matrices resolviendo A * X = B.
     * TODO: Leer la matriz A, verificar que sea invertible, calcular su inversa, leer la matriz B y mostrar el resultado de A^-1 * B.
     */
    public static void operacionDivision(Scanner sc) {
        // TODO: Invocar leerMatriz para A y B, calcular inversa de A, multiplicar por B y llamar a imprimirMatriz.
    }

    /**
     * Lee una matriz 2x2 desde la entrada estándar.
     * TODO: Solicitar al usuario cada elemento de la matriz especificada y retornar la matriz.
     */
    public static double[][] leerMatriz(Scanner sc, String nombre) {
        // TODO: Implementar lectura de 2x2 elementos y retornar la matriz.
    }

    /**
     * Imprime una matriz 2x2 en formato sencillo.
     * TODO: Recorrer la matriz y mostrar cada uno de sus elementos.
     */
    public static void imprimirMatriz(double[][] matriz) {
        // TODO: Implementar impresión de cada elemento de la matriz.
    }

    /**
     * Calcula el determinante de una matriz 2x2.
     * TODO: Calcular y retornar el determinante utilizando la fórmula: ad - bc.
     */
    public static double determinante(double[][] matriz) {
        // TODO: Implementar el cálculo del determinante.
    }

    /**
     * Suma dos matrices 2x2.
     * TODO: Sumar elemento a elemento y retornar la matriz resultante.
     */
    public static double[][] sumaMatrices(double[][] A, double[][] B) {
        // TODO: Implementar la suma de dos matrices.
    }

    /**
     * Resta dos matrices 2x2.
     * TODO: Restar elemento a elemento y retornar la matriz resultante.
     */
    public static double[][] restaMatrices(double[][] A, double[][] B) {
        // TODO: Implementar la resta de dos matrices.
    }

    /**
     * Multiplica dos matrices 2x2.
     * TODO: Calcular la suma de productos correspondiente a cada elemento y retornar la matriz resultante.
     */
    public static double[][] multiplicacionMatrices(double[][] A, double[][] B) {
        // TODO: Implementar la multiplicación de dos matrices.
    }

    /**
     * Calcula la inversa de una matriz 2x2.
     * TODO: Calcular el determinante; si es 0 retornar null, de lo contrario calcular y retornar la inversa.
     */
    public static double[][] inversaMatriz(double[][] A) {
        // TODO: Implementar el cálculo de la inversa de una matriz.
    }

    /**
     * Resuelve la ecuación A * X = B para X, usando la inversa de A.
     * TODO: Si A no es invertible, retornar null; de lo contrario, multiplicar A^-1 por B y retornar el resultado.
     */
    public static double[][] divisionMatrices(double[][] A, double[][] B) {
        // TODO: Implementar la división de matrices (A^-1 * B).
    }
}