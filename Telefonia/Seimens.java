public class Seimens extends CTell implements Telmex {

    public Seimens(int num_T, String name_T, String llamada, String mensaje) {
        super(num_T, name_T, llamada, mensaje);

    }

    @Override
    public void operador() {
        System.out.println("Servicio: Telmex");

    }

    @Override
    public void LLamadas() {
        System.out.println("Hola soy una llamada");

    }

    @Override
    public void Mensajes() {
        System.out.println("Hola soy un mensaje");

    }

    @Override
    public void TipoTelefono() {
        System.out.println("Tipo Telefono: Fijo");

    }

    @Override
    public void Contrato() {
        System.out.println("Tipo Contrato: Plan mensual con paqute de internet ");

    }

}
