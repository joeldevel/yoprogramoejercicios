public class UsaCirculos {

    public static void main(String[] args) {

//        casos:
//        son el mismo circulo, infinitos puntos
        Circulo c1 = new Circulo(new Punto(0, 0), 1);
        Circulo c2 = new Circulo(new Punto(0, 0), 1);
//        1 punto
//        Circulo c1 = new Circulo(new Punto(0,0), 1);
//        Circulo c2 = new Circulo(new Punto(0,2), 1);

        //        2 puntos
//        Circulo c1 = new Circulo(new Punto(0,0), 1);
//        Circulo c2 = new Circulo(new Punto(1,0), 1);
        //        concenticos, 0 puntos
//        Circulo c1 = new Circulo(new Punto(0,0), 1);
//        Circulo c2 = new Circulo(new Punto(0,0), 2);
        System.out.println("Intersecta con? " + c1.intersectaCon(c2));
    }
}
