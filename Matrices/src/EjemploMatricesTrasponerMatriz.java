public class EjemploMatricesTrasponerMatriz {
    public static void main(String[] args) {

        int[][] a, b;
        a = new int[8][4];
        b = new int[4][8];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i+j*4;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
/*
Para trasponer y imprimirlo, usamos la matriz b con valores inversos a a. En vez de ser 8*4, es 4*8. Y Rellenamos los valores de b[j][i] con los de a[i][j]
 */
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("Trasponemos la matriz a y la metemos en b: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
