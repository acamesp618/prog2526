package ejercicio5;
import java.io.Console;

public class Ejercicio5 {

    // Constantes
    private static final String USUARIO_CORRECTO = "admin";
    private static final String PASSWORD_CORRECTA = "1234";

    public static void main(String[] args) {

        Console console = System.console();

        // Comprobar si hay consola disponible
        if (console == null) {
            System.out.println("Debes ejecutar el programa desde la consola.");
            return;
        }

        int intentos = 3;
        boolean acceso = false;

        while (intentos > 0 && !acceso) {

            // Pedir datos
            String usuario = console.readLine("Usuario: ");

            char[] passwordArray = console.readPassword("Contraseña: ");

            String password = new String(passwordArray);

            // Comprobar credenciales
            if (usuario.equals(USUARIO_CORRECTO) && password.equals(PASSWORD_CORRECTA)) {
            	acceso = true;
                System.out.println("Acceso concedido.");

            } else {
                intentos--;
                System.out.println("Credenciales incorrectas.");

                if (intentos > 0) {
                    System.out.println(
                            "Te quedan " + intentos + " intentos.");
                }
            }
        }

        if (!acceso) {
            System.out.println("Acceso bloqueado.");
        }
    }
}