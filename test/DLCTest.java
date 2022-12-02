import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class DLCTest {

    public static final String nomDLC = "The Champions Ballad";
    public static final double preuDLC = 19.95;

    public static final String nomVideojoc = "The Legend Of Zelda: Breath of the Wild";

    private Videojoc videojoc;



    String nomDLCvideojoc = videojoc.getNom();


    @org.junit.jupiter.api.Test
    void setIGetNomDLC() {
        DLC testDLC = new DLC();
        testDLC.setNomDLC(nomDLC);
        assertEquals(nomDLC, testDLC.getNomDLC());
    }

    @org.junit.jupiter.api.Test
    void setIGetPreuDLC() {
        DLC testDLC = new DLC();
        testDLC.setPreuDLC(preuDLC);
        assertEquals(preuDLC, testDLC.getPreuDLC());
    }

    @org.junit.jupiter.api.Test
    void getDlcVideojoc() {
        assertEquals(nomDLCvideojoc, videojoc.getNom());
    }

}