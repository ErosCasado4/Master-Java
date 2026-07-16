public class EjemploArrayForIOrdenamientoBurbuja2 {
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
//        Arrays.sort(productos);
//        arrayInverso(productos);
        //Collections.reverse(Arrays.asList(productos));

        int contador = 0;
        for (int i = 0; i < count - i; i++) {
            /*
            Explicacion del metodo burbuja eficiente. lo que hacemos es restarle una iteracion al for exterior, ya que al final de la primera iteracion la ultima posicion ya estará ordenada
            en el interiro comparamos con la variable interior y iteramos con -1 para no llegar al final y menor el valor de i, ya que asi ahorramos iteraciones vacias.
            en el if para comparar, lo que hacemos es comparar si el valor de j+1 con j, para ver si el primer objeto(j+1) es menor que j, y al compararlo, si es asi,
            cambiamos valores. Es decir, declaramos auxiliar con valor j, j = a j+1 y j+1 a auxiliar, para poder ir iterando dentro de ese for y comparando y resolviendo
             */
            for (int j = 0; j < count -1 -i; j++) {
                if (productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
        int[] numeros = new int[4];

        numeros[0] = 1*5;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 3*10/5;
        numeros[3] = 4;

        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length -1 -i; j++) {
                if ( ((Comparable) numeros[j+1]).compareTo(numeros[j]) < 0){
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("====Usando For====");
        for (int i = 0; i < count ; i++) {
            System.out.println("para indice " + i + " valor: " + productos[i]);
        }
    }
}

