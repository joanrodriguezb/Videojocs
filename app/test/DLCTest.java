import static org.junit.jupiter.api.Assertions.*;

class DLCTest {

    public static final String nom = "The Champions Ballad";
    public static final double prue = 19.95;

    private Videojoc videojoc = new Videojoc();

    @org.junit.jupiter.api.Test
    void setIGetNomDLC() {
        DLC testDLC = new DLC(nom, videjoc);
        testDLC.setNom(nom);
        assertEquals(nom, testDLC.getNom());
    }

    @org.junit.jupiter.api.Test
    void setIGetPreuDLC() {
        DLC testDLC = new DLC(nom, videojoc);
        testDLC.setPreu(prue);
        assertEquals(prue, testDLC.getPreu());
    }

    @org.junit.jupiter.api.Test
    void getDlcVideojoc() {
        assertEquals(videojoc, testVideojoc.getNom());
    }

}