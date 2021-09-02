package quitarespacios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        // leer archivo
        FileReader fr = null;
        BufferedReader br = null;
        String texto = "";
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader("datos_a_leer.txt");
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea = br.readLine();
            while ((linea != null)) {
                texto += linea;
                linea = br.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }

            System.out.println(texto.replaceAll(" ", ""));
        }

    }
}
