import java.util.InputMismatchException;
import java.util.Scanner;

public class Kilometros {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese kilómetros del conductor 1: ");
            int km1 = entrada.nextInt();

            System.out.print("Ingrese kilómetros del conductor 2: ");
            int km2 = entrada.nextInt();

            System.out.println(); // Salto de línea

            // Comparaciones relacionales
            System.out.printf("%d es mayor que %d: %b%n", km1, km2, km1 > km2);
            System.out.printf("%d es menor que %d: %b%n", km1, km2, km1 < km2);
            System.out.printf("%d es mayor o igual que %d: %b%n", km1, km2, km1 >= km2);
            System.out.printf("%d es menor o igual que %d: %b%n", km1, km2, km1 <= km2);
            System.out.printf("%d es igual a %d: %b%n", km1, km2, km1 == km2);
            System.out.printf("%d es diferente de %d: %b%n", km1, km2, km1 != km2);

            System.out.println(); // Salto de línea

            // Determinar qué conductor recorrió más kilómetros
            if (km1 > km2) {
                System.out.println("El conductor 1 recorrió más kilómetros.");
            } else if (km2 > km1) {
                System.out.println("El conductor 2 recorrió más kilómetros.");
            } else {
                System.out.println("Ambos conductores recorrieron la misma cantidad de kilómetros.");
            }

            // Cálculo de la diferencia
            int diferencia = Math.abs(km1 - km2);
            System.out.println("Diferencia: " + diferencia + " km.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido para los kilómetros.");
        }
    }
}
