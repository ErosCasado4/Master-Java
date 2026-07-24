public class Automovil {

   private String fabricante;
   private String modelo;
   private String color;
   private double cilindrada;
   private int deposito = 45;

   //Podemos crear el constructor con el generador, sea pasandole parametros(obliga a que en el main cuando invoquemos si o si por parametro tenemos que poner los parametros) o vacio.
   public Automovil(String fabricante, String modelo){
       this.fabricante = fabricante;
       this.modelo = modelo;
   }

    public Automovil() {
    }
//De esta forma en adelante, y como ejemplo, vemos como reutilizar otros constructores y reutilizar codigo. en vez de referenciar a cada metodo, referenciamos dentro del objeto con los seleccionados en el constructor anterior
    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int deposito) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    public String detalle(){
//Podemos obtener los metodos referenciandolas(es indiferente en este caso que sea privado ya que es propio de la misma clase) o usando los get+metodo
        return "Fabricante = " + this.fabricante +
                "\nModelo = " + this.modelo +
                "\nColor = " + this.color +
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
}
