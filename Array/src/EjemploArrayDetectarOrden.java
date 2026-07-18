import java.util.Scanner;

public class EjemploArrayDetectarOrden {

    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros.");
        for (int i = 0; i < a.length ; i++) {
            a[i] = s.nextInt();
        }
        boolean descendente = false;
        boolean ascendente = false;

        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i + 1]){
                descendente = true;
            }
            if(a[i] < a[i + 1]){
                ascendente = true;
            }
        }
        if (ascendente == true && descendente == false){
            System.out.println("Array = ascendente.");
        }
        if (ascendente == false && descendente == true){
            System.out.println("Array = descendente.");
        }
        if (ascendente == true && descendente == true){
            System.out.println("Array = desordenado.");
        }
        if (ascendente == false && descendente == false){
            System.out.println("Array = todos iguales.");
        }
    }
}
