public class Nota {

    private double puntuacio;
    private Usuari usuari;
    private Videojoc videojoc;

    public Nota(double puntuacio, Usuari usuari, Videojoc videojoc) {
        this.puntuacio = puntuacio;
        this.usuari = usuari;
        this.videojoc = videojoc;
        videojoc.afegirNota(this);
    }

    public double getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(double puntuacio) {
        this.puntuacio = puntuacio;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public Videojoc getVideojoc() {
        return videojoc;
    }
}