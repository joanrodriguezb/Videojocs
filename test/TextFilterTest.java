import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextFilterTest {

    String [] paraulesProhibides = {"subnormal", "puta", "gilipollas"};

    @Test
    void setIGetParaulesProhibides() {
        TextFilter commentFilter = new TextFilter(new String[]{});
        commentFilter.setParaulesProhibides(paraulesProhibides);
        String[] paraulota = commentFilter.getParaulesProhibides();
        assertEquals(paraulesProhibides, paraulota);
    }

    @Test
    void filter() {
        TextFilter commentFilter = new TextFilter(new String[] {"puta"});
        String filteredComment = commentFilter.filter("cago en la puta");
        assertEquals("cago en la *", filteredComment);
    }
}