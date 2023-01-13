public class Cuentas {

    private int n_cuenta;
    private int nip;
    private Double saldo;
    private Double retiro;
    private Double deposito;

    public Cuentas() {
    }

    public Cuentas(int n_cuenta, int nip, Double saldo, Double retiro, Double deposito) {
        this.n_cuenta = n_cuenta;
        this.nip = nip;
        this.saldo = saldo;
        this.retiro = retiro;
        this.deposito = deposito;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getRetiro() {
        return retiro;
    }

    public void setRetiro(Double retiro) {
        this.retiro = retiro;
    }

    public Double getDepsoito() {
        return deposito;
    }

    public void setDepsoito(Double deposito) {
        this.deposito = deposito;
    }
}