
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductMercedes = new Persona("Pedro", "Martínez Soria");
        Rueda[] ruedasMer = new Rueda[4];
        ruedasMer[0] = new Rueda("Bridgestone", 20, 245, 45, "Aleación");
        ruedasMer[1] = new Rueda("Bridgestone", 20, 245, 45, "Aleación");
        ruedasMer[2] = new Rueda("Bridgestone", 20, 245, 45, "Aleación");
        ruedasMer[3] = new Rueda("Bridgestone", 20, 245, 45, "Aleación");
        Automovil mercedes = new Automovil("Mercedes-Benz","GLC Coupe 43");
        mercedes.setColor(Color.BLANCO);
        mercedes.setMotor(new Motor(3.5, 249, "Diesel"));
        mercedes.setDeposito(new Deposito(65));
        mercedes.setTipo(TipoAutomovil.SUV);
        mercedes.setConductor(conductMercedes);
        mercedes.setRuedas(ruedasMer);

        Persona conductBmw = new Persona("Eros", "Casado Lozano");
        Rueda[] ruedasBmw = {new Rueda("Hankook", 18, 225, 45, "Aleación"),
                new Rueda("Hankook", 18, 225, 45, "Aleación"),
                new Rueda("Hankook", 18, 225, 45, "Aleación"),
                new Rueda("Hankook", 18, 225, 45, "Aleación")
        };
        Automovil bmw = new Automovil("BMW","Serie M3",Color.AZUL);
        bmw.setMotor(new Motor(3.0, 215, "Gasolina"));
        bmw.setDeposito(new Deposito(60));
        bmw.setTipo(TipoAutomovil.BERLINA);
        bmw.setConductor(conductBmw);
        bmw.setRuedas(ruedasBmw);

        Persona conductSeat = new Persona("Melissa", "Martin R");
        Rueda[] ruedasSeat = {new Rueda("Yokohama", 16, 205, 55, "Aleación"),
                new Rueda("Yokohama", 16, 205, 55, "Aleación"),
                new Rueda("Yokohama", 16, 205, 55, "Aleación"),
                new Rueda("Yokohama", 16, 205, 55, "Aleación")
        };
        Automovil seat = new Automovil("Seat", "Leon", Color.NEGRO, new Motor(2.0, 185, "Diesel"), new Deposito(45), conductSeat, ruedasSeat);
        seat.setTipo(TipoAutomovil.HATCHBACK);

        Persona conductSeat2 = new Persona("Pepe", "Villuela");
        Rueda[] ruedasSeat2 = {new Rueda("Michelin", 16, 215, 55, "Aleación"),
                new Rueda("Michelin", 16, 215, 55, "Aleación"),
                new Rueda("Michelin", 16, 215, 55, "Aleación"),
                new Rueda("Michelin", 16, 215, 55, "Aleación")
        };
        Automovil seat2 = new Automovil("Seat", "Leon", Color.ROJO,  new Motor(1.8, 125, "Gasolina"), new Deposito(45), conductSeat2, ruedasSeat2);

        seat2.setTipo(TipoAutomovil.HATCHBACK);
        seat2.setColor(Color.AZUL);
        Automovil.setColorPatente(Color.NEGRO);
        Automovil auto = new Automovil();

        System.out.println(mercedes.detalle());
        System.out.println(bmw.detalle());
        System.out.println(seat.detalle());
        System.out.println(seat2.detalle());

//        System.out.println("Conductor Mercedes: " + mercedes.getConductor());
//        System.out.println("Ruedas Mercedes: ");
//        for (Rueda r: mercedes.getRuedas()){
//            System.out.println("Fabricante: " + r.getFabricante() + ", ancho de neumático: " + r.getAncho() + ",  perfil de neumático: " + r.getPerfil() +
//                    ", radio de llanta: " + r.getRadio() + ", tipo de llanta: " + r.getTipoLlanta());
//        }

    }
}
