import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<>();

        paises.put("España", "Madrid");
        paises.put("Francia", "París");
        paises.put("Alemania", "Berlín");
        paises.put("Italia", "Roma");
        paises.put("Portugal", "Lisboa");
        paises.put("Inglaterra", "Londres");
        paises.put("Suiza", "Berna");
        paises.put("Bélgica", "Bruselas");
        paises.put("Países Bajos", "Ámsterdam");
        paises.put("Austria", "Viena");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un país europeo: ");
        String pais = scanner.nextLine();

        String capital = paises.get(pais);

        if (capital != null) {
            System.out.println("La capital de " + pais + " es " + capital + ".");
        } else {
            System.out.println("No tengo registrada la capital de " + pais + ".");
        }
    }
}
