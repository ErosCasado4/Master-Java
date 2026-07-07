public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        /*
        Aqui lo que hacemos en el primer caso, que ha sido el ultimo ejemplo es iterar mientras que i sea menor o igyal a 7. i es dia, j son horas.
        mientras que j sea menor o igual a 8, iteramos dentro. Si i es 6 o 7, sera descanso. Usamos estas etiquetas para marcar los bucles.
        Es la primera vez en la vida que las uso, la verdad.
         */

        bucle:
        for (int i = 1; i <= 7 ; i++) {
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descando de fin de semana.");
                    continue bucle;
                }
                System.out.println("Dia " + i + ",  trabajando a las " + j + "horas.");
                j++;
            }
        }
        System.out.println("\n\n");
        bucle1:
        for (int i = 0; i < 5 ; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.println("[i = " + i + ", j = " + j + "], ");
            }
        }
        System.out.println("\n\n");
        etiqueta:
        for (int i = 0; i < 5 ; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.println("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
