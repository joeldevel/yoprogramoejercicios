package sumarstrings;

public class SumaStrings {
    
    public static double sumar(String[] strings) {
        double suma = 0;
        for(String s: strings) {
            try {
                suma += Double.parseDouble(s);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        
        return suma;
    }
    
}
