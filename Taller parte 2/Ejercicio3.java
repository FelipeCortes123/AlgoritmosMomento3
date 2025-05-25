import java.util.Scanner;

public class Ejercicio3 {

    // Método principal para validar el formato de una cédula
    public static boolean esFormatoCedulaValido(String numeroCedula) {
        // Verifica longitud exacta
        if (numeroCedula.length() != 10) {
            return false;
        }

        // Verifica que no empiece con '0'
        if (numeroCedula.charAt(0) == '0') {
            return false;
        }

        // Verifica que todos los caracteres sean dígitos
        for (int i = 0; i < numeroCedula.length(); i++) {
            if (!Character.isDigit(numeroCedula.charAt(i))) {
                return false;
            }
        }

        // Si pasa todas las validaciones
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        System.out.println("Sistema Validador de Formato de Cédulas");

        do {
            System.out.print("Ingrese el número de cédula a validar: ");
            String cedula = scanner.nextLine();

            if (esFormatoCedulaValido(cedula)) {
                System.out.println("Formato de Cédula VÁLIDO.");
            } else {
                System.out.println("Formato de Cédula INVÁLIDO.");
            }

            System.out.print("¿Desea validar otra cédula? (S/N): ");
            continuar = scanner.nextLine().trim().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("Gracias por usar el sistema.");
        scanner.close();
    }
}
