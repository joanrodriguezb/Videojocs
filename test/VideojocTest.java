import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideojocTest {

    public static final String NOM_VIDEOJOC = "Return to monkey island";
    public static final String EDAT_PEGI = "PEGI 12";

    @Test
    void getNom() {
        Videojoc videojocDeProva = new Videojoc(NOM_VIDEOJOC);
        String nomDelVideojoc = videojocDeProva.getNom();

        assert(nomDelVideojoc == NOM_VIDEOJOC);
    }

    @Test
    void setiGetEdatRecomanadaPEGI() {
        Videojoc videojocDeProva = new Videojoc(NOM_VIDEOJOC);
        videojocDeProva.setEdatRecomanadaPEGI(EDAT_PEGI);
        assert(videojocDeProva.getEdatRecomanadaPEGI() == EDAT_PEGI);
    }

    @Test
    void setIGetNom() {
        Videojoc videojocDeProva = new Videojoc("lol, però no el que estàs pensant. kñ bfd asfasddfasasfdasfd");
        videojocDeProva.setNom(NOM_VIDEOJOC);
        assert(videojocDeProva.getNom() == NOM_VIDEOJOC);
    }
}