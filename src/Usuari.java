import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class Usuari {
    private final int id;
    private static int ultimId = 0;
    private Set<Valoracio> valoracions;



    private String nickname;
    private String nom;
    private String cognoms;
    private String correu;
    private LocalDate dataNaixement;

    private Set<Nota> notesDeLUsuari;

    public Usuari(String nickname) {
        this.nickname = nickname;
        ultimId++;
        this.id = ultimId;
        valoracions = new HashSet<>();
        notesDeLUsuari = new HashSet<>();
    }

    public String getNickname() {
        return nickname;
    }

    public String getIdentificador() {
        return nickname+"#"+String.format("%04d", id);
    }

    public void afegirComentari(Videojoc videojoc, String textDelComentari) {
        Comentari comentari = new Comentari(this, textDelComentari);
        videojoc.afegirComentari(comentari);
    }

    public void valora(TipusValoracio tipusValoracio, Videojoc videojocAValorar) {
        Valoracio novaValoracio = new Valoracio(tipusValoracio, videojocAValorar, this);
        valoracions.add(novaValoracio);
    }

    public Set<Valoracio> getValoracions() {
        return valoracions;
    }

    public void puntuar(Videojoc videojoc, double puntuacioNota) {
        Nota nota = new Nota(puntuacioNota, this, videojoc);
        notesDeLUsuari.add(nota);
    }

    public Set<Nota> getNotes() {
        return notesDeLUsuari;
    }
}
