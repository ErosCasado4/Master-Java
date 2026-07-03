import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Eros";
        String pass = "1234";
        String username2 = "Admin";
        String pass2 = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username:");
        String u = scanner.next();

        System.out.println("Ingrese la contraseña:");
        String p = scanner.next();

        boolean isOk = false;

        if( (username.equals(u) && pass.equals(p)) || (username2.equals(u) && pass2.equals(p)) ) {
            isOk = true;
        } else {
            System.out.println("Usuario o contraseña incorrecto, vuelve a intentarlo.");
        } if (isOk) {
            System.out.println("Login realizado con éxito, bienvenido.");
        } else {
            System.out.println("Lo siento, requiere de autenticación.");
        }
    }
}
