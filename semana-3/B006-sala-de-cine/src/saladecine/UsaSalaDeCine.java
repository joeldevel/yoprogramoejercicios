package saladecine;

public class UsaSalaDeCine {

    public static void main(String[] args) {
        SalaDeCine sala = new SalaDeCine(4, 2);
        sala.mostrarButacas();

        System.out.println("Butaca 1 1 ocupada? " + sala.butacaEstaOcupada(1, 1));
        sala.ocupar(1, 1);
        System.out.println("Butaca 1 1 ocupada? " + sala.butacaEstaOcupada(1, 1));

        sala.mostrarButacas();
    }

}
