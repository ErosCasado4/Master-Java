public class EjemploArrayOrdenPrincipioFinal {
    public static void main(String[] args) {
/*
Lo que se busca es invertir los valores en el array. Dar el valor con saltos impares, es decir, primero el primero, segundo el ultimo,
tercero el segundo, cuarto el noveno. Para ello lo que hacemos es crear dos array, creamos tres for, en el que recorremos el largo del array y asignamos al array
el valor del indice con el indice mas 1. Es decir, num[i] seria 0. Si sumamos 1, se almacena como 1. Por eso, incrementamso a cada vuelta su valor, para que a cada posicion se asigne el valor
Luego, usamos otro for para iterar y rellenar el segundo array. La forma de iterarlo es diferente, para que no duplique valores repetidos, lo topamos con el largo del array menos indice.
Al ser 10, cuando el i llegue a 5 significa que estará a la mitad. Antes inicializamos la variable aux que servira como contador y para rellenar el array, tal y como hicimos antes. Al tener
post incremento, va rellenando en cada iteracion en la que aparece el array e incrementando su posicion y su valor. En una, con el num[i] y en otra, con el largo del array menos 1 menos i,
es decir, empezaria desde el final del array.
 */
        int[] num = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        int aux = 0;
        for (int i = 0; i < num.length - i; i++) {
            a[aux++] = num[i];
            a[aux++] = num[num.length-1-i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + " : " + a[i]);
        }
    }
}
