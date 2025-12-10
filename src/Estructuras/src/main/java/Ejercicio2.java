import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> alturas = new ArrayList<>();

        int n = numeroAlumnos(sc);
        leerAlturas(sc, alturas, n);
        double media = calcularMedia(alturas);
        mostrarResultados(alturas, media);
        sc.close();}

    public static int numeroAlumnos(Scanner sc) {
        int n;
        do {
            System.out.print("Introduce el número de alumnos: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("El número de alumnos debe ser mayor que 0.");
            }
        } while (n <= 0);
        return n;
    }

    public static void leerAlturas(Scanner sc, ArrayList<Double> alturas, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la altura del alumno " + (i + 1) + " (en metros): ");
            double altura = sc.nextDouble();
            alturas.add(altura);
        }
    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        double suma = 0;
        for (double altura : alturas) {
            suma += altura;
        }
        return suma / alturas.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media) {
        int contador = 0;
        for (double altura : alturas) {
            if (altura > media) {
                contador++;
            }
        }
        return contador;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media) {
        int contador = 0;
        for (double altura : alturas) {
            if (altura < media) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(ArrayList<Double> alturas, double media) {
        System.out.println("\nAlturas introducidas:");
        for (int i = 0; i < alturas.size(); i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alturas.get(i) + " m");
        }

        int superiores = calcularAlumnosAlturaSuperior(alturas, media);
        int inferiores = calcularAlumnosAlturaInferior(alturas, media);

        System.out.printf("\nAltura media: %.2f m\n", media);
        System.out.println("Alumnos con altura superior a la media: " + superiores);
        System.out.println("Alumnos con altura inferior a la media: " + inferiores);
    }

}