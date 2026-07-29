
public class EjemploAutomovilStatic {
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
        TipoAutomovil tipoMercedes = mercedes.getTipo();

        System.out.println(mercedes.detalle());
        System.out.println(bmw.detalle());
        System.out.println(seat.detalle());
        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros: " + Automovil.calcularConsumoEstatico(350, 68));
        System.out.println("Tipo de vehiculo Mercedes GLC Coupe: " + tipoMercedes.getNombre() + ". Descripcion del vehiculo: " + tipoMercedes.getDescpricion() + ". Cantidad de puertas: " + tipoMercedes.getNumeroPuerta());

    }
}
