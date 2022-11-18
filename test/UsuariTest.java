import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuariTest {

    public static final String nomTestUser = "Pere";

    @Test
    void getNickname() {
        Usuari testUser = new Usuari(nomTestUser);
        assertEquals(testUser.getNickname(), nomTestUser);
    }
}