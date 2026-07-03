import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
//Forma de usar los array de manera simple para un login.
//        String[] usernames = new String[3];
//        String[] passwords = new String[3];
//
//        usernames[0] = "Eros";
//        passwords[0] = "1234";
//        usernames[1] = "Admin";
//        passwords[1] = "1234";
//        usernames[2] = "Pepe";
//        passwords[2] = "1234";
        //Esta forma de abajo es MUCHO mejor.
        String[] usernames = {"Eros", "Admin", "Pepe"};
        String[] passwords = {"1234","1234","1234"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username:");
        String u = scanner.next();

        System.out.println("Ingrese la contraseña:");
        String p = scanner.next();

        boolean isOk = false;

        for (int i = 0; i < usernames.length ; i++) {
            if ( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                isOk = true;
                break;
            }
        } if (isOk) {
            System.out.println("Login realizado con éxito, bienvenido.");
        } else {
            System.out.println("Usuario o contraseña incorrecto, vuelve a intentarlo.");
            System.out.println("Lo siento, requiere de autenticación.");
        }
    }
}
