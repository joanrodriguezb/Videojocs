import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Comentari {
    private Usuari usuari;
    private String text;
    private LocalDate data;
    private Set<Valoracio> valoracions;


    public Comentari(Usuari usuari, String text) {
        this.usuari = usuari;
        this.text = text;
        data = LocalDate.from(LocalDate.now());
        valoracions = new HashSet<>();
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

    public void afegirValoracio(Valoracio valoracio) {
        valoracions.add(valoracio);
    }

    public Set<Valoracio> getValoracions() {
        return valoracions;
    }
}
