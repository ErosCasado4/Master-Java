public class EjemploArrayForIOrdenamientoBurbuja3 {
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

    public static void sortBurbuja(Object[] array) {

        int count = array.length;
        int contador = 0;

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count -1 -i; j++) {
                if ( ((Comparable) array[j+1]).compareTo(array[j]) > 0){
                    Object auxiliar = array[j];
                    array[j] = array[j+1];
                    array[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);

    }
    public static void main(String[] args) {

        String[] productos = {"BMW Serie 1","Toyota Corolla","Mazda CX-10","Renault Arkana",
                                "Peugeot 508","Audi RS3","Volkswagen Golf GTI"};

        int count = productos.length;

        sortBurbuja(productos);

        System.out.println("====Usando For====");
        for (int i = 0; i < count ; i++) {
            System.out.println("para indice " + i + " valor: " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 1*5;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 3*10/5;
        numeros[3] = 4;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + i + " : " + numeros[i]);
        }


    }
}

