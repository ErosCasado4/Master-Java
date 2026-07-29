public class Rueda {
    private String fabricante;
    private int radio;
    private int ancho;
    private int perfil;
    private String tipoLlanta;

    public Rueda(String fabricante, int radio, int ancho, int perfil, String tipoLlanta) {
        this.fabricante = fabricante;
        this.radio = radio;
        this.ancho = ancho;
        this.perfil = perfil;
        this.tipoLlanta = tipoLlanta;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public int getPerfil() {
        return perfil;
    }

    public int getAncho() {
        return ancho;
    }

    public int getRadio() {
        return radio;
    }

    public String getFabricante() {
        return fabricante;
    }
}
