public class EjemploMatrizSimetrica {
    public static void main(String[] args) {

        boolean simetria = true;
        int[][] matrizSimetrica =  {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7},
        };

//        int i, j;
//        i = 0;
//
//        while (i < matrizSimetrica.length && simetria == true){
//            j = 0;
//            while (j < i && simetria == true){
//                if (matrizSimetrica[i][j] != matrizSimetrica[j][i]){
//                    simetria = false;
//                }
//                j++;
//            }
//            i++;
//        }

        salir: for (int i = 0; i < matrizSimetrica.length; i++) {
            for (int j = 0; j < i ; j++) {
                if (matrizSimetrica[i][j] != matrizSimetrica[j][i]){
                    simetria = false;
                    break salir;
                }
            }
        }

        if (simetria){
            System.out.println("La matriz es simetrica.");
        } else {
            System.out.println("la matriz no es simetrica.");
        }
    }
}
