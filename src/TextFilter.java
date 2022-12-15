public class TextFilter {
    public static final String REPLACEMENT = "*";
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
        for (String paraulaProhibida : paraulesProhibides) {
            // TODO millorar eficiència d'aquest mètode.
            text = text.replaceAll(paraulaProhibida, REPLACEMENT);
        }
        return text;
    }
}
