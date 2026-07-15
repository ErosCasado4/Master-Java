import java.util.Arrays;

public class EjemploArray {
    public static void main(String[] args) {
        /*
        Arrays es la clase usada para trabajar con diferentes metodos en array, por ejemplo sort, para ordenar.
         */

        String[] productos = new String[7];
        productos[0] = "BMW Serie 1";
        productos[1] = "Toyota Corolla";
        productos[2] = "Mazda CX-10";
        productos[3] = "Renault Arkana";
        productos[4] = "Peugeot 508";
        productos[5] = "Audi RS3";
        productos[6] = "Volkswagen Golf GTI";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);


        int[] numeros = new int[4];

        numeros[0] = 1*5;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 3*10/5;
        numeros[3] = 4;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1]; // de esta forma obtenemos el ultimo elemento del array, ya que coje el valor de la cantidad de valores(4), y no del indice.

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
