public class EjercicioCambioValorIndice {
    public static void main(String[] args) {

        int[] a = new int[10];

        int aux = 0;
        int ultimo;
        for (int i = 0; i < a.length ; i++) {
            a[i] = ++aux;
            System.out.println("Posicion " + i + " : " + a[i]);
        }
        System.out.println("\n\nPost desplazamiento.");
        ultimo = a[a.length-1];
        for (int i = a.length - 2; i>= 0; i--) {
            a[i+1] = a[i];
        }
        a[0] = ultimo;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " + i + " : " + a[i]);
        }

    }
}
