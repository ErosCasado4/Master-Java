import java.util.Arrays;

public class EjemploArrayForInverso {
    public static void main(String[] args) {
        /*
        Arrays es la clase usada para trabajar con diferentes metodos en array, por ejemplo sort, para ordenar.
         */

        //String[] productos = new String[7]; // de esta forma esta mas limitado. Es mejor la otra, da mas dinamismo
        String[] productos = {"BMW Serie 1","Toyota Corolla","Mazda CX-10","Renault Arkana",
                                "Peugeot 508","Audi RS3","Volkswagen Golf GTI"};
        int count = productos.length;
//        productos[0] = "BMW Serie 1";
//        productos[1] = "Toyota Corolla";
//        productos[2] = "Mazda CX-10";
//        productos[3] = "Renault Arkana";
//        productos[4] = "Peugeot 508";
//        productos[5] = "Audi RS3";
//        productos[6] = "Volkswagen Golf GTI";

        Arrays.sort(productos);
        System.out.println("====Usando For====");
        for (int i = 0; i < count ; i++) {
            System.out.println("para indice " + i + " valor: " + productos[i]);
        }

        System.out.println("====Usando For Inverso====");
        for (int i = 0; i < count; i++) {
            System.out.println("para indice " + (count-1-i) + " valor: " + productos[count-1-i]);
        }
        System.out.println("====Usando For Inverso2====");
        for (int i = count -1; i >= 0 ; i--) {
            System.out.println("para indice " + i + " valor : " + productos[i]);
        }
    }
}
