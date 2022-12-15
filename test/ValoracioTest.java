import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValoracioTest {

    @Test
    void contarNomPositiu() {

    }

    @Test
    void contarNomNegatiu() {
        Valoracio comentari = new Valoracio();
        if (comentari.tipus == true){
            contarNomPositiu();
        } else if (comentari.tipus==false) {
            contarNomNegatiu();
        }
    }
}