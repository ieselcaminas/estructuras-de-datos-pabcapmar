import java.util.ArrayList;
import java.util.List;

public class Ahorcado {
    public static void main(String[] args) {
        String palabra = "jordi";
        String propuesta = "taeodir";
        System.out.println(ahorcado(6, palabra,  propuesta));
    }
    public static int ahorcado (int maxFallos, String palabraOculta, String letrasPropuestas){
        List<Character> letrasOcultas = new ArrayList<>();
        List<Character> letrasJugadas = new ArrayList<>();
        int fallosJugador = 0;

        for (Character c : palabraOculta.toCharArray()) {
            if (!letrasOcultas.contains(c))
                letrasOcultas.add(c);
        }

        for (Character letra: letrasPropuestas.toCharArray()) {
            if (!letrasOcultas.contains(letra)) {
                fallosJugador++;
            }else{
                letrasOcultas.remove(letra);
                letrasJugadas.add(letra);
            }
            if (letrasOcultas.isEmpty()) return 1;
            else if (fallosJugador == maxFallos) return 2;
        }
        return 3;
    }
    /*
    public class DibujoAhorcado {
        public static void main(String[] args) {
            for (int i = 0; i <= 6; i++) {
                System.out.println("Fallos: " + i);
                System.out.println(Colors.RED.get() + dibujarAhorcado(i));
                System.out.println("------------------------");
            }

        }
    º*/
        public static String dibujarAhorcado(int fallos) {
            // fallos esperados: 0 a 6
            StringBuilder sb = new StringBuilder();

            sb.append("  +---+\n");
            sb.append("  |   |\n");

            // Cabeza
            if (fallos >= 1) sb.append("  O   |\n");
            else sb.append("      |\n");

            // Parte superior del cuerpo (brazo izq y derecho)
            if (fallos == 2) sb.append("  |   |\n");
            else if (fallos == 3) sb.append(" /|   |\n");
            else if (fallos >= 4) sb.append(" /|\\  |\n");
            else sb.append("      |\n");

            // Parte inferior del cuerpo
            if (fallos >= 5) sb.append("  |   |\n");
            else sb.append("      |\n");

            // Piernas
            if (fallos >= 6) sb.append(" / \\  |\n");
            else sb.append("      |\n");

            sb.append("      |\n");
            sb.append("=========\n");

            return sb.toString();
        }
}

