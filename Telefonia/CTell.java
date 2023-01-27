
public class CTell {
    private int num_T;
    private String name_T;
    private String llamada;
    private String mensaje;

    public CTell(int num_T, String name_T, String llamada, String mensaje) {
        this.num_T = num_T;
        this.name_T = name_T;
        this.llamada = llamada;
        this.mensaje = mensaje;

    }

    public int getNum_T() {
        return num_T;
    }

    public void setNum_T(int num_T) {
        this.num_T = num_T;
    }

    public String getName_T() {
        return name_T;
    }

    public void setName_T(String name_T) {
        this.name_T = name_T;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getLlamada() {
        return llamada;
    }

    public void setLlamada(String llamada) {
        this.llamada = llamada;
    }
}
