import java.util.Scanner;

public class EjercicioArrayNumRepetido {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int mayorOcurrencia = 0, numMasRepe = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros con valores que no superen los rangos entre 1 y 9.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un numero: ");
            numeros[i] = s.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }
            if(contador>mayorOcurrencia){
                mayorOcurrencia = contador;
                numMasRepe = numeros[i];
            }

            System.out.println(numeros[i] + " aparece " + contador + " veces");
        }
        System.out.println("Mayor ocurrencia: " + mayorOcurrencia);
        System.out.println("Numero que más se repite: " + numMasRepe);
    }
}
