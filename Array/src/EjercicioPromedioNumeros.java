import java.util.Scanner;

public class EjercicioPromedioNumeros {
    public static void main(String[] args) {

        int[] num = new int[7];
        int sumaPos = 0, sumaNeg = 0;
        double promPos = 0, promNeg = 0;
        int pos = 0, neg = 0, ceros = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Añade 7 numeros: ");
            num[i] = s.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0){
                sumaPos+=num[i];
                pos++;
                System.out.println("Numero positivo : " + num[i]);
            } else if (num[i] < 0){
                sumaNeg += num[i];
                neg++;
                System.out.println("Numero ngativo : " + num[i]);
            } else {
                ceros++;
            }
        }

        promPos = (double) sumaPos / pos;
        promNeg = (double) sumaNeg / neg;

        System.out.println("Promedio de positivos: " + promPos);
        System.out.println("Promedio de negativos: " + promNeg);
        System.out.println("Cantidad de ceros " + ceros);
    }
}
