import java.util.Scanner;

public class EjercicioSentenciaNumeroMenorDiez {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int valorMin = numeros[0];

        Scanner s = new Scanner(System.in);

        System.out.println("Añade 10 numeros. Veamos cual es el número mas pequeño.");
        for (int num: numeros) {
            num = s.nextInt();
            if (num < 10){
                System.out.println("El número es menor que 10!");

            } else {
                System.out.println("El numero es igual o mayor que 10!");
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < valorMin){
                valorMin = numeros[i];
            }
        }
        System.out.println("el numero mas pequeño del array es: " + valorMin);
    }
}
