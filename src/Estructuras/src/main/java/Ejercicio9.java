import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> frecuencia = new HashMap<>();

        System.out.println("Introduce palabras (pulsa Enter en blanco para terminar):");

        while (true) {
            String linea = sc.nextLine();

            if (linea.isEmpty()) {
                break;
            }

            String[] palabras = linea.split("\\s+");

            for (String palabra : palabras) {
                palabra = palabra.toLowerCase();
                frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
            }
        }

        System.out.println("\nFrecuencia de cada palabra:");
        for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}