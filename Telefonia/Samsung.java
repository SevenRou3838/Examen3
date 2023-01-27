public class Samsung extends CTell implements Att {

    public Samsung(int num_T, String name_T, String llamada, String mensaje) {
        super(num_T, name_T, llamada, mensaje);
    }

    @Override
    public void llamadas() {
        System.out.println("Soy una llamada");

    }

    @Override
    public void Mensaje() {
        System.out.println("Soy un  mensaje");

    }

    @Override
    public void operador() {
        System.out.println("Servicio: AT&T");

    }

    @Override
    public void TipoTelefono() {
        System.out.println("Tipo Telefono: Movil");

    }

    @Override
    public void Contrato() {
        System.out.println("Tipo Contrato: Plan mensual");

    }

}