public class EjemploMatricesTranspuesta {
    public static void main(String[] args) {

        int[][] matrizTranspuesta = {
                {1,2,3,4,},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
/*
para entendernos mejor. Creamos la matriz arriba. La recorremos e imprimimos. Creamos la variable auxiliar para cambiar valores en un segundo for. Iterara partiendo de uno ya que el interior
itera siendo j menor que i y ahi vamos cambiando los valores. Aux tiene valor inicial, pero vamos cambiando valores y rotandolos.
 */
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }
        int aux;
        for (int i = 1; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matrizTranspuesta[i][j];
                matrizTranspuesta[i][j] = matrizTranspuesta[j][i];
                matrizTranspuesta[j][i] = aux;
            }
        }
        System.out.println("\nMatriz Transpuesta");
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length ; j++) {
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
