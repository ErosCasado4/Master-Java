import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
/*
Para cuando tenemos los metodos publicos lo hacemos asi. En privado, como abajo.
 */
//        Automovil mercedes = new Automovil();
//       mercedes.fabricante = "Mercedes-Benz";
//       mercedes.modelo = "GLC Coupe 43";
//       mercedes.color = "Plata";
//       mercedes.cilindrada = 3.5;
//
//       Automovil bmw = new Automovil();
//       bmw.fabricante = "BMW";
//       bmw.modelo = "Serie M3";
//       bmw.color = "Azul";
//       bmw.cilindrada = 3.0;
        Date fecha = new Date();

        Automovil mercedes = new Automovil("Mercedes-Benz","GLC Coupe 43");
        mercedes.setColor("Plata");
        mercedes.setCilindrada(3.5);
        System.out.println("Todo sobre este vehiculo: Fabricante " + mercedes.getFabricante() + ", modelo " + mercedes.getModelo() + ", color " + mercedes.getColor() + " ,cilindrada " + mercedes.getCilindrada());

        Automovil bmw = new Automovil("BMW","Serie M3","Azul");
        bmw.setCilindrada(3.0);
        System.out.println("Todo sobre este vehiculo: Fabricante " + bmw.getFabricante() + ", modelo " + bmw.getModelo() + ", color " + bmw.getColor() + " ,cilindrada " + bmw.getCilindrada());

        Automovil seat = new Automovil("Seat", "Leon", "Negro perlado", 1.8,48);
        Automovil seat2 = new Automovil("Seat", "Leon", "Negro perlado", 1.8,48);
        Automovil auto = new Automovil();

        System.out.println("Son iguales? " + (seat == seat2));
        System.out.println("Son iguales?(usando equals) " + (seat.equals(seat2)));
        System.out.println("Son iguales?(usando equals) " + (auto.equals(seat2)));
        System.out.println("Son iguales?(usando equals) " + (auto.equals(fecha)));


        System.out.println(mercedes.detalle());
        System.out.println(bmw.detalle());
        System.out.println(seat.detalle());

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
        System.out.println("Kilometros por litro: " + seat.calcularConsumo(650, 86));



    }
}
