import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ComentariTest {
    static final Usuari usu = new Usuari("USUARI");

    @Test
    void getComentari() {
        Comentari comentari = new Comentari(usu, "Buen Juego");
        assertEquals("Buen Juego", comentari.getText());
    }

    @Test
    void getUsuari() {
        Comentari comentari = new Comentari(usu,"Manolito_22");
        assertEquals(usu, comentari.getUsuari());
    }

    @Test
    void getData() {
        LocalDate abans = LocalDate.now();
        Comentari comentariTest = new Comentari(usu,"text del comentari");
        LocalDate despres = LocalDate.now();
        assert(
                comentariTest.getData().equals(abans)
                ||
                comentariTest.getData().equals(despres)
        );
    }
}