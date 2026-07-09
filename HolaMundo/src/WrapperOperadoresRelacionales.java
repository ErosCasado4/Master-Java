public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;
//Hay que tener en cuena que no se puede bajar de 128. Si se baja el valor de 128, no comparara por objeto sino por valor.
        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num1);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));
        num2 = 2000;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);

    }
}
