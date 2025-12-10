import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AhorcadoTest {

    @Test
    void ahorcado() {
        /*
         2; // Ahorcado
         1; // Gana
         3; // En proceso
         */
        assertAll(
                () -> assertEquals(3, Ahorcado.ahorcado(7, "jazz", "aeiiiiii")),
                () -> assertEquals(2, Ahorcado.ahorcado(7, "ahorcado", "ioaelmnps")),
                () -> assertEquals(1, Ahorcado.ahorcado(7, "holaa", "ohaaal"))
        );
    }
}