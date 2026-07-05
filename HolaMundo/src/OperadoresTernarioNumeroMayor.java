import java.util.Scanner;

public class OperadoresTernarioNumeroMayor {
    public static void main(String[] args) {

     Scanner s = new Scanner(System.in);

     int max = 0;

        System.out.println("Ingrese un numero.");
        int n1 = s.nextInt();
        System.out.println("Ingrese un numero.");
        int n2 = s.nextInt();
        System.out.println("Ingrese un numero.");
        int n3 = s.nextInt();
        System.out.println("Ingrese un numero.");
        int n4 = s.nextInt();

        max = (n1 > n2)? n1: n2;
        max = (max > n3)? max: n3;
        max = (max > n4)? max: n4;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("El numero mayor es: " + max);
    }
}
