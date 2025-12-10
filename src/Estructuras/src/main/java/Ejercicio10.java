import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) throws IOException {

        Map<String, List<String>> anagramGroups = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/spanish-dict.txt"));
        String line;

        while ((line = reader.readLine())!=null) {
            String palabra = line.trim();
            if (palabra.isEmpty())continue;
            String clave = alphabetize(palabra);
            anagramGroups.computeIfAbsent(clave, k -> new ArrayList<>()).add(palabra);
        }
        reader.close();

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño mínimo del grupo: ");
        int minGroupSize = sc.nextInt();

        for (List<String> grupo : anagramGroups.values()) {
            if (grupo.size() >= minGroupSize) {
                System.out.println(grupo);
            }
        }
    }
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
