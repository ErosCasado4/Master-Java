import java.util.Arrays;

public class EjemploArrayForIOrdenamientoBurbuja {
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
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
            /*
            Para entenderme mejor. El metodo burbuja(en esta forma)no es tan eficiente, ya que no deja de ser una comparativa en un bucle dentro de otro bucle. De hecho en este caso hace 49
            iteraciones(7 del for exterior + 42 del interior, ya que mientras que el exterior solo da una vuelta mientras el interior acabe su iteracion. A su vez, el interior
            deja de iterar cuando el exterior acaba. Es decir, un 7*7.
             */
        }
        System.out.println("contador = " + contador);

        System.out.println("====Usando For====");
        for (int i = 0; i < count ; i++) {
            System.out.println("para indice " + i + " valor: " + productos[i]);
        }
    }
}

