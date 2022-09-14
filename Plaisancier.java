public class Plaisancier extends Main.Bateau {

    private int poidsLege;
    private int poidsNonGere;

    public Plaisancier(int poidsLege, int poidsNonGere, int longueur, int largeur, int hauteur, int tirandeau, int propulsion, int vitesse, char categorie, String matierestransportees, int nbPassager, int poidsmax, int charge, int nbrmembreEquipage) {
        super(longueur, largeur, hauteur, tirandeau, propulsion, vitesse, categorie, matierestransportees, nbPassager, poidsmax, charge, nbrmembreEquipage );

        this.poidsLege = poidsLege;
        this.poidsNonGere = poidsNonGere;
        String newLine = System.getProperty("line.separator");
        System.out.println("Constructeur Plaisancier ok" + newLine + newLine);
    }

    // accesseur de la class Plaisancier

    public int getPoidsLege() {
        return poidsLege;
    }
    public int getPoidsNonGere() {
        return poidsNonGere;
    }

    // mutateur de la class Plaisancier

    public void setPoidsLege (int poidsLege) {
        this.poidsLege = poidsLege;
        // echo "poidsLege ";
    }

    public void setPoidsNonGere (int poidsNonGere) {
        this.poidsNonGere = poidsNonGere;
        // echo "poidsNonGere ";
    }

    // méthodes de la classe Plaisancier
    public void afficherCaracteristiquePlaisancier(Plaisancier plaisancier) {
        String newLine = System.getProperty("line.separator");
        plaisancier.afficherCaractéristiqueBateau(plaisancier);
        System.out.println("poids lège " + plaisancier.getPoidsLege() + newLine);
        System.out.println("poids no géré " + plaisancier.getPoidsNonGere() + newLine + newLine);
    }

    public void chargeNbPassager(Plaisancier plaisancier, int lesPassagers) {
        String newLine = System.getProperty("line.separator");
        lesPassagers = plaisancier.getNbPassager();
        plaisancier.chargeNbPassager(plaisancier, lesPassagers);

        lesPassagers = plaisancier.getNbPassager();

        switch (lesPassagers) {
            case 0:
                System.out.println("Départ impossible ... pas de clients " + plaisancier.getNbPassager() + newLine);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Nombre de passager(s) " + plaisancier.getNbPassager() + newLine);
                plaisancier.afficherBateauPret();
                break;
            default:
                System.out.println("Le nombre de passagers dépasse la limite autorisée : vous avez demandez " + plaisancier.getNbPassager() + "personnes alors que le maximum est de 12 passagers" + newLine);
                break;
        }
    }

    public void chargeNbPassager(Plaisancier plaisancier) {
    }
}
