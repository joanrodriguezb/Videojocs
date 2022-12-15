import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VideojocTest {

    public static final String NOM_VIDEOJOC = "Return to monkey island";
    public static final String EDAT_PEGI = "PEGI 12";
    private static final String GENERE = "FPS";
    public static final int NUM_JUGADORS = 2;
    private static final float PREU = 2;
    public static final String AMBIENTACIO = "GUERRA";
    public static final String ANYS = "16 anys";
    public static final String CONTINGUT_ESPECIFIC_PEGI = "Violencia";
    private static final String REQUISITS = "RTX 4090";


    @Test
    void setiGetEdatRecomanadaPEGI() {
        Videojoc videojocDeProva = new Videojoc(NOM_VIDEOJOC);
        videojocDeProva.setEdatRecomanadaPEGI(EDAT_PEGI);
        assert(videojocDeProva.getEdatRecomanadaPEGI().equals(EDAT_PEGI));
    }

    @Test
    void setIGetNom() {
        Videojoc videojocDeProva = new Videojoc("lol, però no el que estàs pensant. kñ bfd asfasddfasasfdasfd");
        videojocDeProva.setNom(NOM_VIDEOJOC);
        assertEquals(videojocDeProva.getNom(), NOM_VIDEOJOC);
    }


    @Test
    void getISetGenere() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);

        videojocTest.setGenere(GENERE);
        String genereDelVideojoc = videojocTest.getGenere();
        assertEquals(GENERE, genereDelVideojoc);
    }

    @Test
    void setIGetNumeroJugadors() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setNumeroJugadors(NUM_JUGADORS);
        assert (testVideojoc.getNumeroJugadors() == NUM_JUGADORS);
    }

    @Test
    void setIgetPreu() {
        Videojoc testPreu = new Videojoc(NOM_VIDEOJOC);
        testPreu.setPreu(PREU);
        assert (testPreu.getPreu() == PREU);
    }

    @Test
    void setIGetPlataformes() {
        Videojoc setGame = new Videojoc(NOM_VIDEOJOC);
        setGame.setPlataformes("plataformes");
        assertEquals("plataformes", setGame.getPlataformes());
    }

    @Test
    void getiSetAmbientacio() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setAmbientacio(AMBIENTACIO);
        String ambientacioDelVideojoc = videojocTest.getAmbientacio();
        assertEquals(ambientacioDelVideojoc, AMBIENTACIO);
    }

    @Test
    void getISetEdatRecomanadaPEGI() {
        String edatRetornada;
        Videojoc videojocTest;

        videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setEdatRecomanadaPEGI(ANYS);
        edatRetornada = videojocTest.getEdatRecomanadaPEGI();
        assertEquals(ANYS, edatRetornada);
    }

    @Test
    void setIGetContingutEspecificPEGI() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setContingutEspecificPEGI(CONTINGUT_ESPECIFIC_PEGI);
        assertEquals(CONTINGUT_ESPECIFIC_PEGI, testVideojoc.getContingutEspecificPEGI());
    }

    @Test
    void setIgetRequisits() {
        Videojoc testRequisits = new Videojoc(NOM_VIDEOJOC);
        testRequisits.setRequisits(REQUISITS);
        assertEquals(testRequisits.getRequisits(), REQUISITS);
    }


    @Test
    void afegirUsuariQueConsulta() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        Usuari usuari = new Usuari("Alejandro");
        testVideojoc.afegirUsuariQueConsulta(usuari);
        Set<Usuari> usuarisQueHanConsultat = testVideojoc.getUsuarisQueHanConsultat();
        assert(usuarisQueHanConsultat.contains(usuari));
    }

    @Test
    void afegirIGetComentari() {
        Usuari usuari = new Usuari("nomDeProva");
        String text = "Text de prova";
        Comentari comentariTest = new Comentari(usuari, text);
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.afegirComentari(comentariTest);
        Set<Comentari> comentaris = testVideojoc.getComentaris();
        assert(comentaris.contains(comentariTest));
    }

    @Test
    void Videojoc() {
        Videojoc videojocDeProva = new Videojoc(NOM_VIDEOJOC);
        assert(videojocDeProva.getNom().equals(NOM_VIDEOJOC));
    }

    @Test
    public void afegirIGetValoracions() {
        Videojoc videojocDeProva = new Videojoc(NOM_VIDEOJOC);
        TipusValoracio tipusValoracioDeProva = new TipusValoracio("Valoracio de prova", true);
        Usuari usuariDeProva = new Usuari("Usuari de prova");
        Valoracio valoracioDeProva = new Valoracio(tipusValoracioDeProva, videojocDeProva, usuariDeProva);
        videojocDeProva.afegirValoracio(valoracioDeProva);
        Valoracio valoracioRetornada = videojocDeProva.getValoracions().iterator().next();
        assertEquals(valoracioDeProva, valoracioRetornada);
    }
}
