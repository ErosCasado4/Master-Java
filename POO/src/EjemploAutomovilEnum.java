
public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setDepositoEstatico(45);

        Automovil mercedes = new Automovil("Mercedes-Benz","GLC Coupe 43");
        mercedes.setColor(Color.BLANCO);
        mercedes.setCilindrada(3.5);
        mercedes.setTipo(TipoAutomovil.SUV);
        System.out.println("Todo sobre este vehiculo: Fabricante " + mercedes.getFabricante() + ", modelo " + mercedes.getModelo() + ", color " + mercedes.getColor() + " ,cilindrada " + mercedes.getCilindrada());

        Automovil bmw = new Automovil("BMW","Serie M3",Color.AZUL);
        bmw.setCilindrada(3.0);
        bmw.setTipo(TipoAutomovil.BERLINA);
        System.out.println("Todo sobre este vehiculo: Fabricante " + bmw.getFabricante() + ", modelo " + bmw.getModelo() + ", color " + bmw.getColor() + " ,cilindrada " + bmw.getCilindrada());

        Automovil seat = new Automovil("Seat", "Leon", Color.NEGRO, 1.8,48);
        seat.setTipo(TipoAutomovil.HATCHBACK);
        Automovil seat2 = new Automovil("Seat", "Leon", Color.ROJO, 1.8,48);

        seat2.setTipo(TipoAutomovil.HATCHBACK);
        seat2.setColor(Color.AZUL);
        Automovil.setColorPatente(Color.NEGRO);
        Automovil auto = new Automovil();
        TipoAutomovil tipo = mercedes.getTipo();
        System.out.println("Tipo de vehiculo Mercedes GLC Coupe: " + tipo.getNombre() + ". Descripcion del vehiculo: " + tipo.getDescpricion() + ". Cantidad de puertas: " + tipo.getNumeroPuerta());

        tipo = bmw.getTipo();
        switch (tipo){
            case SUV -> System.out.println("El vehículo tiene una apariencia de todoterreno familiar, pero sin la envergadura y tamaño de uno. Es un hibrido entre un 4x4 y un utilitario común.");
            case PICKUP -> System.out.println("El vehículo es de apariencia todoterreno. Grande, imponente.");
            case BERLINA -> System.out.println("El vehículo es de apariencia familiar, alargado.");
            case COUPE -> System.out.println("El vehículo es de apariencia deportiva, aunque existen modelos coupé de berlinas y de Suv.");
            case COMERCIAL -> System.out.println("El vehículo es de apariencia compacta pero con la diferencia de que son vehículos adaptados a la actividad comercial.");
            case FURGONETA -> System.out.println("El vehículo es de apariencia tipo furgoneta, en este caso utilitaria.");
            case INDUSTRIAL -> System.out.println("El vehículo es de apariencia tipo furgoneta, en este caso de caractér industrial.");
            case HATCHBACK -> System.out.println("El vehículo es de apariencia utilitario tipo compacto.");
            case CONVERTIBLE -> System.out.println("El vehículo es de apariencia deportiva generalmente, con el techo convertible a descapotable.");
            case STATION_WAGON -> System.out.println("El vehículo es de apariencia tipo berlina o hacthback pero con la diferencia de que tiene el habitáculo de maletero tipo ranchera.");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos){
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescpricion() + ", " +
                    ta.getNumeroPuerta() + " puertas.");
            System.out.println();
        }
    }
}
