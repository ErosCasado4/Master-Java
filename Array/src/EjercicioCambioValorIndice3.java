import java.util.Scanner;

public class EjercicioCambioValorIndice3 {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        int aux = 0;
        int elemento, posicion;
        System.out.println("Ingrese 6 numeros: ");
        for (int i = 0; i < a.length-1 ; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Nuevo elemento.");
        elemento = s.nextInt();
        posicion = 0;

        while (posicion < 6 && elemento > a[posicion]){
            posicion++;
        }

        for (int i = a.length - 2; i>= posicion; i--) {
                a[i+1] = a[i];
            }
        a[posicion] = elemento;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " + i + " : " + a[i]);
        }

    }
}
