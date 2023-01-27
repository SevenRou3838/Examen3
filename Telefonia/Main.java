public class Main {
    public static void main(String[] args) {
        Samsung samsung = new Samsung(443183521, "Samsung", "hola soy un llamada", "hola soy un m ensaje");
        Iphone iphone = new Iphone(443183321, "iPhone", "hola soy un llamada", "hola soy un m ensaje");
        Seimens seimens = new Seimens(443283521, "Seimens", "hola soy un llamada", "hola soy un m ensaje");
        Xiami xiami = new Xiami(443183591, "Xiaomi", "hola soy un llamada", "hola soy un m ensaje");
        // Mostramos el uso de herenicia y interfaces esta fuera el diseno original
        // pero queria mostar su uso.Para las funciones de implemnetacion tenia pensado
        // crear unaclase exclusiva para las funciones de esa manera llamarlas y que la
        // operacion se relizara de forma similar acomo llamamos la funcion de las
        // interfaces.

        // El disno consistio de crear las interfaces de las companias y sus servicios
        // aunque comparten los mismos servico queria darles una identidad y desmotrar
        // el uso de la interface.
        // Tambien tenemos los objetos cfreados especificamnete para cada equipo tambien
        // se pouedo aver craedo una clase expclusiva para la marca de cada telefono
        // y tenemos una clase exclisva para las funcipnes llamda CTell mencionado
        // anteriormente como puede observar pase mas tiempo disenado enfocado mas en
        // las clases ,metods,variables y herencia que es en lo que me enfocque mas
        // Gracias por leer profesor
        System.out.println("Equipo: " + samsung.getName_T() + " Numero: " + samsung.getNum_T());
        samsung.TipoTelefono();
        samsung.operador();
        samsung.operador();
        System.out.println("Equipo: " + iphone.getName_T() + " Numero: " + iphone.getNum_T());
        iphone.TipoTelefono();
        iphone.operador();
        iphone.Contrato();
        System.out.println("Equipo: " + seimens.getNum_T() + " Numero: " + seimens.getNum_T());
        seimens.TipoTelefono();
        seimens.operador();
        seimens.Contrato();
        System.out.println("Equipo: " + xiami.getName_T() + " Numero: " + xiami.getNum_T());
        xiami.TipoTelefono();
        xiami.operador();
        xiami.Contrato();
    }
}