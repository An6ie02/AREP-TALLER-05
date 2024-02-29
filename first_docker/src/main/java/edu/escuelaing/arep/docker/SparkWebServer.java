package edu.escuelaing.arep.docker;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class SparkWebServer {
    public static void main(String... args) {
        
        staticFiles.location("/public");
        port(getPort());
        get("sin", (req, res) -> {
            String value = req.queryParams("value");
            return "The sin of " + value + " is " + Math.sin(Double.parseDouble(value));
        });

        get("cos", (req, res) -> {
            String value = req.queryParams("value");
            return "The cos of " + value + " is " + Math.cos(Double.parseDouble(value));
        });

        get("palindrome", (req, res) -> {
            String word = req.queryParams("value");
            return "The word " + word + " is " + (isPalindrome(word) ? "a palindrome" : "not a palindrome");
        });

        get("magnitude", (req, res) -> {
            String x = req.queryParams("value1");
            String y = req.queryParams("value2");
            double[] vector = {Double.parseDouble(x), Double.parseDouble(y)};
            return "The magnitude of the vector (" + x + ", " + y + ") is " + vectorMagnitude(vector);
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    /**
     * Method to check if a word is a palindrome
     * @param word word to check
     * @return true if the word is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * Method to calculate the magnitude of a vector
     * @param vector vector to calculate the magnitude
     * @return magnitude of the vector
     */
    public static double vectorMagnitude(double[] vector) {
        return Math.sqrt(Math.pow(vector[0], 2) + Math.pow(vector[1], 2));
    }
}
