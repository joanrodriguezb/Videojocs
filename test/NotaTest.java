class NotaTest {

    public static final int NOTA = 8;
    public static final int NOTA1 = 9;

    @org.junit.jupiter.api.Test
    void setIgetNota() {
        Videojoc videojocTest = new Videojoc("videojoc de prova");
        Usuari usuariTest = new Usuari("usuari de prova");
        Nota notaTest = new Nota(NOTA, usuariTest, videojocTest);
        assert(notaTest.getPuntuacio() == NOTA);
        notaTest.setPuntuacio(NOTA1);
        assert (notaTest.getPuntuacio() == NOTA1);
    }
}