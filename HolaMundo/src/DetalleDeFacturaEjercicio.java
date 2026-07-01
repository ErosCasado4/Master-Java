import java.util.Scanner;

public class DetalleDeFacturaEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre para la factura: ");
        String nombre = scanner.nextLine();

        double prod1 = 0;
        double prod2 = 0;
        System.out.println("Añada el valor del primer producto a la cesta");
        try {
             prod1 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Error, el valor no es correcto. Vuelva a intentarlo, por favor.");
            main(args);
            System.exit(0);
        } try {
            System.out.println("Añada el valor del segundo producto a la cesta");
            prod2 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Error, el valor no es correcto. Vuelva a intentarlo, por favor.");
            main(args);
            System.exit(0);
        }
        double impuesto = 19.0;
        double resProd1 = prod1 * (impuesto / 100);
        double resProd2 = prod2 * (impuesto / 100);
        System.out.println("Impuestos de los productos 1 y 2 es: " + resProd1 + " y " + resProd2);

        double totalImp = resProd1 + resProd2;
        System.out.println("Suma total de impuestos: " + totalImp);

        double prodSinImp = prod1 + prod2;
        double impProd = resProd1 + resProd2;
        double total = prodSinImp + impProd;

        String factura = "la factura a nombre de " + nombre + " tiene un total bruto de " + prodSinImp + " con un impuesto total de ambos productos de " + totalImp
                + " y el monto total después de la suma de impuestos es de: " + total;

        System.out.println(factura);
    }
}
