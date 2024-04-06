package edu.escuelaing.arem.ASE.app;

import static spark.Spark.*;

public class ServiceProxy {
    
    private static String[] urlServices = {"", ""};
    private static int service = 0;
    
    public static void main(String[] args){
        staticFiles.location("/public");
        port(getPort());
        urlServices[0] = args[0];
        urlServices[1] = args[1];
        port(getPort());

        get("/linealSearch", (req, res) -> {
            res.type("application/json");
            String list = req.queryParams("list");
            String value = req.queryParams("value");
            return HttpConnectionExample.makeGet(urlToUse()+ "/linealSearch?list="  + list + "&value=" + value);
        });

        get("/binarySearch", (req, res) -> {
            res.type("application/json");
            String list = req.queryParams("list");
            String value = req.queryParams("value");
            return HttpConnectionExample.makeGet(urlToUse() + "/binarySearch?list=" + list + "&value=" + value);
        });


        
    }
    
    private static String urlToUse () {
        String url = urlServices[service];
        if (service == 0) {
            service = 1;
        } else if (service == 1) {
            service = 0;
        }
        return url;
    } 

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 1234;
    }
}
