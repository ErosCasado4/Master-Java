public class Automovil {

   private int id;
   private String fabricante;
   private String modelo;
   private Color color;
   private double cilindrada;
   private int deposito = 45;

   private TipoAutomovil tipo;

   private static Color colorPatente = Color.BLANCO;
   private static int depositoEstatico = 38;
   private static int ultimoId;

   //Las constantes en java se declaran con final
   public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
   public static final int VELOCIDAD_MAX_CIUDAD = 50;
   public static final String COLOR_BLANCO = "Blanco";
   public static final String COLOR_NEGRO = "Negro";
   public static final String COLOR_AZUL = "Azul";
   public static final String COLOR_ROJO = "Rojo";
   public static final String COLOR_GRIS = "Gris";
   public static final String COLOR_VERDE = "Verde";

    public Automovil() {
        this.id = ++ultimoId;
    }

   //Podemos crear el constructor con el generador, sea pasandole parametros(obliga a que en el main cuando invoquemos si o si por parametro tenemos que poner los parametros) o vacio.
   public Automovil(String fabricante, String modelo){
        this();
       this.fabricante = fabricante;
       this.modelo = modelo;
   }

//De esta forma en adelante, y como ejemplo, vemos como reutilizar otros constructores y reutilizar codigo. en vez de referenciar a cada metodo, referenciamos dentro del objeto con los seleccionados en el constructor anterior
    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int deposito) {
        this(fabricante,modelo,color,cilindrada);
        this.deposito = deposito;
    }
// Esto es una forma de crear los Getters y Setters manualmente. Podemos hacerlos mucho mas facil dando al boton dereecho -> generate y ahi.
//   public String getFabricante(){
//       return this.fabricante;
//    }
//    public void setFabricante(String fabricante){
//       this.fabricante = fabricante;
//    }
//    public String getModelo(){
//        return this.modelo;
//    }
//    public void setModelo(String modelo){
//        this.modelo = modelo;
//    }
//    public String getColor(){
//        return this.color;
//    }
//    public void setColor(String color){
//        this.color = color;
//    }
//    public double getCilindrada(){
//        return this.cilindrada;
//    }
//    public void setCilindrada(double cilindrada){
//        this.cilindrada = cilindrada;
//    }
//    public int getDeposito(){
//        return this.deposito;
//    }
//    public void setDeposito(int deposito){
//        this.deposito = deposito;
//    }


    public TipoAutomovil getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }
//al usar los parametros por constructos, los set de los metodos utilizados podriamos obviarlos. Por ahora, al constructor solo le pasamos Fabricante y Modelo
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getDepositoEstatico() {
        return depositoEstatico;
    }

    public static void setDepositoEstatico(int depositoEstatico) {
        Automovil.depositoEstatico = depositoEstatico;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String detalle(){
//Podemos obtener los metodos referenciandolas(es indiferente en este caso que sea privado ya que es propio de la misma clase) o usando los get+metodo
        return  "id = " + this.id +
                "\nFabricante = " + this.fabricante +
                "\nTipo de vehículo = " + this.getTipo().getDescpricion() +
                "\nModelo = " + this.modelo +
                "\nColor = " + this.color +
                "\nColorPatente = " + colorPatente +//Al ser static este metodo se referencia sin referenciar al objeto this. solo al metodo, o concatenando con Automovil(objeto del que se crea)
                "\nCilindrada = " + this.cilindrada;

    }

    public String acelerar(int rpm){
        return "El vehiculo " + fabricante + " " + modelo + " está acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return "El vehiculo " + fabricante + " " + modelo + " está acelerando frenando!";
    }

    public String acelerarFrenar(){
        String acelerar = this.acelerar(3000);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeDeposito){
        return km/(deposito*porcentajeDeposito);
    }
    public float calcularConsumo(int km, int porcentajeDeposito){
        return km/(deposito*(porcentajeDeposito/100f));
    }
    public static float calcularConsumoEstatico(int km, int porcentajeDeposito){
        return km/(depositoEstatico*(porcentajeDeposito/100f));
    }

    /*
    Usando en el generador en el Override Methods podemos usar el metodo equals para el objeto que queramos y las clases que queramos comparar como por aqui abajo
     */
    @Override
    public boolean equals(Object obj) {
//Validaciones necesarias para evitar excepciones: Si en el main invocamos un obj automovil pero sin nada por parametro, retornará null. Con las validaciones dará false, al igual que si comparamos con otro objeto diferente.
        if (this == obj){
            return true;
        }
        if (!( obj instanceof Automovil)){
            return false;
        }
       Automovil a = (Automovil)obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", " +
                "Fabricante: " + fabricante + ", " +
                "Modelo: " + modelo + ", " +
                "Color: " + color + ", " +
                "Cilindrada: " + cilindrada +
                "Deposito: " + deposito +
                '}';
    }
}
