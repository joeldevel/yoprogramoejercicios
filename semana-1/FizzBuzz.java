class FizzBuzz {

    public static void hacerFizzBuzz() {

        for (int i = 1; i <= 100; i++) {
            if (FizzBuzz.compruebaFizz(i) || FizzBuzz.compruebaBuzz(i)) {
                if (FizzBuzz.compruebaFizz(i)) {
                    System.out.print("Fizz");
                }
                if (FizzBuzz.compruebaBuzz(i)) {
                    System.out.print("Buzz");
                }
                System.out.print("\n");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean compruebaFizz(int x) {
        return x % 3 == 0;
    }

    private static boolean compruebaBuzz(int x) {
        return x % 5 == 0;
    }

}
