import java.util.Scanner;

public class EjercicioCambioValorIndice3b {
    public static void main(String[] args) {

        int[] a = new int[7];
        int[] b = new int[a.length+1];

        Scanner s = new Scanner(System.in);

        int numero, posicion, ultimo;
        System.out.println("Ingrese 7 numeros: ");
        for (int i = 0; i < a.length ; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Nuevo elemento.");
        numero = s.nextInt();
        ultimo =a[a.length - 1];
        posicion = 0;

        while (posicion < 6 && numero > a[posicion]){
            posicion++;
        }

        for (int i = a.length - 2; i>= posicion; i--) {
                a[i+1] = a[i];
            }
        System.arraycopy(a,0,b,0,a.length);

        if (numero > ultimo){
            b[b.length -1] = numero;
        } else {
            b[b.length -1] = ultimo;
            b[posicion] = numero;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("Posicion " + i + " : " + b[i]);
        }

    }
}
