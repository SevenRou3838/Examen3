public class Banco {
    public static void main(String[] args) {
        Cliente1 cuenta1 = new Cliente1(12345678, 1234, 100.800, 40.9, 10.8, "13/01/2023");
        // apartado para ver datos generales no es parte del programa final
        System.out.println("Cuenta1: " + "pasword: " + cuenta1.getN_cuenta() + "nip: " + cuenta1.getNip() + "Saldo: "
                + cuenta1.getSaldo() + "Retiro: " + cuenta1.getRetiro() + "Deposito: " + cuenta1.getDepsoito()
                + "Fecha: " + cuenta1.getDate());
        System.out.println("Necesitas pasword para ingresar");
        boolean verificacion = 12345678 == cuenta1.getN_cuenta();
        if (verificacion) {
            System.out.println(
                    "Axceso consedido  dia: " + cuenta1.getDate() + " Numreo de cuenta: " + cuenta1.getN_cuenta());
            System.out.println("Para hacer operaciones necesitas tu nip: ");
            boolean verificacionNip = 1234 == cuenta1.getNip();
            if (verificacionNip) {
                System.out.println("Axceso consedido: " + cuenta1.getNip());
                System.out.println("Saldo: " + cuenta1.getSaldo());
                System.out.println("Desea retirar: ");
                boolean Retiro = cuenta1.getRetiro() <= cuenta1.getSaldo();
                if (Retiro) {
                    double st = cuenta1.getSaldo() - cuenta1.getRetiro();
                    cuenta1.setSaldo(st);
                    System.out.println("Reiras: " + cuenta1.getRetiro() + " Saldo Actual: " + cuenta1.getSaldo());
                } else {
                    System.out.println("Saldo insuficiente");
                }
                System.out.println("Deseas depositar");
                Double deposito = cuenta1.getSaldo() + cuenta1.getDepsoito();
                cuenta1.setSaldo(deposito);
                System.out.println("Saldo actual: " + cuenta1.getSaldo());
            } else {
                System.out.println("denegado");
            }
        } else {
            System.out.println("denegado");
        }
        System.out.println("Salir");
        // apartado para ver datos generales no es parte del programa final
        System.out.println("Cuenta1: " + "pasword: " + cuenta1.getN_cuenta() + "nip: " + cuenta1.getNip() + "Saldo: "
                + cuenta1.getSaldo() + "Retiro: " + cuenta1.getRetiro() + "Deposito: " + cuenta1.getDepsoito()
                + "Fecha: " + cuenta1.getDate());
    }
}
