import java.util.Scanner;

public class EjercicioCambioValorIndice2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        /*
        En este caso rellenamos igual, con variable aux como contador en preincremento. La unica posicion que no se rellena es la ultima, es decir, queda vacia e inexiostente en la primera impresion
        Luego asignamos elemento y posicion con Scanner y lo que hacemos es iterar sobre el array pero el valor de i es el largo menos 2(8) con la idea de que se itere desdee todas las posiciones
        que tienen asignado un valor. E iterara mientras que i sea mayor o igual a posicion e ira decrementando. Lo que se hace aqui para sobreescribir datos es por ejemplo, si i empieza en 8(maximo)
        rellena del tiron el ultimo elemento, ya que esa iteracion se asigna el valor de i mas 1, con el elemento de esa iteracion. Si Posicion 8 vale 9, se asigna 9 a posicion 9, es decir, sobreescribe
        el elemento actual con el anterior. Cuando posicion sea mayor, toma la posicion del array y inserta el elemento. Esto provoca que si por ejemeplo, lo asigno en 5 y esta iterando sobre esa vuelta,
        lo que hace es desplazar ese elemento y los de la derecha(los que ya ha iterado y cambiado su valor) para asignar el elemento insertado.
         */

        int aux = 0;
        int elemento, posicion;
        for (int i = 0; i < a.length-1 ; i++) {
            a[i] = ++aux;
            System.out.println("Posicion " + i + " : " + a[i]);
        }

        System.out.println("Nuevo elemento.");
        elemento = s.nextInt();
        System.out.println("Elige posicion a insertar el elemento, de 0-9: ");
        posicion = s.nextInt();

        for (int i = a.length - 2; i>= posicion; i--) {
            a[i+1] = a[i];
        }
        a[posicion] = elemento;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " + i + " : " + a[i]);
        }

    }
}
