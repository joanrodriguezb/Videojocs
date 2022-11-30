import static org.junit.jupiter.api.Assertions.*;

class NotaTest {

    @org.junit.jupiter.api.Test
    void setIgetNota() {
        Nota notaTest = new Nota();
        notaTest.setNota(8);
        assert (notaTest.getNota() == 5);
    }


}