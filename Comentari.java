import java.time.LocalDate;

public class Comentari {
    Usuari usuari;
    String text;
    LocalDate data;

    boolean Like;
    boolean DisLike;


    public Comentari(Usuari usuari, String text) {
        this.usuari = usuari;
        this.text = text;
        data = LocalDate.from(LocalDate.now());
    }

    public String getText() {
        return text;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public LocalDate getData() {
        return data;
    }
    public boolean AfegirLike(){
        return Like;
    }
    public boolean AfegirDisLike(){
        return DisLike;
    }
}
