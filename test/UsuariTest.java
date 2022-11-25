import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UsuariTest {

    public static final String NOM_USER_TEST = "Pere";
    public static final String NOM_JOC_TEST = "LOL";
    public static final String TEXT_COMENTARI_TEST = "Aquest joc està xulo";

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
}