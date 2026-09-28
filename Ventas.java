import java.util.InputMismatchException;
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese ventas del vendedor 1: ");
            double ventas1 = entrada.nextDouble();

            System.out.print("Ingrese ventas del vendedor 2: ");
            double ventas2 = entrada.nextDouble();

            System.out.println(); // Salto de línea

            // Formateo para evitar decimales si el número es entero
            String v1 = (ventas1 % 1 == 0) ? String.format("%.0f", ventas1) : String.valueOf(ventas1);
            String v2 = (ventas2 % 1 == 0) ? String.format("%.0f", ventas2) : String.valueOf(ventas2);

            // Comparaciones relacionales
            System.out.printf("%s es mayor que %s: %b%n", v1, v2, ventas1 > ventas2);
            System.out.printf("%s es menor que %s: %b%n", v1, v2, ventas1 < ventas2);
            System.out.printf("%s es mayor o igual que %s: %b%n", v1, v2, ventas1 >= ventas2);
            System.out.printf("%s es menor o igual que %s: %b%n", v1, v2, ventas1 <= ventas2);
            System.out.printf("%s es igual a %s: %b%n", v1, v2, ventas1 == ventas2);
            System.out.printf("%s es diferente de %s: %b%n", v1, v2, ventas1 != ventas2);

            System.out.println(); // Salto de línea

            // Determinar cuál vendedor realizó más ventas
            if (ventas1 > ventas2) {
                System.out.println("El vendedor 1 realizó más ventas.");
            } else if (ventas2 > ventas1) {
                System.out.println("El vendedor 2 realizó más ventas.");
            } else {
                System.out.println("Ambos vendedores realizaron la misma cantidad de ventas.");
            }

            // Cálculo de la diferencia
            double diferencia = Math.abs(ventas1 - ventas2);
            String difTexto = (diferencia % 1 == 0) ? String.format("%.0f", diferencia) : String.valueOf(diferencia);

            System.out.println("La diferencia es: S/ " + difTexto);

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un monto numérico válido.");
        }
    }
}