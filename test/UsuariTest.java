import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UsuariTest {

    public static final String NOM_USER_TEST = "Pere";
    public static final String NOM_JOC_TEST = "LOL";
    public static final String TEXT_COMENTARI_TEST = "Aquest joc està xulo";
    public static final String NOM_TIPUS_VALORACIO = "Valoracio de prova";
    public static final double PUNTUACIO_TEST = 5;

    @Test
    void getNickname() {
        Usuari testUser = new Usuari(NOM_USER_TEST);
        assertEquals(testUser.getNickname(), NOM_USER_TEST);
    }

    @Test
    void getIdentificador() {
        Usuari usuariTest = new Usuari(NOM_USER_TEST);
        String identificadorRetornat = usuariTest.getIdentificador();
        assertEquals(NOM_USER_TEST, identificadorRetornat.substring(0, identificadorRetornat.length() - 5));
    }


    @Test
    void afegirComentari() {
        Usuari usuariTest = new Usuari(NOM_USER_TEST);
        Videojoc videojocTest = new Videojoc(NOM_JOC_TEST);
        usuariTest.afegirComentari(videojocTest, TEXT_COMENTARI_TEST);

        Set<Comentari> comentaris = videojocTest.getComentaris();
        // Obtenir el primer i únic element del Set
        Comentari comentariRetornat = comentaris.stream().findFirst().get();

        assert (comentariRetornat.getUsuari().equals(usuariTest)
                && comentariRetornat.getText().equals(TEXT_COMENTARI_TEST));
    }

    @Test
    void valoraIGetValoracions() {
        Usuari usuariTest = new Usuari(NOM_USER_TEST);
        Videojoc videojocTest = new Videojoc(NOM_JOC_TEST);
        TipusValoracio tipusValoracioDeProva = new TipusValoracio(NOM_TIPUS_VALORACIO, true);
        usuariTest.valora(tipusValoracioDeProva, videojocTest);
        Valoracio valoracioRetornada = usuariTest.getValoracions().iterator().next();
        assertEquals(tipusValoracioDeProva, valoracioRetornada.getTipus());
        assertEquals(videojocTest, valoracioRetornada.getVideojoc());
        assertEquals(usuariTest, valoracioRetornada.getUsuari());
    }

    @Test
    void puntuar() {
        Usuari usuariTest = new Usuari(NOM_USER_TEST);
        Videojoc videojocTest = new Videojoc(NOM_JOC_TEST);
        usuariTest.puntuar(videojocTest, PUNTUACIO_TEST);
        Nota notaDeLUsuari = usuariTest.getNotes().iterator().next();
        assert(notaDeLUsuari.getPuntuacio() == PUNTUACIO_TEST &&
                notaDeLUsuari.getVideojoc() == videojocTest &&
                notaDeLUsuari.getUsuari() == usuariTest);
    }
}