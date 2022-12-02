public class DLC {


    /*
     * Atributs
     */
    private String nomDLC;
    private double preuDLC;
    private Videojoc videojoc; //Nom del videojoc del qual es el DLC


    /*
     * Gets i Sets
     */
    public String getNomDLC() {
        return nomDLC;
    }

    public void setNomDLC(String nomDLC) {
        this.nomDLC = nomDLC;
    }

    public double getPreuDLC() {
        return preuDLC;
    }

    public void setPreuDLC(double preuDLC) {
        this.preuDLC = preuDLC;
    }

    public String getDlcVideojoc() {
        return videojoc.getNom();
    }

}
