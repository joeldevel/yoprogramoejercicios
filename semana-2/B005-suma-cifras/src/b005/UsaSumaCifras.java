package b005;

public class UsaSumaCifras {
    public static void main(String[] args) {
        
        System.out.println("***** Usar clase SumaCifras *****");
        System.out.println("Sumando cifras de un numero hasta que quede un solo digito. Por ej.");
        System.out.println("1234 = 1 + 2 + 3 + 4 = 10 = 1 + 0 = 1 ; ");
        System.out.println("34567 = " + SumaCifras.sumarCifras(34567));
        System.out.println("6 = " + SumaCifras.sumarCifras(6));
        System.out.println("81 = " + SumaCifras.sumarCifras(81));
        System.out.println("102356 = " + SumaCifras.sumarCifras(102356));
        System.out.println("***** Fin del programa *****");
    }
}
