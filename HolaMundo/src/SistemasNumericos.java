import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        //int numDecimal = 500;
        //Ahora vamos a hacerlo con JOptionPane, que es para ingresar nosotros el valor por ventana
        String numeroStr = JOptionPane.showInputDialog(null, "Ingresa un valor entero, por favor: ");
        //Recogemos el valor de la cadena de texto ingresada en el JOption. Luego lo parseamos para que esa cadena se convierta en entero, pasandole el parametro
        int numDecimal = 0;
        /*Explicacion rapida para entendernos. Hemos inicializado la variable a 0, ya que antes de que entre al try necesitamos que tenga un valor,
        recordemos que en los if u otros elementos como condicionales, las variables que tengan valor exterior pueden ser modificadas si ya
        están inicializadas fuera y tienen un valor asignado. En el try lo que hacemos es, si el valor NO es un entero, salta un JOptionPane con mensaje de error.
        Llamamos al metodo main, para que podamos retornar al inicio y de esta forma volver a intentar ingresar un valor que coincida con lo esperado en el parseo.
        Try lo que hace es que si el resultado es el esperado, avanza. Sino, salta el catch.
         */
        try {
            numDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe de ingresar un número entero. Vuelva a intentarlo, por favor.");
            main(args);
            System.exit(0);
        }
        System.out.println("numDecimal = " + numDecimal);

        String resBinario = "numero binario de " + numDecimal + " = " + Integer.toBinaryString(numDecimal);
        System.out.println(resBinario);
        int numBin = 0b111110100;

        String resOctal = "numero octal de " + numDecimal + " = " + Integer.toOctalString(numDecimal);
        System.out.println(resOctal);

        int numOctal = 0764;

        String resHexadecimal = "numero hexadecimal de " + numDecimal + " = " + Integer.toHexString(numDecimal);
        System.out.println(resHexadecimal);
        System.out.println("numOctal = " + numOctal);
        System.out.println();

        int numHex = 0x1f4;
        System.out.println("numHex = " + numHex);

        String mensaje = resBinario;
        mensaje += "\n" + resOctal;
        mensaje += "\n" + resHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
