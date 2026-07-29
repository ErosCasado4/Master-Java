
public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setDepositoEstatico(45);

        Motor motorMercedes = new Motor(3.5, 249, "Diesel");
        Deposito depositoMercedes = new Deposito(65);
        Automovil mercedes = new Automovil("Mercedes-Benz","GLC Coupe 43");
        mercedes.setColor(Color.BLANCO);
        mercedes.setMotor(motorMercedes);
        mercedes.setDeposito(depositoMercedes);
        mercedes.setTipo(TipoAutomovil.SUV);
        System.out.println("Todo sobre este vehiculo: Fabricante " + mercedes.getFabricante() + ", modelo " + mercedes.getModelo() + ", color " + mercedes.getColor() + " ,cilindrada " + mercedes.getMotor().getCilindrada());

        Automovil bmw = new Automovil("BMW","Serie M3",Color.AZUL);
        bmw.setMotor(new Motor(3.0, 215, "Gasolina"));
        bmw.setDeposito(new Deposito(60));
        bmw.setTipo(TipoAutomovil.BERLINA);
        System.out.println("Todo sobre este vehiculo: Fabricante " + bmw.getFabricante() + ", modelo " + bmw.getModelo() + ", color " + bmw.getColor() + " ,cilindrada " + bmw.getMotor().getCilindrada());


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
