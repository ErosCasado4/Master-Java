import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArrayForInversoModificable {
    public static void arrayInverso(String[] array){
        int count = array.length;
        int count2 = array.length;
        for (int i = 0; i < count2; i++) {
            String actual = array[i];
            String inverso = array[count-1-i];
            array[i] = inverso;
            array[count-1-i] = actual;
            count2--;
            System.out.println("para indice " + i + " valor: " + array[i]);
        }
    }
    public static void main(String[] args) {

        String[] productos = {"BMW Serie 1","Toyota Corolla","Mazda CX-10","Renault Arkana",
                                "Peugeot 508","Audi RS3","Volkswagen Golf GTI"};
        int count = productos.length;
        Arrays.sort(productos);
        arrayInverso(productos);
        //Collections.reverse(Arrays.asList(productos));

        System.out.println("====Usando For====");
        for (int i = 0; i < count ; i++) {
            System.out.println("para indice " + i + " valor: " + productos[i]);
        }
    }
}

