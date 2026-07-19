import java.util.Scanner;

public class EjercicioArrayOrdenesAlternos {
    public static void main(String[] args) {

        int[] num = new int[10];
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Escribe un numero: ");
            num[i] = s.nextInt();
        }

        int aux = 0;
        for (int i = 0; i < num.length - i; i++) {
            a[aux++] = num[i];
            a[aux++] = num[num.length-1-i];
        }
        System.out.println("Array ordenado en alternos(primero el primero, segundo el ultimo... y asi.");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " + i + " : " + a[i]);
        }
    }
}
