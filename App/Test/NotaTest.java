package Test;

import src.Nota;

class NotaTest {

    public static final int NOTA = 8;
    public static final int NOTA1 = 9;

    @org.junit.jupiter.api.Test
    void setIgetNota() {
        Nota notaTest = new Nota(NOTA);
        assert(notaTest.getNota() == NOTA);
        notaTest.setNota(NOTA1);
        assert (notaTest.getNota() == NOTA1);
    }


}