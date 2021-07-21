public class UsaCirculos {

    public static void main(String[] args) {

//        casos:
//        son el mismo circulo, true
//        Circulo c1 = new Circulo(new Punto(0, 0), 1);
//        Circulo c2 = new Circulo(new Punto(0, 0), 1);

//        1 punto, true
//        Circulo c1 = new Circulo(new Punto(0,0), 1);
//        Circulo c2 = new Circulo(new Punto(0,2), 1);

        //        solapados, true
//        Circulo c1 = new Circulo(new Punto(0,0), 1);
//        Circulo c2 = new Circulo(new Punto(1,0), 1);

        //        concentrico, true
//        Circulo c1 = new Circulo(new Punto(0,0), 1);
//        Circulo c2 = new Circulo(new Punto(0,0), 2);


        //        false
        Circulo c1 = new Circulo(new Punto(0,0), 1);
        Circulo c2 = new Circulo(new Punto(3,0), 1);

        System.out.println("Intersecta con? " + c1.intersectaCon(c2));
    }
}
