public class OperadoresPrecedencia {
    public static void main(String[] args) {

        int i = 78;
        int j = 84;
        int k = 36;

        double promedio = (i + j + k) /3d;
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10; //Aqui es diferente. La prioridad la tiene el pre y post incremento
        System.out.println("promedio = " + promedio);
    }
}
