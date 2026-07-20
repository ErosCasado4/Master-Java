import java.util.Scanner;

public class EjercicioArrayHistorigrama {
    public static void main(String[] args) {

        int[] numeros = new int[12];

        Scanner s = new Scanner(System.in);
        /*
        Como este es el que mas me ha costado de entender por el momento, me hago la explicacion para mi.
        Buscamos ingresar 12 numeros entre 1 y 6. No los he limitado por gusto personal. Tras guardar los numeros en el Array,
        procedemos a iterar con 3 for. El exterior esta limtiado a 6 iteraciones. Inicializamos contador, para que en cada vuelta se reinicie. Sin embargo, el segundo
        for itera sobre el array y compara, si i es igual a numeros[j] suma contador. El tercer for itera sobre contador. Servirá para que de esta forma imprima a cada vuelta el valor
        de i(1, 2, 3...) con la cantidad de veces que el contador se activa. Se imprime contador con *.
         */

        System.out.println("Ingrese 12 numeros con valores que no superen los rangos entre 1 y 6.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un numero: ");
            numeros[i] = s.nextInt();
        }

        for (int i = 1; i <= 6; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (i == numeros[j]) {
                    contador++;
                }
            }
            System.out.print(i + ": ");
            for (int k = 0; k < contador; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
