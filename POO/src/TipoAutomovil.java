public enum TipoAutomovil {
    BERLINA("Berlina", "Vehículo familiar utilitario", 5),
    HATCHBACK("Hatchback", "Vehículo compacto", 5),
    STATION_WAGON("Stationwagon", "Vehículo familiar tipo ranchera", 5),
    COUPE("Coupé", "Vehículo estetica deportiva", 3),
    PICKUP("Pick-up", "Vehículo todoterreno", 5),
    SUV("Suv", "Vehículo familiar hibrido entre todoterreno y berlina/compacto", 5),
    CONVERTIBLE("Convertible", "Vehículo deportivo descapotable", 3),
    FURGONETA("Furgoneta", "Vehículo utilitario", 5),
    INDUSTRIAL("Industrial", "Vehículo utilitario de carácter industrial", 4),
    COMERCIAL("Comercial", "Vehículo compacto de tipo comercial", 3);

    private final String nombre;
    private final String descpricion;
    private final int numeroPuerta;

    TipoAutomovil(String nombre, String descpricion, int numeroPuerta) {
        this.nombre = nombre;
        this.descpricion = descpricion;
        this.numeroPuerta = numeroPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescpricion() {
        return descpricion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }
}

