public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'a';
        char arroba = '@'; //o (con slash invertidou040)
        char decimal = 64; //por ejemplo si lo pasamos a var,no traeria a codigo 64(@) sino que seria un entero.
        System.out.println("caracter = " + caracter);
        System.out.println("arroba = " + arroba);
        System.out.println("decimal = " + decimal);
        System.out.println(decimal == arroba);
        System.out.println("char corresponde en byte a  " + Character.BYTES);
        System.out.println("char corresponde en bites a  " + Character.SIZE);
        System.out.println("valor maximo de un char " + Character.MAX_VALUE);
        System.out.println("valor maximo de un char " + Character.MIN_VALUE);
        //Podemos hacer un char de un espacio vacio. De un tabulador, slash invertido t
        
        char retroceso = '\b';
        char tab = '\t';
        System.out.println("char corresponde en byte a" + retroceso + retroceso + retroceso + Character.BYTES);
        System.out.println("char corresponde en byte a" + tab + tab + tab + Character.BYTES);


    }
}
