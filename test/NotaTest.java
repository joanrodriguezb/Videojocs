import static org.junit.jupiter.api.Assertions.*;

class NotaTest {

    public static final int NOTA = 8;

    @org.junit.jupiter.api.Test
    void setIgetNota() {
        Nota notaTest = new Nota();
        notaTest.setNota(NOTA);
        assert (notaTest.getNota() == NOTA);
    }


}