public class SentenciaSwitchCase {
    public static void main(String[] args) {
        /*
        Muy util para casos determinados. Podemos escribir codigo dentro de cada case, evidentemente.
       Para evitar que ponga el resto de case ponemos break al final. El default como opcion que no tiene registros en case.
         */
        int num = 2;

        switch (num){
            case 0:
                System.out.println("Número 0.");
                break;
            case 1:
                System.out.println("Número 1.");
                break;
            case 2:
                System.out.println("Número 2.");
                break;
            case 3:
                System.out.println("Número 3.");
                break;
            default:
                System.out.println("Valor no reconocido en el registro.");
        }
        String name = "Peepe";
        switch (name){
            case "Eros":
                System.out.println("Bienvenido Eros.");
                break;
            case "Admin":
                System.out.println("Bienvenido Admin.");
                break;
            case "Pepe":
                System.out.println("Bienvenido Pepe.");
                break;
            case "Pedro":
                System.out.println("Bienvenido Pedro.");
                break;
            default:
                System.out.println("Usuario no reconocido.");
        }
    }
}
