import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Map<String, String> contactos = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("612 345 678");
        telefonos.add("681 435 962");
        contactos.put("Mama", String.valueOf(telefonos));
        contactos.put("Papa", "[634 210 987]");
        contactos.put("Abuelo", "[915 678 234]");
        contactos.put("Josepe", "[932 145 670]");
        telefonos = new ArrayList<>();
        telefonos.add("945 049 827");
        telefonos.add("908 750 254");
        contactos.put("Corbacho", String.valueOf(telefonos));

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
