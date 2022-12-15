import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ComentariTest {

    @Test
    void getText() {
        Usuari u = new Usuari("Joan");
        Comentari testcomentari = new Comentari(u, "Hola");
        assertEquals(testcomentari.getText(), "Hola");
    }

    @Test
    void getUsuari() {
        Usuari usuariTest = new Usuari("Joan");
        Comentari testcomentari = new Comentari(usuariTest, "Hola");
        assertEquals(testcomentari.getUsuari(), usuariTest);
    }

    @Test
    void getData() {
        Usuari u = new Usuari("Joan");
        Comentari testcomentari = new Comentari(u, "Hola");
        assertEquals(testcomentari.getData(), LocalDate.from(LocalDate.now()));
    }

    @Test
    void afegirIGetValoracions() {
        Usuari usuariTest = new Usuari("Joan");
        Comentari testComentari = new Comentari(usuariTest, "Hola");
        TipusValoracio tipusValoracioTest = new TipusValoracio("valoracio de prova", false);
        Videojoc testVideojoc = new Videojoc("Videojoc de prova");
        Valoracio valoracioTest = new Valoracio(tipusValoracioTest, testVideojoc, usuariTest);
        testComentari.afegirValoracio(valoracioTest);

        Valoracio valoracioRetornada = testComentari.getValoracions().iterator().next();
        assertEquals(valoracioTest, valoracioRetornada);
    }
}