public class EjemploColuumnasVariables {
    public static void main(String[] args) {

        int[][] matriz = new int[3][];
/*
Hay dos formas de rellenar las columnas en las matrices. De manera fija, que seria inicializando con un numero determinado. Y otra, por filas.
Cada fila declarariamos un nuevo array dentro de esa fila con el valor de las columnas en dicha fila. De esa forma sería a gusto en funcion de la fila
 */
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        System.out.println("matriz length: " + matriz.length);
        System.out.println("fila 0 length: " + matriz[0].length);
        System.out.println("fila 1 length: " + matriz[1].length);
        System.out.println("fila 2 length: " + matriz[2].length);

        /*
        Recorremos el largo de matriz e internamente lo recorremos nuevamente, pasandole el valor del for exterior(matriz[i].length.) De esta forma, asociamoz el valor de matriz[i][j]
        por cada iteracion de i, de manera que en la primera vuelta exterior al i valer 0, su valor será 0. Como ya en la segunda, i vale 1, es a partir de la segunda vuelta del for interior
        que toma valor de la multiplicacion de valores.
         */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
