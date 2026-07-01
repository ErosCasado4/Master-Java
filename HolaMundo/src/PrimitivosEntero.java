public class PrimitivosEntero {
    public static void main(String[] args) {
        byte numByte = 14;
        System.out.println("numByte = " + numByte);
        System.out.println("tipo byte corresponde en byte a  " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a  " + Byte.SIZE);
        System.out.println("valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("alor maximo de un byte " + Byte.MIN_VALUE);

        short numShort = 32767;
        System.out.println("numShort = " + numShort);
        System.out.println("tipo byte corresponde en byte a  " + Short.BYTES);
        System.out.println("tipo byte corresponde en bites a  " + Short.SIZE);
        System.out.println("valor maximo de un Short " + Short.MAX_VALUE);
        System.out.println("alor maximo de un Short " + Short.MIN_VALUE);

        int numInt = 32768;
        System.out.println("numInt = " + numInt);
        System.out.println("tipo byte corresponde en byte a  " + Integer.BYTES);
        System.out.println("tipo byte corresponde en bites a  " + Integer.SIZE);
        System.out.println("valor maximo de un Int " + Integer.MAX_VALUE);
        System.out.println("alor maximo de un Int " + Integer.MIN_VALUE);

        long numLong = 2147483648l;
        System.out.println("numLong = " + numLong);
        System.out.println("tipo byte corresponde en byte a  " + Long.BYTES);
        System.out.println("tipo byte corresponde en bites a  " + Long.SIZE);
        System.out.println("valor maximo de un long " + Long.MAX_VALUE);
        System.out.println("alor maximo de un long " + Long.MIN_VALUE);

    }
}
