public class TextFilter {

    String[] paraulesProhibides;


    public String[] getParaulesProhibides() {
        return paraulesProhibides;
    }

    public void setParaulesProhibides(String[] paraulesProhibides) {
        this.paraulesProhibides = paraulesProhibides;
    }

    public TextFilter(String[] paraulesProhibides) {
        this.paraulesProhibides = paraulesProhibides;
    }

    public String filter(String text){
        return "";
    }
}
