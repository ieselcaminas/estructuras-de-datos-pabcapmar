import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9_2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palabras = leerPalabras(sc);
        HashMap<String, Integer> frecuencia = contarFrecuencia(palabras);
        mostrarFrecuencia(frecuencia);
    }

    public static String[] leerPalabras(Scanner sc) {
        System.out.println("Introduce palabras (pulsa Enter en blanco para terminar):");
        String linea;
        StringBuilder todasPalabras = new StringBuilder();

        while (true) {
            linea = sc.nextLine().trim();
            if (linea.isEmpty()) {
                break;
            }
            todasPalabras.append(linea).append(" ");
        }
        return todasPalabras.toString().trim().split("\\s+");
    }

    public static HashMap<String, Integer> contarFrecuencia(String[] palabras) {
        HashMap<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        return frecuencia;
    }

    public static void mostrarFrecuencia(HashMap<String, Integer> frecuencia) {
        System.out.println("\nFrecuencia de cada palabra:");
        for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
