package edu.escuelaing.arep;

import spark.Request;
import spark.Response;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");
        get("/", (req, res) -> mainPage(req, res));
        //get("/calc", (req, res) -> mainPage(req, res));
        //get("/results", (req, res) -> resultsPage(req, res));
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }

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
                + "  <input type=\"text\" name=\"num\" placeholder=\"Ej. 1,2,3\">"
                + "  <br>"
                + "  <br> <br>"
                + "  <input type=\"submit\" value=\"Enviar\">"
                + "</form>"
                + "</center>"
                + "</body>"
                + "</html>";
        return content;
    }
}
