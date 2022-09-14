public class Tanker extends Main.Bateau {

    public Tanker(int longueur, int largeur, int hauteur, int tirandeau, int propulsion, int vitesse, char categorie, String matierestransportees, int nbPassager, int poidsmax, int charge, int nbrmembreEquipage) {
        super(longueur, largeur, hauteur, tirandeau, propulsion, vitesse, categorie, matierestransportees, nbPassager, poidsmax, charge, nbrmembreEquipage);
    }

    //Methode pour traiter la charge d'un bateau

    public void afficherCaracteristiqueTanker(Tanker tanker) {
        String newLine = System.getProperty("line.separator");
        tanker.afficherCaractéristiqueBateau(tanker);
        System.out.println("Matières Transportées" + tanker.getMatierestransportees() + newLine);
        System.out.println("Pas de passagers transportés " + newLine);
        System.out.println("Poids maximum autorisé " + tanker.getPoidsmax() + newLine);
        System.out.println("Charge actuelle " + tanker.getCharge() + newLine);
        System.out.println("Membres d'équipages au complet " + tanker.getNbrMembreEquipage() + newLine);

    }

    public void traiterTanker(CargoFretMixte tanker) {
        String newLine = System.getProperty("line.separator");
        while (tanker.getCharge() < (tanker.getPoidsmax() * 0.95)) {
            int uneCharge = tanker.getCharge();
            tanker.calculerChargeBateau(tanker, uneCharge);
            System.out.println("Tanker en cours de chargement : charge calculée est de " + tanker.getCharge() + newLine + newLine);
        }

        System.out.println("Le bateau a une charge actuelle de " + tanker.getCharge() + "tonnes pour un poids maximum autorisé de " + tanker.getPoidsmax() + "tonnes" + newLine);
        tanker.afficherBateauPret();
    }


    public void traiterTanker(Tanker tanker) {
    }
}
