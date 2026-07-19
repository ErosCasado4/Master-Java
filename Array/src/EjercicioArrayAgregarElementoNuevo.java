import java.util.Scanner;

public class EjercicioArrayAgregarElementoNuevo {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[a.length+1];

        Scanner s = new Scanner(System.in);

        int posicion, numero;
        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < a.length ; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Añada un nuevo numero.");
        numero = s.nextInt();
        System.out.println("Añade en que posicion quisieras añadirlo.");
        posicion = s.nextInt();

        int ultimo = a[a.length-1];
        for (int i = a.length - 2; i >= posicion; i--) {
                a[i+1] = a[i];
            }
        System.arraycopy(a,0,b,0,a.length);
        a = b;
        a[posicion] = numero;

        a[a.length -1] = ultimo;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " + i + " : " + a[i]);
        }

    }
}
