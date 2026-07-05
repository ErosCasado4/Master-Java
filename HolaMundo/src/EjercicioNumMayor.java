import java.util.Scanner;

public class EjercicioNumMayor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un numero.");
        int n1 = s.nextInt();

        System.out.println("Ingrese un numero.");
        int n2 = s.nextInt();

        String max = (n1 > n2) ? "Numero mayor: " + n1 + ". Luego, : " + n2: "Numero mayor: " + n2 + ". Luego, : " + n1;
        System.out.println(max);
    }
}
