public class SentenciaWhile {
    public static void main(String[] args) {
        /*
        Do while, bucle con el que tener cuidado. Puede hacer loop eterno y jaja NO queremos eso.
        es mas util tirar de for. Pero esta bien conocerlo. Sirve para saber, como en el for, las determinadas
        veces que queremos iterar por el bucle.
         */

        int i = 0;
        boolean test = true;
        do {
            if(i == 10){
                test = false;
            }
            System.out.println("Valor de i en: " + i);
            i++;
        } while (test);
        System.out.println("Salió");
    }
}
