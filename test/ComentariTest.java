import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ComentariTest {

    @Test
    void getText() {
        Usuari u = new Usuari("Joan");
        Comentari testcomentari = new Comentari(u,"Hola");
        assertEquals (testcomentari.getText(), "Hola");
    }

    @Test
    void getUsuari() {
        Usuari u = new Usuari("Joan");
        Comentari testcomentari = new Comentari(u,"Hola");
        assertEquals (testcomentari.usuari.getNickname(), "Joan");
    }

    @Test
    void getData() {
        Usuari u = new Usuari("Joan");
        Comentari testcomentari = new Comentari(u,"Hola");
        assertEquals (testcomentari.getData(), LocalDate.from(LocalDate.now()));

    }
    @Test
    void getLikes(){
        Usuari u = new Usuari("Joan");
        Comentari testcomentari = new Comentari(u,"Hola");
        Likes Like = new Like(testcomentari, 1);
        DisLikes DisLike = new DisLike(testcomentari, 1);
        assertEquals(testcomentari.Like, 1);
        assertEquals(testcomentari.DisLike, 1);
    }
}