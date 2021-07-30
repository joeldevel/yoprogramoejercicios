package saladecine;

public class SalaDeCine {

    private Butaca[][] butacas;
    private int cantidadButacasOcupadas;

    //1. Crearla con la cantidad de butacas totales, y cantidad de filas    
    public SalaDeCine(int cantidadButacas, int cantidadFilas) {
        butacas = new Butaca[cantidadFilas][cantidadButacas / cantidadFilas];
        // inicializar todas las butacas
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacas[i][j] = new Butaca();
            }
        }
    }

    //2. Consultar si una butaca está ocupada (referida por fila y asiento)
    public boolean butacaEstaOcupada(int fila, int asiento) {
        return butacas[fila][asiento].estaOcupada();
    }

    //3. Ocupar una butaca determinada, siempre que ésta no esté previamente ocupada
    public void ocupar(int fila, int columna) {
        if (butacas[fila][columna].ocupar()) {
            cantidadButacasOcupadas++;
        }
    }

    //4. Consultar la cantidad total de butacas ocupadas
    public int getOcupadas() {
        return this.cantidadButacasOcupadas;
    }

    //5. Consultar si es posible acomodar a un grupo de X personas, en forma contigua, en la misma fila
    public boolean sePuedeAcomodarContiguo(int cantidadPersonas, int fila) {
        return false;
    }

    public void desocupar(int fila, int columna) {
        if (butacas[fila][columna].desocupar()) {
            cantidadButacasOcupadas--;
        }
    }

    public void mostrarButacas() {
        for (Butaca[] fila : butacas) {
            for (Butaca butaca : fila) {
                System.out.print(butaca.estaOcupada() + " ");
            }
            System.out.println();
        }
    }

    //    how to initialize multidimensional array
//        for (int i = 0; i < multidim.length; i++) {
//    for (int j = 0; j < multidim[i].length; j++) {
//        for (int k = 0; k < multidim[i][j].length; k++) {
//            multidim[i][j][k] = 10;
//        }
//    }
//}
}
