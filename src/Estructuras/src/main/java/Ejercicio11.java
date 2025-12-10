import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> mapa = new HashMap<>();
        BufferedReader reader = new BufferedReader (new FileReader("src/main/resources/Colfuturo-Seleccionados.csv"));
        String linea;
        String pais;
        int cuantos;
        while ((linea = reader.readLine()) != null) {
            pais = linea.split(",")[6];
            cuantos = mapa.getOrDefault(pais, 0) + 1;
            mapa.put(pais, cuantos);
        }
        System.out.println(mapa.get("Italia"));
    }
}
