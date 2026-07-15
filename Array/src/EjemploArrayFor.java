import java.util.Arrays;

public class EjemploArrayFor {
    public static void main(String[] args) {
        /*
        Arrays es la clase usada para trabajar con diferentes metodos en array, por ejemplo sort, para ordenar.
         */

        String[] productos = new String[7];
        int count = productos.length;
        productos[0] = "BMW Serie 1";
        productos[1] = "Toyota Corolla";
        productos[2] = "Mazda CX-10";
        productos[3] = "Renault Arkana";
        productos[4] = "Peugeot 508";
        productos[5] = "Audi RS3";
        productos[6] = "Volkswagen Golf GTI";

        Arrays.sort(productos);

        for (int i = 0; i < count ; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }
        System.out.println("====Usando Foreach====");
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }
        System.out.println("====Usando While====");
        int i = 0;
        while (i < count){
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }
        System.out.println("====Usando Do While====");
        int j = 0;
        do {
            System.out.println("para indice " + j + " : " + productos[j]);
            j++;
        } while (j < count);
        System.out.println("\n");

        int[] numeros = new int[10];
        int countNum = numeros.length;

        for (int k = 0; k < countNum; k++) {
            numeros[k] = k*5;
        }

        for (int k = 0; k < countNum; k++) {
            System.out.println("numeros = " + numeros[k]);
        }


    }
}
