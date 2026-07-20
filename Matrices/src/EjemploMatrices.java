public class EjemploMatrices {
    public static void main(String[] args) {

        int[][] numeros = new int[2][4];

        numeros[0][0] = 0;
        numeros[0][1] = 1;
        numeros[0][2] = 2;
        numeros[0][3] = 3;

        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;
        numeros[1][3] = 7;
 /*
 voy a explicar rapidamente por aqui. para recorrer una matriz,primero declaramos filas y luego columnas.
  */
        System.out.println("Numero de filas: " + numeros.length); //Ver el largo de las filas
        System.out.println("Numero de columnas: " + numeros[0].length); //ver el largo de las columnas

        System.out.println("Primer elemento de la matriz: " + numeros[0][0]); //Asi traemos el primer elemento de la martriz. Sencillo.
        System.out.println("Ultimo elemento de la matriz: " + numeros[numeros.length - 1][numeros[1].length - 1]); //Aqui el ultimo. Debemos de restar como con los arryay normales, ya que sino desborda

        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];
        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
    }
}
