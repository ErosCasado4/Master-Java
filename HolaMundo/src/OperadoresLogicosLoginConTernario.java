import java.util.Scanner;

public class OperadoresLogicosLoginConTernario {
    public static void main(String[] args) {

        String[] usernames = {"Eros", "Admin", "Pepe"};
        String[] passwords = {"1234","12345","123456"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username:");
        String u = scanner.next();

        System.out.println("Ingrese la contraseña:");
        String p = scanner.next();

        boolean isOk = false;

        for (int i = 0; i < usernames.length ; i++) {
            isOk = (usernames[i].equals(u) && passwords[i].equals(p)) ? true: isOk;
            }

        String mensaje = isOk ? "Login realizado con éxito, bienvenido.".concat(u).concat("!") :
                "Usuario o contraseña incorrecto, vuelve a intentarlo.\nLo siento, requiere de autenticación.";
        System.out.println(mensaje);
    }
}
