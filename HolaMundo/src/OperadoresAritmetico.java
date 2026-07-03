import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {
        //Podemos anexar varias variables en una misma linea siempre que sean del mismo tipo
        int i = 5, j= 4, suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("(i + j) = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        int div = i / j;
        float div2 = (float) i / j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = 0;
        try {
             numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        } catch (NumberFormatException e) {
            System.out.println("Error, el valor no es correcto. Vuelva a intentarlo, por favor.");
            main(args);
            System.exit(0);
        }
        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}
