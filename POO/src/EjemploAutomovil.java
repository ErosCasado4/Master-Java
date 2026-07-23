public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil mercedes = new Automovil();
       mercedes.fabricante = "Mercedes-Benz";
       mercedes.modelo = "GLC Coupe 43";
       mercedes.color = "Plata";
       mercedes.cilindrada = 3.5;

       Automovil bmw = new Automovil();
       bmw.fabricante = "BMW";
       bmw.modelo = "Serie M3";
       bmw.color = "Azul";
       bmw.cilindrada = 3.0;


        System.out.println(mercedes.detalle());
        System.out.println(bmw.detalle());

        System.out.println(mercedes.frenar());
        System.out.println(bmw.frenar());
        System.out.println();
        System.out.println(mercedes.acelerar(3000));
        System.out.println(bmw.acelerar(2500));
        System.out.println();
        System.out.println(mercedes.acelerarFrenar());
        System.out.println();
        System.out.println(bmw.acelerarFrenar());
        System.out.println();
        System.out.println("Kilometros por litro: " + mercedes.calcularConsumo(650, 0.92f));
        System.out.println("Kilometros por litro: " + bmw.calcularConsumo(650, 0.86f));
        System.out.println();
        System.out.println("Kilometros por litro: " + mercedes.calcularConsumo(650, 92));
        System.out.println("Kilometros por litro: " + bmw.calcularConsumo(650, 86));



    }
}
