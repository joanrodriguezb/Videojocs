public class DLC {


    /*
     * Atributs
     */
    private String nom;
    private double preu;
    private Videojoc videojoc; //Nom del videojoc del qual es el DLC



    public DLC(String nom, Videojoc videojoc) {
        this.nom = nom;
        this.videojoc = videojoc;
    }


    /*
     * Gets i Sets
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public Videojoc getVideojoc() {
        return videojoc;
    }

}
