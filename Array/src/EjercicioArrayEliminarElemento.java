import java.util.Scanner;

public class EjercicioArrayEliminarElemento {
    public static void main(String[] args) {
/*
Creamos dos array, uno con un largo determinado, otro siendo la copia del anterior menos un elemento. la idea es que copiemos luego los elementos de a en b.
RTras asignar los elementos, procedemos a eliminar una posicion. i tiene el valor que asignenmos a psicion e iterará hasta 9. Incrementa su valor. Esto lo que
hace es qued en el momento en el que el for itera por el valor de posicion, de ahi en adelante se modifican los elementos. Ejemplo, si modifico el elemento 5 y lo elimino,
lo que sucede es que ahora, desde posicion(5) pasará a ser el valor de 6, y de 5 en adelante todos los elementos cambian su valor al mismo + 1. Luego, con la clase System
y el elemento arraycopy copiamos el array a en b. y Luego, asignamos a a b. Asi de esta forma al imprimir los valores de a será con el elemento modificado
 */
        int[] a = new int[10];
        int[] b = new int[a.length-1];

        Scanner s = new Scanner(System.in);

        int aux = 0;
        int posicion;
        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < a.length ; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Elimina el elemento de la posicion a desear.");
        posicion = s.nextInt();

        for (int i =posicion; i < a.length-1; i++) {
                a[i] = a[i+1];
            }
        System.arraycopy(a,0,b,0,b.length);

        a = b;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Posicion " + i + " : " + a[i]);
        }

    }
}
