public class PrimitivosFloat {

    static float varFloat;

    public static void main(String[] args) {
        //Para asignar el decimal correctamente debemos poner la f al final de la asignacion. De igual forma usando e(1.0e+2f)significa que es como si hicieramos un x100, por ejemplo
        float realFloat = 1.0e+2f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a  " + Float.BYTES);
        System.out.println("float corresponde en bites a  " + Float.SIZE);
        System.out.println("valor maximo de un float " + Float.MAX_VALUE);
        System.out.println("alor maximo de un float " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38f;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a  " + Double.BYTES);
        System.out.println("double corresponde en bites a  " + Double.SIZE);
        System.out.println("valor maximo de un double " + Double.MAX_VALUE);
        System.out.println("alor maximo de un double " + Double.MIN_VALUE);

        //float varFloat;
        System.out.println("varFloat = " + varFloat);

    }
}
