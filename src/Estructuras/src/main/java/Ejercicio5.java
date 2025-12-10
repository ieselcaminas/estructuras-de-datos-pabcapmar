import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Map<String, String> contactos = new HashMap<>();

        contactos.put("Mama", "612 345 678");
        contactos.put("Papa", "634 210 987");
        contactos.put("Abuelo", "915 678 234");
        contactos.put("Josepe", "932 145 670");
        contactos.put("Corbacho", "722 555 010");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre de un contacto: ");
        String nombre = scanner.nextLine();

        String telefono = contactos.get(nombre);

        if (telefono != null) {
            System.out.println("EL telefono de " + nombre + " es " + telefono + ".");
        } else {
            System.out.println("No tengo registrado este contacto" + nombre + ".");
        }
    }
}
