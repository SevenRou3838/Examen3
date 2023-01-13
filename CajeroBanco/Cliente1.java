public class Cliente1 extends Cuentas {
    private String date;

    public Cliente1() {

    }

    public Cliente1(int n_cuenta, int nip, Double saldo, Double retiro, Double depsoito, String date) {
        super(n_cuenta, nip, saldo, retiro, depsoito);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
