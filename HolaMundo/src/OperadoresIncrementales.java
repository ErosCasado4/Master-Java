public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento. Significa que i incrementa su valor, y a su vez j recoje el valor actual de i. Al sumar +1 al valor de i y luego asignar su valor, j = i+i
        int i = 5, j = ++i;

        System.out.println("i = " + i); //6
        System.out.println("j = " + j); //5

        //Post incremento. Justo al reves. J asume el valor inicial de i(2) pero no incrementa su valor, al recibir primero la identificacion antes que la asignacion
        i = 2;
        j = i++;
        System.out.println("i = " + i); //2
        System.out.println("j = " + j); //3

        //Pre y post decremento, lo mismo que en los casos anteriores.
        i = 10;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("j = " + (++j)); //Aqui incrementa el valor impreso en +1- Es decir, 10
        System.out.println("j = " + (j++)); //Aqui primero recoje el valor de j, luego suma, pero la suma no se ve. Pero su valor real seria 11.
        System.out.println("j = " + j);//Imprime 11.

    }
}
