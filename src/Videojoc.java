import java.util.HashSet;
import java.util.Set;

public class Videojoc {
    private String nom;
    private String genere;
    private int numeroJugadors;
    private float preu;
    private String plataformes;
    private String ambientacio;
    private String edatRecomanadaPEGI;
    private String contingutEspecificPEGI;
    private String requisits;

    private Set<Usuari> usuarisQueHanConsultat;
    private Set<Comentari> comentaris;
    public Set<Nota> notes;

    public Set<Usuari> getUsuarisQueHanConsultat() {
        return usuarisQueHanConsultat;
    }


    public Videojoc(String nom) {
        this.nom = nom;
        usuarisQueHanConsultat = new HashSet<>();
        comentaris = new HashSet<>();
        notes = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getNumeroJugadors() {
        return numeroJugadors;
    }

    public void setNumeroJugadors(int numeroJugadors) {
        this.numeroJugadors = numeroJugadors;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public String getPlataformes() {
        return plataformes;
    }

    public void setPlataformes(String plataformes) {
        this.plataformes = plataformes;
    }

    public String getAmbientacio() {
        return ambientacio;
    }

    public void setAmbientacio(String ambientacio) {
        this.ambientacio = ambientacio;
    }

    public String getEdatRecomanadaPEGI() {
        return edatRecomanadaPEGI;
    }

    public void setEdatRecomanadaPEGI(String edatRecomanadaPEGI) {
        this.edatRecomanadaPEGI = edatRecomanadaPEGI;
    }

    public String getContingutEspecificPEGI() {
        return contingutEspecificPEGI;
    }

    public void setContingutEspecificPEGI(String contingutEspecificPEGI) {
        this.contingutEspecificPEGI = contingutEspecificPEGI;
    }

    public String getRequisits() {
        return requisits;
    }

    public void setRequisits(String requisits) {
        this.requisits = requisits;
    }

    public void afegirUsuariQueConsulta(Usuari usuari) {
        usuarisQueHanConsultat.add(usuari);
    }

    public void afegirComentari(Comentari comentari) {
        comentaris.add(comentari);
    }

    public Set<Comentari> getComentaris() {
        return comentaris;
    }

    public void afegirNota(Nota nota) {
        notes.add(nota);
    }

    public double getMitjana() {
        double sumaNotes = 0;
        for (Nota nota : notes) {
            sumaNotes += nota.getPuntuacio();
        }
        return sumaNotes / notes.size();
    }
}
