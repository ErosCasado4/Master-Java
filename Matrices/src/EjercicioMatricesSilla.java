import java.util.Scanner;

public class EjercicioMatricesSilla {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa el tamaño de n. n determinará el tamaño de la matriz: ");
        int n = s.nextInt();

        if (n == 0){
            System.out.println("ERROR.");
            System.exit(1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n/2 || ( (i >= n/2) && (j == n-1) )) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
