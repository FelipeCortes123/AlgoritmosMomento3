public class Ejercicio1 {

    private static final int LONGITUD_MINIMA = 8;

    public static boolean esLongitudValida(String password) {
        return password.length() >= LONGITUD_MINIMA;
    }

    public static boolean contieneMayuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneMinuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneDigito(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean esContrasenaSegura(String password) {
        return esLongitudValida(password) &&
               contieneMayuscula(password) &&
               contieneMinuscula(password) &&
               contieneDigito(password);
    }

    public static void main(String[] args) {
        String prueba1 = "clave123";
        String prueba2 = "ClaveSegura1";
        String prueba3 = "OTRAMAYUSCULA2";
        String prueba4 = "minúsculaY123";
        String prueba5 = "Corta1";
        String prueba6 = "SinNumeroMayus";

        System.out.println("'" + prueba1 + "' es segura? " + esContrasenaSegura(prueba1));
        System.out.println("'" + prueba2 + "' es segura? " + esContrasenaSegura(prueba2));
        System.out.println("'" + prueba3 + "' es segura? " + esContrasenaSegura(prueba3));
        System.out.println("'" + prueba4 + "' es segura? " + esContrasenaSegura(prueba4));
        System.out.println("'" + prueba5 + "' es segura? " + esContrasenaSegura(prueba5));
        System.out.println("'" + prueba6 + "' es segura? " + esContrasenaSegura(prueba6));
    }
}
