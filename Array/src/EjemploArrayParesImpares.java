import java.util.Scanner;

public class EjemploArrayParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        a = new int[10];

        int par = 0;
        int impar = 0;
        Scanner s  =new Scanner(System.in);

        System.out.println("Ingresa 10 numeros.");
        for (int i = 0; i < a.length ; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }

        pares = new int[par];
        impares = new int[impar];

        int j = 0, k = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0){
                    pares[j++] = a[i];
                } else {
                    impares[k++] = a[i];
                }
            }
            System.out.println("Pares");
            for (int i = 0; i < pares.length; i++) {
                System.out.print(pares[i] + " ");
        }
            System.out.println("\n\nImpares");
            for (int i = 0; i < impares.length; i++) {
                System.out.print(impares[i] + " ");
            }
            System.out.println();
    }
}
