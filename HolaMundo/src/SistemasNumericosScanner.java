import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un valor entero, por favor: ");
        //String numeroStr = scanner.nextLine();
        int numDecimal = 0;
        try {
            numDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){ //Tambien podemos capturar la excepcion con Excepction solamente
            System.out.println("Error, debe de ingresar un número entero. Vuelva a intentarlo, por favor.");
            main(args);
            System.exit(0);
        }
        System.out.println("numDecimal = " + numDecimal);
        String resBinario = "numero binario de " + numDecimal + " = " + Integer.toBinaryString(numDecimal);
        String resOctal = "numero octal de " + numDecimal + " = " + Integer.toOctalString(numDecimal);
        String resHexadecimal = "numero hexadecimal de " + numDecimal + " = " + Integer.toHexString(numDecimal);

        String mensaje = resBinario;
        mensaje += "\n" + resOctal;
        mensaje += "\n" + resHexadecimal;
        System.out.println(mensaje);
    }
}
