package edu.escuelaing.arem.ASE.app;

import static spark.Spark.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathServices {
    public static void main(String[] args){
        
        port(getPort());
        get("/linealSearch", (req, res) -> {
            res.type("application/json");
            String inputListStr = req.queryParams("list");
            int[] inputList = Arrays.stream(inputListStr.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int target = Integer.parseInt(req.queryParams("value"));
            int index = linealSearch(inputList, target);
            return "{\"operation\":\"linealSearch\", \"inputlist\":\"" + inputListStr + "\", \"value\":\"" + target + "\", \"output\":\"" + index + "\"}";
        });

        get("/binarySearch", (req, res) -> {
            res.type("application/json");
            String inputListStr = req.queryParams("list");
            int[] inputList = Arrays.stream(inputListStr.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int target = Integer.parseInt(req.queryParams("value"));
            int index = binarySearch(inputList, target);
            return "{\"operation\":\"binarySearch\", \"inputlist\":\"" + inputListStr + "\", \"value\":\"" + target + "\", \"output\":\"" + index + "\"}";
        });




    }

    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int linealSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
