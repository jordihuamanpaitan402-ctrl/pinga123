import java.util.InputMismatchException;
import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese sueldo 1: ");
            double sueldo1 = entrada.nextDouble();

            System.out.print("Ingrese sueldo 2: ");
            double sueldo2 = entrada.nextDouble();

            System.out.println(); // Salto de línea

            // Formateo simple a entero si no tiene decimales
            String s1 = (sueldo1 % 1 == 0) ? String.format("%.0f", sueldo1) : String.valueOf(sueldo1);
            String s2 = (sueldo2 % 1 == 0) ? String.format("%.0f", sueldo2) : String.valueOf(sueldo2);

            // Comparaciones relacionales
            System.out.printf("%s es mayor que %s: %b%n", s1, s2, sueldo1 > sueldo2);
            System.out.printf("%s es menor que %s: %b%n", s1, s2, sueldo1 < sueldo2);
            System.out.printf("%s es mayor o igual que %s: %b%n", s1, s2, sueldo1 >= sueldo2);
            System.out.printf("%s es menor o igual que %s: %b%n", s1, s2, sueldo1 <= sueldo2);
            System.out.printf("%s es igual a %s: %b%n", s1, s2, sueldo1 == sueldo2);
            System.out.printf("%s es diferente de %s: %b%n", s1, s2, sueldo1 != sueldo2);

            System.out.println(); // Salto de línea

            // Determinar quién gana más
            if (sueldo1 > sueldo2) {
                System.out.println("El practicante 1 gana más.");
            } else if (sueldo2 > sueldo1) {
                System.out.println("El practicante 2 gana más.");
            } else {
                System.out.println("Ambos practicantes ganan lo mismo.");
            }

            // Cálculo de la diferencia salarial
            double diferencia = Math.abs(sueldo1 - sueldo2);
            String difTexto = (diferencia % 1 == 0) ? String.format("%.0f", diferencia) : String.valueOf(diferencia);

            System.out.println("La diferencia salarial es: S/ " + difTexto);

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
        }
    }
}
