package edu.escuelaing.arem.ASE.app;
import java.util.ArrayList;
import static spark.Spark.*;

public class MathServices {
    public static void main(String[] args){
        
        port(getPort());
        get("/linealSearch", (req, res) -> {
            res.type("application/json");
            int n = Integer.parseInt(req.queryParams("value"));
            String result = "{\"operation\":\"factors\",\"input\":\"" + n + "\", \"output\":\"";
            //ArrayList<Integer> factorsToAdd = factors(n);
            /*for (int i = 0; i < factorsToAdd.size(); i++) {
                if (i != factorsToAdd.size()-1) {
                    result += factorsToAdd.get(i) + ", ";
                } else {
                    result += factorsToAdd.get(i);
                }
            }*/
            result += "\"}";
            return result;
        });
        
        get("/binarySearch", (req, res) -> {
            res.type("application/json");
            int n = Integer.parseInt(req.queryParams("value"));
            String result = "{\"operation\":\"factors\",\"input\":\"" + n + "\", \"output\":\"";
            result += "\"}";
            return result;
        });
        
        /*port(getPort());
        get("/linealSearch", (req, res) -> {
            list lista = r
            res.type("application/json");
            return " return \"{\\\"message\\\":\\\"Custom 500 handling\\\"}\";";

            lista
            [1,3,4,5,6,7] [8,9,10,11,12]
            indices
            [0,1,2,3,4,5]

            int argumento = 3;

            for (int i = 0; i < lista.length(); i++) {
                if (argumento == lista[i]){
                    respuesta = i;
                } else if (i == lista.length()) {
                    respuesta = -1;
                }
            }
            return respuesta;

        });*/

        



    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
