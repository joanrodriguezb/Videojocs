import java.util.Scanner;
import java.util.Set;

public class Presentacio {
    private Scanner scanner = new Scanner(System.in);


    public void mostrarMenuInicial() {
        System.out.println();
        System.out.println();
        System.out.println("+---------------------+");
        System.out.println("| APLICACIÓ VIDEOJOCS |");
        System.out.println("+---------------------+");
        System.out.println();
    }

    public void mostrarMenuCreacioVideojoc() {
        System.out.println(">> CREACIÓ DE VIDEOJOCS <<");
    }

    public String demanarText() {
        System.out.println("Introdueix el text: (ENTER per sortir)");
        return scanner.nextLine();
    }

    public void mostrarMenuCreacioUsuari() {
        System.out.println(">> CREACIÓ D'USUARIS <<");
    }

    public void mostrarMenuCreacioComentari(Usuari usuari, Videojoc videojoc) {
        System.out.println(">> CREACIÓ DE COMENTARIS [usuari: " + usuari.getIdentificador() +
                "; videojoc: " + videojoc.getNom() + "] <<");
    }

    public void mostrarMenuConsultaVideojoc(Usuari usuari) {
        System.out.println(">> CONSULTA D'UN VIDEOJOC [usuari: " + usuari.getIdentificador() + "] <<");
    }

    public void mostrarOK() {
        System.out.println("OK");
        System.out.println();
    }


    public void mostrarDadesVideojoc(Videojoc videojoc) {
        System.out.println("** DADES DEL VIDEOJOC " + videojoc.getNom() + " **");
        System.out.println("-------------------------------");
        System.out.println("* GÈNERE: " + videojoc.getGenere());
        System.out.println("* NUMERO DE JUGADORS: " + videojoc.getNumeroJugadors());
        System.out.println("* PREU: " + videojoc.getPreu());
        System.out.println("* PLATAFORMES: " + videojoc.getPlataformes());
        System.out.println("* AMBIENTACIÓ: " + videojoc.getAmbientacio());
        System.out.println("* EDAT RECOMANADA (PEGI): " + videojoc.getEdatRecomanadaPEGI());
        System.out.println("* CONTINGUT ESPECÍFIC (PEGI) : " + videojoc.getContingutEspecificPEGI());
        System.out.println("* REQUISITS:\n" + videojoc.getRequisits());
        System.out.println();
    }

    public void mostrarUsuarisQueHanConsultat(Videojoc videojoc) {
        System.out.println("** USUARIS QUE HAN CONSULTAT EL VIDEOJOC " + videojoc.getNom() + " **");
        Set<Usuari> usuarisQueHanConsultat = videojoc.getUsuarisQueHanConsultat();
        for (Usuari usuari : usuarisQueHanConsultat) {
            System.out.println(usuari.getIdentificador());
        }
        System.out.println();
    }

    public void mostrarComentaris(Videojoc videojoc) {
        System.out.println("\n** COMENTARIS DEL VIDEOJOC " + videojoc.getNom() + " **");
        Set<Comentari> comentarisDelVideojoc = videojoc.getComentaris();
        for (Comentari comentari : comentarisDelVideojoc) {
            System.out.println("- " + comentari.getData() + ": " + comentari.getUsuari().getIdentificador());
            System.out.println(comentari.getText());
        }
        System.out.println();
    }
}
