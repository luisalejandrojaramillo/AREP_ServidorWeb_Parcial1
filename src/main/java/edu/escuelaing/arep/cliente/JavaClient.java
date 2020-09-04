package edu.escuelaing.arep.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class JavaClient {

    /**
     * Probamos la conexion
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("JSON MAIN:");
        // Pagina Principal
        URL url1 = new URL("https://arepparcialbs.herokuapp.com/");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }

        System.out.println("JSON RESULTADO:");
        // Pagina resultado con los numeros 45.2 45.1 45 y 21
        URL url2 = new URL("https://arepparcialbs.herokuapp.com/results?num=45.2%2C45.1%2C45%2C1");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url2.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
