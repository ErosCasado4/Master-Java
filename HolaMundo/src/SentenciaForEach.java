public class SentenciaForEach {
    public static void main(String[] args) {
        /*
        A diferencia de en PHP, el foreach no se usa tal cual como foreach, sino asi
         */

        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        for (int num: numeros){
            if (num % 2 == 0){
                System.out.println("Numero par " + num);
            } else {
                System.out.println("Numero impar " + num);
            }
        }
        String[] nombres = {"Eros", "Melissa", "Dylan", "Ayla", "Croco", "Luffy", "Seraphim"};
        for (String nombre: nombres){
        System.out.println("name = " + nombre);
        }
    }
}
