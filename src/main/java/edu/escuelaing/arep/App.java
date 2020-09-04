package edu.escuelaing.arep;

import edu.escuelaing.arep.calculator.Calculator;
import spark.Request;
import spark.Response;

import java.util.ArrayList;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");
        get("/", (req, res) -> mainPage(req, res));
        get("/calc", (req, res) -> mainPage(req, res));
        get("/results", (req, res) -> resultsBS(req, res));
        double arr[] ={3,60.6,60.5,35,2,45,320,5};
        arr = Calculator.bubbleSort(arr);
        Calculator.printArray(arr);

    }

    /**
     * Obtenemos el puerto automaticamente
     * @return
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }

    /**
     * Donde vamos a solicitar los datos
     * @param req
     * @param res
     * @return
     */
    private static  String mainPage(Request req, Response res){
        String content = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<center>"
                + "<h1>PARCIAL 1 Tercio</h1>"
                + "<h2>AREP</h2>"
                + "<h2>Luis Alejandro Jaramillo</h2>"
                + "<h3>Ingrese los numeros a operar</h3>"
                + "<form action=\"/results\">"
                + "  Ingrese los números separados por coma(,):<br>"
                + "  <input type=\"text\" name=\"num\" placeholder=\"Ej. 1,2.0,3\">"
                + "  <br>"
                + "  <br> <br>"
                + "  <input type=\"submit\" value=\"Enviar\">"
                + "</form>"
                + "</center>"
                + "</body>"
                + "</html>";
        return content;
    }

    /**
     * Los resultados del bubble sort
     * @param req
     * @param res
     * @return
     */
    private static String resultsBS(Request req, Response res) {
        String[] a=req.queryParams("num").split(",");
        String respuesta ="" ;
        double[] dataList = new double[a.length];
        for(int i=0;i<a.length;i++){
            dataList[i] = Double.parseDouble(a[i]);
        }
        double[] listAux = Calculator.bubbleSort(dataList);
        String prom = String.valueOf(Calculator.promedio(dataList));
        String suma = String.valueOf(Calculator.suma(dataList));
        respuesta = String.valueOf(listAux[0]);
        for(int i = 1; i<listAux.length;i++){
            respuesta = respuesta +" , "+ String.valueOf(listAux[i]);
        }
        String pageContent
                = "<!DOCTYPE html>" + "<html>" + "<body>"
                + "<center>" + "<h2>Resultado</h2>"
                + "<h3> BubbleSort: " + respuesta + "</h3>"
                + "<h3> Promedio: " + prom + "</h3>"
                + "<h3> Suma: " + suma + "</h3>"
                + "<p><a href=\"/\">Back</a></p>"
                + "</center>" + "</body>" + "</html>";
        return pageContent;
    }
}
