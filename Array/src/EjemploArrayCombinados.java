public class EjemploArrayCombinados {
    public static void main(String[] args) {

        int [] a, b, c;
        a = new int[15];
        b = new int[15];
        c = new int[30];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (i+1)*5;
        }
        int aux = 0;
        /*
        Justo aqui, para que nos entendamos. Estamos rellenando el tercer array con multiplos de 3. Es decir, el incremento de i es igual a 3. El for exterior iterará 5 veces.
        Los interiores se rellenaran 3 veces(arrays a y b) sumandole a elemento c con el valor de a y b pero con la suma de j(indice de los bucles interiores)
         */
        for (int i = 0; i < b.length; i+= 3) {
            for (int j = 0; j < 3 ; j++) {
                c[aux++] = a[i+j];
            }
            for (int j = 0; j < 3 ; j++) {
                c[aux++] = b[i+j];
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + " : " + c[i]);
        }
    }
}
