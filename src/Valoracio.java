public class Valoracio {
    private TipusValoracio tipus;
    private Videojoc videojoc;
    private Usuari usuari;

    public Valoracio(TipusValoracio tipus, Videojoc videojoc, Usuari usuari) {
        this.tipus = tipus;
        this.videojoc = videojoc;
        this.usuari = usuari;
        videojoc.afegirValoracio(this);
    }

    public TipusValoracio getTipus() {
        return tipus;
    }

    public Videojoc getVideojoc() {
        return videojoc;
    }

    public Usuari getUsuari() {
        return usuari;
    }
}