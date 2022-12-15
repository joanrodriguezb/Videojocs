public class Main {
    private static BibliotecaDeVideojocs biblioteca;
    private static Presentacio presentacio;

    public static void main(String[] args) {
        biblioteca = new BibliotecaDeVideojocs();
        presentacio = new Presentacio();

        crearVideojocsDeMostra();
        crearUsuarisIComentarisDeMostra();
        iniciInteractiu();
    }

    private static void iniciInteractiu() {
        presentacio.mostrarMenuInicial();

        crearVideojocsInteractivament();
        crearUsuarisConsultesIComentarisInteractivament();
    }

    private static void crearVideojocsInteractivament() {
        presentacio.mostrarMenuCreacioVideojoc();
        String nomVideojocCreat = presentacio.demanarText();
        while (!nomVideojocCreat.isBlank()) {
            Videojoc videojocCreat = new Videojoc(nomVideojocCreat);
            biblioteca.afegir(videojocCreat);
            presentacio.mostrarOK();
            presentacio.mostrarMenuCreacioVideojoc();
            nomVideojocCreat = presentacio.demanarText();
        }
    }

    private static void crearUsuarisConsultesIComentarisInteractivament() {
        presentacio.mostrarMenuCreacioUsuari();
        String nomUsuariCreat = presentacio.demanarText();
        while (!nomUsuariCreat.isBlank()) {
            Usuari usuariCreat = new Usuari(nomUsuariCreat);
            presentacio.mostrarOK();
            crearConsultesIComentarisInteractivament(usuariCreat);
            presentacio.mostrarMenuCreacioUsuari();
            nomUsuariCreat = presentacio.demanarText();
        }
    }

    private static void crearConsultesIComentarisInteractivament(Usuari usuari) {
        presentacio.mostrarMenuConsultaVideojoc(usuari);
        String nomVideojocCercat = presentacio.demanarText();
        while (!nomVideojocCercat.isBlank()) {
            Videojoc videojocTrobat = biblioteca.buscar(usuari, nomVideojocCercat);
            presentacio.mostrarOK();
            presentacio.mostrarDadesVideojoc(videojocTrobat);
            presentacio.mostrarUsuarisQueHanConsultat(videojocTrobat);
            crearComentarisInteractivament(usuari, videojocTrobat);
            presentacio.mostrarMenuConsultaVideojoc(usuari);
            nomVideojocCercat = presentacio.demanarText();
        }
    }

    private static void crearComentarisInteractivament(Usuari usuari, Videojoc videojoc) {
        presentacio.mostrarMenuCreacioComentari(usuari, videojoc);
        String textComentariCreat = presentacio.demanarText();
        while (!textComentariCreat.isBlank()) {
            Comentari comentariCreat = new Comentari(usuari, textComentariCreat);
            videojoc.afegirComentari(comentariCreat);
            presentacio.mostrarOK();
            presentacio.mostrarMenuCreacioComentari(usuari, videojoc);
            textComentariCreat = presentacio.demanarText();
        }
        presentacio.mostrarComentaris(videojoc);
    }

    private static void crearVideojocsDeMostra() {
        Videojoc returnToMonkeyIsland = new Videojoc("Return to Monkey Island");
        returnToMonkeyIsland.setGenere("Aventura gràfica");
        returnToMonkeyIsland.setNumeroJugadors(15539);
        returnToMonkeyIsland.setPreu(22.99f);
        returnToMonkeyIsland.setPlataformes("Windows, mac, Switch");
        returnToMonkeyIsland.setAmbientacio("Pirates");
        returnToMonkeyIsland.setEdatRecomanadaPEGI("12");
        returnToMonkeyIsland.setContingutEspecificPEGI("Moderate Violence");
        returnToMonkeyIsland.setRequisits("""
                Windows: MÍNIMO:
                Requiere un procesador y un sistema operativo de 64 bits
                SO: Windows 10
                Procesador: AMD FX-4300 (4 * 3800) or equivalent / Intel Core i3-3240 (2 * 3400) or equivalent
                Memoria: 8 GB de RAM
                Gráficos: Radeon HD 7750 (1024 VRAM) or equivalent / GeForce GT 640 (2048 VRAM) or equivalent
                Almacenamiento: 4 GB de espacio disponible
                RECOMENDADO:
                Requiere un procesador y un sistema operativo de 64 bits
                SO: TBA

                macOS: MÍNIMO:
                Requiere un procesador y un sistema operativo de 64 bits
                SO: MacOS High Sierra and above
                Procesador: AMD FX-4300 (4 * 3800) or equivalent / Intel Core i3-3240 (2 * 3400) or equivalent
                Memoria: 8 GB de RAM
                Gráficos: Radeon HD 7750 (1024 VRAM) or equivalent / GeForce GT 640 (2048 VRAM) or equivalent
                Almacenamiento: 4 GB de espacio disponible
                RECOMENDADO:
                Requiere un procesador y un sistema operativo de 64 bits
                SO: Big Sur""");
        biblioteca.afegir(returnToMonkeyIsland);

        Videojoc videojocDeProva = new Videojoc("Nom de prova");
        videojocDeProva.setGenere("Gènere de prova");
        videojocDeProva.setNumeroJugadors(99);
        videojocDeProva.setPreu(99f);
        videojocDeProva.setPlataformes("Plataforma de prova");
        videojocDeProva.setAmbientacio("Ambientació de prova");
        videojocDeProva.setEdatRecomanadaPEGI("Edat de prova");
        videojocDeProva.setContingutEspecificPEGI("Continguts de prova");
        videojocDeProva.setRequisits("Requisits de prova");
        biblioteca.afegir(videojocDeProva);
    }

    private static void crearUsuarisIComentarisDeMostra() {
        Usuari joan = new Usuari("Joan");
        Videojoc videojoc1 = biblioteca.buscar(joan, "Return to Monkey Island");

        joan.afegirComentari(videojoc1, "Aquest videojoc és molt guay.");
        joan.afegirComentari(videojoc1, """                
                ⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀ ⣀⣀⣤⣤⣤⣀⡀
                ⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀
                ⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆ Ta bueno
                ⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆
                ⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆
                ⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠸⣼⡿
                ⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉
                ⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇compralo
                ⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇
                ⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇
                ⠀⠀ ⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠇
                ⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇
                ⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                """);
        presentacio.mostrarDadesVideojoc(videojoc1);
        presentacio.mostrarComentaris(videojoc1);
        presentacio.mostrarUsuarisQueHanConsultat(videojoc1);

        Usuari josep = new Usuari("Josep");
        Videojoc videojoc2 = biblioteca.buscar(josep, "Return to Monkey Island");
        presentacio.mostrarUsuarisQueHanConsultat(videojoc2);
    }
}