package src;

import java.util.HashSet;
import java.util.Set;

public class BibliotecaDeVideojocs {
    private Set<Videojoc> videojocs;

    public BibliotecaDeVideojocs() {
        videojocs = new HashSet<>();
    }

    public void afegir(Videojoc videojoc) {
        videojocs.add(videojoc);
    }

    public Videojoc buscar(Usuari usuari, String nomDelVideojoc) {
        Videojoc videojocTrobat = buscar(nomDelVideojoc);
        if (videojocTrobat != null) {
            videojocTrobat.afegirUsuariQueConsulta(usuari);
        }
        return videojocTrobat;
    }

    private Videojoc buscar(String nomDelVideojoc) {
        Videojoc videojocTrobat = null;
        for (Videojoc videojoc : videojocs) {
            if (videojoc.getNom().equals(nomDelVideojoc)) {
                videojocTrobat = videojoc;
            }
        }
        return videojocTrobat;
    }
}
