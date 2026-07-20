import java.util.Scanner;

public class EjercicioArrayNumMasAlto {
    public static void main(String[] args) {

        int[] num = new int[7];
        Scanner s = new Scanner(System.in);
        int max = 0;

        System.out.println("Introduce 7 valores entre 11 y 99:");
        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if(max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("El valor mas alto es: " + max);
    }
}
